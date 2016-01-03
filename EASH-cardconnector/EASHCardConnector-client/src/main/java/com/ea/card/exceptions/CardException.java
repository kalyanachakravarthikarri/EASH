/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.card.exceptions;

import com.ea.exceptions.EASHException;

/**
 * CardException : This class wraps any exceptions which may occur during executing card operations.
 * @author Kalyan
 */
public class CardException extends EASHException{

    public CardException(int errorCode) {
        super(errorCode);
    }

}
