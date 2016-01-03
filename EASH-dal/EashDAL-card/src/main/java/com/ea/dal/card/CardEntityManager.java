/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.card;

import com.ea.card.exceptions.CardException;
import com.ea.card.operations.EACard;
import com.ea.dal.EntityManager;
import com.ea.dal.entities.EashPHR;
import com.ea.dal.card.entities.CardPHR;
import com.ea.dal.card.exceptions.DalCardErrorCodes;
import com.ea.dal.entities.DiagnosticDetails;
import com.ea.dal.entities.LabTest;
import com.ea.dal.entities.Medication;
import com.ea.dal.entities.PatientInfo;
import com.ea.dal.entities.Surgery;
import com.ea.dal.exceptions.DALErrorCodes;
import com.ea.dal.exceptions.DataAccessException;
import com.ea.logger.EASHLogger;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * CardEntityManager : Entity Manager for Card.
 * @author Kalyan
 */
public class CardEntityManager implements EntityManager {

    private EashPHR eashPHR;
    private CardPHR cardPHR;
    private EACard eaCard;
    private static String existingPHR;//TODO to be used if we plan to update only the changes to card
    private Gson gson = null;
    private boolean sessionStarted;
    private static final Logger logger = EASHLogger.getLogger(CardEntityManager.class.getName());

    public CardEntityManager() {
        eashPHR = new EashPHR();
        cardPHR = new CardPHR();
        eaCard = new EACard();
        gson = new Gson();
    }

    /**
     * Opens a socket connection with 32 bit Card operation server
     * This should be the first operation that must be performed on the DAL-Card-Impl
     * @throws {@link DataAccessException}
     */
    public void startSession() throws DataAccessException {
        //TODO If session already opened throw DUPLICATE SESSION??
        try {
            eaCard.openReader_64();
            setSessionStarted(true);

            //retrieve CardPHR from Card(The card contents are read to memory here itself
            retrievePHRFromCard();

        } catch (CardException ex) {
            logger.log(Level.SEVERE, ex.getErrorDesc(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.CONNECTION_ERROR);
            throw daException;
        }

    }

    /**
     * Retrieve Patient Health Record information from card maps the EashPHR instance and returns it.
     * @return instance of {@link EashPHR}
     * @throws {@link DataAccessException}
     */
    public EashPHR getPatientHealthRecord(final String patientNum) throws DataAccessException {
        if (!isSessionStarted()) {
            throw new DataAccessException(DALErrorCodes.INVALID_SESSION_ERROR);
        }
        if (cardPHR == null) {
            //retrieve CardPHR from Card
            retrievePHRFromCard();
        }
        //map EashPHR
        try {
            MapperFactory factory = new DefaultMapperFactory.Builder().build();
            factory.classMap(CardPHR.class, EashPHR.class).byDefault().register();
            MapperFacade mapper = factory.getMapperFacade();
            PatientInfo patientInfo = mapper.map(cardPHR.getPatientInfo(), PatientInfo.class);
            DiagnosticDetails diagnosticDetails = null;
            if (cardPHR.getDiagnosticDetailsList().size() > 0) {
                diagnosticDetails = mapper.map(cardPHR.getDiagnosticDetailsList().get(cardPHR.getDiagnosticDetailsList().size() - 1), DiagnosticDetails.class);
            }
            LabTest labTest = null;
            if (cardPHR.getLabTestList().size() > 0) {
                labTest = mapper.map(cardPHR.getLabTestList().get(cardPHR.getLabTestList().size() - 1), LabTest.class);
            }
            Medication medication = null;
            if (cardPHR.getMedicationsList().size() > 0) {
                medication = mapper.map(cardPHR.getMedicationsList().get(cardPHR.getMedicationsList().size() - 1), Medication.class);
            }
            Surgery surgery = null;
            if (cardPHR.getSurgeryList().size() > 0) {
                surgery = mapper.map(cardPHR.getSurgeryList().get(cardPHR.getSurgeryList().size() - 1), Surgery.class);
            }
            eashPHR.setPatientInfo(patientInfo);
            eashPHR.setDiagnosticDetails(diagnosticDetails);
            eashPHR.setLabTest(labTest);
            eashPHR.setMedications(medication);
            eashPHR.setSurgery(surgery);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.DAL_UNKNOWN_ERROR);
            throw daException;
        }
        return eashPHR;
    }

