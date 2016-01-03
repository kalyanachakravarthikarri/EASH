/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal;

import com.ea.dal.entities.EashPHR;
import com.ea.dal.exceptions.DataAccessException;

/**
 * EntityManager : This interface is used to retrieve required entities from various data sources
 * @author Kalyan
 */
public interface EntityManager {
    
    /**
     * Starts a logical session with the data repositories
     * This should be the first operation that must be performed on the DAL
     * @throws {@link DataAccessException}
     */
    public void startSession() throws DataAccessException;
    
    /**
     * Retrieve Patient Health Record from underlying data source.
     * @return instance of {@link EashPHR}
     * @throws {@link DataAccessException}
     */
    EashPHR getPatientHealthRecord(final String patientNum) throws DataAccessException;
    
    /**
     * Update Patient Health Record to underlying data source.
     * @return true if the update was successful else false
     * @throws {@link DataAccessException}
     */
    boolean updatePatientHealthRecord(EashPHR phr) throws DataAccessException;
    
    /**
     * Ends the opened session
     * This should be the last operation that must be performed on the DAL
     * @throws {@link DataAccessException}
     */
    public void endSession() throws DataAccessException;
    
}
