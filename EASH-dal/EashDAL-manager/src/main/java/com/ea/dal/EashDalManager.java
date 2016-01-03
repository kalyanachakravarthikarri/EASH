package com.ea.dal;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.ea.dal.card.CardEntityManager;
import com.ea.dal.db.DBEntityManager;
import com.ea.dal.entities.EashPHR;
import com.ea.dal.exceptions.DataAccessException;
import com.ea.logger.EASHLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * EashDalManager : This class manages all the interactions to data in EASH applications.
 * TODO : 
 * 1. Current implementation depends on the following implementations 
 *  Prioritization : Db Implementation takes high priority, the retrieval is done from DB.
 *  Synchronization: The update is done to both the Card and Db
 * 
 * 2. Exception handling needs to be improved
 * 
 * @author Kalyan
 */
public class EashDalManager {

    private static final Logger logger = EASHLogger.getLogger(EashDalManager.class.getName());
    private List<EntityManager> entityManagersList = new ArrayList<EntityManager>();
    private EntityManager primaryEm = null;
    private List<DataAccessException> errors = null;

    public EashDalManager() {
        primaryEm = new DBEntityManager();
        entityManagersList.add(primaryEm);
        entityManagersList.add(new CardEntityManager());
        errors = new ArrayList<DataAccessException>();
    }

    /**
     * Starts a logical session with the data repositories
     * This should be the first operation that must be performed on the DAL
     * @throws {@link DataAccessException}
     */
    public void startSession() throws DataAccessException {
        DataAccessException dEx = null;
        errors.clear();
        for (EntityManager em : entityManagersList) {
            try {
                em.startSession();
            } catch (DataAccessException ex) {
                errors.add(ex);
                dEx = ex;
            }
        }
        if (dEx != null) {
            throw dEx;
        }
    }

    /**
     * Retrieve {@link EashPHR} instance
     * @return PHR instance
     * @throws {@link DataAccessException}
     */
    public EashPHR retrievePHR(final String patientId) throws DataAccessException {
        EashPHR eashPhr = primaryEm.getPatientHealthRecord(patientId);
        eashPhr = (eashPhr == null)?new EashPHR() : eashPhr;
        return eashPhr;
    }

    /**
     * Update {@link EashPHR} instance
     * @param phr PHR having fields to be updated
     * @return boolean representing whether update has been successful or not.
     * @throws {@link DataAccessException}
     */
    public boolean updatePHR(EashPHR phr) throws DataAccessException {
        boolean phrUpdated = false;
        errors.clear();
        DataAccessException dEx = null;
        for (EntityManager em : entityManagersList) {
            try {
                phrUpdated = phrUpdated || em.updatePatientHealthRecord(phr);
            } catch (DataAccessException ex) {
                errors.add(ex);
            }
        }
        if (dEx != null) {
            throw dEx;
        }
        return phrUpdated;
    }

    /**
     * Ends the opened session
     * This should be the last operation that must be performed on the DAL
     * @throws {@link DataAccessException}
     */
    public void endSession() throws DataAccessException {
        DataAccessException dEx = null;
        errors.clear();
        for (EntityManager em : entityManagersList) {
            try {
                em.endSession();
            } catch (DataAccessException ex) {
                errors.add(ex);
                dEx = ex;
            }
        }
        if (dEx != null) {
            throw dEx;
        }
    }

    /**
     * 
     * @param em 
     */
    public void addEntityManager(EntityManager em) {
        entityManagersList.add(em);
    }
    
    public List<DataAccessException> getErrors(){
        return errors;
    }
}