    /**
     * Update Patient Health Record information to card.
     * @return true if the update was successful else false
     * @throws {@link DataAccessException}
     */
    public boolean updatePatientHealthRecord(EashPHR phr) throws DataAccessException {
        if (!isSessionStarted()) {
            throw new DataAccessException(DALErrorCodes.INVALID_SESSION_ERROR);
        }
        //boolean updateSuccessful = false;
        eashPHR = phr;
        //map EashPHR
        try {
            MapperFactory factory = new DefaultMapperFactory.Builder().build();
            factory.classMap(EashPHR.class, CardPHR.class).byDefault().register();
            MapperFacade mapper = factory.getMapperFacade();
            com.ea.dal.card.entities.PatientInfo patientInfo = mapper.map(eashPHR.getPatientInfo(), com.ea.dal.card.entities.PatientInfo.class);
            com.ea.dal.card.entities.DiagnosticDetails diagnosticDetails = mapper.map(eashPHR.getDiagnosticDetails(), com.ea.dal.card.entities.DiagnosticDetails.class);
            com.ea.dal.card.entities.LabTest labTest = mapper.map(eashPHR.getLabTest(), com.ea.dal.card.entities.LabTest.class);
            com.ea.dal.card.entities.Medication medication = mapper.map(eashPHR.getMedications(), com.ea.dal.card.entities.Medication.class);
            com.ea.dal.card.entities.Surgery surgery = mapper.map(eashPHR.getSurgery(), com.ea.dal.card.entities.Surgery.class);

            cardPHR.setPatientInfo(patientInfo);
            cardPHR.addDiagnosticDetail(diagnosticDetails);
            cardPHR.addLabTest(labTest);
            cardPHR.addMedication(medication);
            cardPHR.addSurgery(surgery);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.DAL_UNKNOWN_ERROR);
            throw daException;
        }
        saveToCard();
        return true;
    }

    /**
     * Ends the opened session to card
     * This should be the last operation that must be performed on the DAL
     * @throws {@link DataAccessException}
     */
    public void endSession() throws DataAccessException {
        try {
            eaCard.closeReader_64();
            setSessionStarted(false);
        } catch (CardException ex) {
            logger.log(Level.SEVERE, ex.getErrorDesc(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.CONNECTION_ERROR);
            throw daException;
        }
    }

    /**
     * Method to retrieve the PHR from card using {@link EACard} instance
     * @throws DataAccessException 
     */
    private void retrievePHRFromCard() throws DataAccessException {
        {
            try {
                String cardData = eaCard.readCard_64();
                existingPHR = cardData;
                cardPHR = gson.fromJson(cardData, CardPHR.class);
            } catch (CardException ex) {
                logger.log(Level.SEVERE, ex.getErrorDesc(), ex);
                DataAccessException daException = new DataAccessException(DALErrorCodes.DATA_RETRIEVAL_ERROR);
                throw daException;
            } catch (JsonParseException ex) {
                logger.log(Level.SEVERE, ex.getMessage(), ex);
                DataAccessException daException = new DataAccessException(DalCardErrorCodes.INVALID_CONTENT_ERROR);
                throw daException;
            } catch (Exception ex) {
                logger.log(Level.SEVERE, ex.getMessage(), ex);
                DataAccessException daException = new DataAccessException(DALErrorCodes.DAL_UNKNOWN_ERROR);
                throw daException;
            }
        }
    }

    /**
     * Method to update the data to card using {@link EACard} instance.
     * @throws DataAccessException 
     */
    private void saveToCard() throws DataAccessException {

        try {
            String str = gson.toJson(cardPHR);
            eaCard.writeCard_64(str);//TODO store only the differences instead of entire string
        } catch (CardException ex) {
            logger.log(Level.SEVERE, "" + ex.getErrorCode(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.DATA_UPDATE_ERROR);
            throw daException;
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            DataAccessException daException = new DataAccessException(DALErrorCodes.DAL_UNKNOWN_ERROR);
            throw daException;
        }
    }

    public boolean isSessionStarted() {
        return sessionStarted;
    }

    public void setSessionStarted(boolean sessionStarted) {
        this.sessionStarted = sessionStarted;
    }
}
