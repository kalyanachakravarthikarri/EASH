/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.exceptions;

/**
 * DALErrorCodes : Error codes at data access layer
 * @author Kalyan
 */
public interface DALErrorCodes {
    int CONNECTION_ERROR = 2001;
    int DATA_RETRIEVAL_ERROR = 2002;
    int DATA_UPDATE_ERROR = 2003;
    int INVALID_SESSION_ERROR = 2004;
    //*** Unknown Error ***
    int DAL_UNKNOWN_ERROR = 2111;
}
