/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.exceptions;

import com.ea.logger.EASHLogger;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * EASHException : This class wraps any exceptions which may in EASH application.
 * @author Kalyan
 */
public  class EASHException extends Exception{
    /**this class are connecting more sales can remove this telnet
     * Error Code for this exception
     * {@link ErrorCodes} has the error codes
     */
 
    private int errorCode;
    private static final Logger logger = EASHLogger.getLogger(EASHException.class.getName());
    
    private String errorDesc;

    public EASHException(int errorCode) {
        this.errorCode = errorCode;
        
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("EashErrorDescriptions.properties"));
            //ResourceBundle rBundle = ResourceBundle.getBundle("EashErrorDescriptions");
            errorDesc = props.getProperty(""+errorCode);
        } catch (Exception e) {
            logger.warning("Error Descriptions file, EashErrorMessages.properties not found. Continuing with default...");
        }
        
        
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    
    public int getErrorCode(){
        return errorCode;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    
    @Override
    public String toString() {
        return errorCode+" : "+errorDesc;
    }
    
    
}
