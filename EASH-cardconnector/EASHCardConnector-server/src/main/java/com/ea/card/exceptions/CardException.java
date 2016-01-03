/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.card.exceptions;

import com.ea.card.common.ErrorCodes;

/**
 * CardException : This class wraps any exceptions which may occur during executing card operations.
 * @author Kalyan
 */
public class CardException extends Exception{
    /**
     * Error Code for this exception
     * {@link ErrorCodes} has the error codes
     */
    int errorCode;
    
    String errorDesc;
    String probableResolution;

    public CardException(int errorCode) {
        this.errorCode = errorCode;
        
        //TODO Initialize errorDesc
        
        //TODO Initialize probable resolution
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public String getProbableResolution() {
        return probableResolution;
    }
    
    
    
    
    
}
