/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.db;

import com.ea.dal.EntityManager;
import com.ea.dal.db.entities.DbPHR;
import com.ea.dal.db.entities.EmrDiagnosisDetails;
import com.ea.dal.db.entities.EmrLabTests;
import com.ea.dal.db.entities.EmrMedications;
import com.ea.dal.db.entities.EmrPatients;
import com.ea.dal.db.entities.EmrSurgeries;
import com.ea.dal.entities.EashPHR;
import com.ea.dal.exceptions.DALErrorCodes;
import com.ea.dal.exceptions.DataAccessException;
import com.ea.logger.EASHLogger;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * DBEntityManager : EntityManager for DB
 * @author Kalyan
 */
public class DBEntityManager implements EntityManager {

    private EntityManagerFactory emf = null;
    private javax.persistence.EntityManager eManager = null;
    private EashPHR eashPHR;
    private DbPHR dbPhr;
    private static final Logger logger = EASHLogger.getLogger(DBEntityManager.class.getName());

    public DBEntityManager() {
        eashPHR = new EashPHR();
        dbPhr = new DbPHR();
    }

    /**
     * This method starts a DB session. 
     * This should be the first method that should be invoked before any db operations.
     * @throws DataAccessException 
     */
    @Override
    public void startSession() throws DataAccessException {
        logger.entering(this.getClass().getName(), "startSession");
        try {
            emf = Persistence.createEntityManagerFactory("EmrPU");
            eManager = emf.createEntityManager();
            if (eManager == null) {
                throw new Exception("Unable to retrieve EntityManager");
            }
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.CONNECTION_ERROR);
            throw daException;
        }
        logger.exiting(this.getClass().getName(), "startSession");
    }

    /**
     * Method to retrieve PHR from local DB.
     * The DB PHR retrieved and EashPHR have difference in the fields they contain,
     * this method retrieves a DB PHR and maps the relevant fields to EashPHR and returns that instance.
     * @param patientNum - String patient Id
     * @return EashPHR instance for the patient id
     * @throws DataAccessException  thrown if there were any db exceptions during the retrieval
     */
    @Override
    public EashPHR getPatientHealthRecord(final String patientNum) throws DataAccessException {
        retrievePHRFromDb(patientNum);
        try {
            MapperFactory factory = new DefaultMapperFactory.Builder().build();
            factory.classMap(DbPHR.class, EashPHR.class).byDefault().register();
            MapperFacade mapper = factory.getMapperFacade();
            eashPHR = mapper.map(dbPhr, EashPHR.class);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.DAL_UNKNOWN_ERROR);
            throw daException;
        }
        return eashPHR;
    }

    /**
     * Update a given EashPHR instance to DB. 
     * First a DB PHR instance is created for the EashPHR instance passed and that created instance
     * is persisted onto the DB.
     * @param phr EashPHR instance
     * @return boolean denoting the update status
     * @throws DataAccessException thrown if in case of any DB errors during the processs
     */
    public boolean updatePatientHealthRecord(EashPHR phr) throws DataAccessException {
        eashPHR = phr;
        try {
            MapperFactory factory = new DefaultMapperFactory.Builder().build();
            factory.classMap(EashPHR.class, DbPHR.class).byDefault().register();
            MapperFacade mapper = factory.getMapperFacade();
            dbPhr = mapper.map(eashPHR, DbPHR.class);
            updateDb();
            return true;
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.DAL_UNKNOWN_ERROR);
            throw daException;
        }
    }

    /**
     * Ends the DB session that was opened during openSession method.
     * @throws DataAccessException if any exception occurs during the operation.
     */
    public void endSession() throws DataAccessException {
        try {
            eManager.close();
            emf.close();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.CONNECTION_ERROR);
            throw daException;
        }
    }

    private void retrievePHRFromDb(final String patientNum) throws DataAccessException {
        try {
            BigInteger patientId = new BigInteger(patientNum);
            eManager.getTransaction().begin();
            //TODO the queries need to be changed to include visitId.
            EmrPatients patientInfo = (EmrPatients) eManager.createNamedQuery("EmrPatients.findByPatientId").setParameter("patientId", patientId).getSingleResult();
            EmrDiagnosisDetails diagnosticDetails = (EmrDiagnosisDetails) eManager.createNamedQuery("EmrDiagnosisDetails.findByPatientId").setParameter("patientId", patientId).getSingleResult();
            EmrSurgeries surgery = (EmrSurgeries) eManager.createNamedQuery("EmrSurgeries.findByPatientId").setParameter("patientId", patientId).getSingleResult();
            EmrMedications medications = (EmrMedications) eManager.createNamedQuery("EmrMedications.findByPatientId").setParameter("patientId", patientId).getSingleResult();
            EmrLabTests labTest = (EmrLabTests) eManager.createNamedQuery("EmrLabTests.findByPatientId").setParameter("patientId", patientId).getSingleResult();
            eManager.getTransaction().commit();
            dbPhr.setPatientInfo(patientInfo);
            dbPhr.setDiagnosticDetails(diagnosticDetails);
            dbPhr.setLabTest(labTest);
            dbPhr.setSurgery(surgery);
            dbPhr.setMedications(medications);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.DATA_RETRIEVAL_ERROR);
            throw daException;
        }
    }

    private void updateDb() throws DataAccessException {
        try {
            eManager.getTransaction().begin();
            eManager.merge(dbPhr.getPatientInfo());
            eManager.merge(dbPhr.getDiagnosticDetails());
            eManager.merge(dbPhr.getLabTest());
            eManager.merge(dbPhr.getMedications());
            eManager.merge(dbPhr.getSurgery());
            eManager.getTransaction().commit();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.DATA_RETRIEVAL_ERROR);
            throw daException;
        }
    }
}
