/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.exceptions;

import com.ea.exceptions.EASHException;

/**
 * DataAccessException : This class wraps any exceptions which may occur at data access layer.
 * @author Kalyan
 */
public class DataAccessException extends EASHException{

    public DataAccessException(int errorCode) {
        super(errorCode);
    }
    
}
