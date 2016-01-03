/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.card.common;

/**
 *
 * @author Kalyan
 */
public interface ErrorCodes {
    
    int OPERATION_SUCCESSFUL = 0000;
    
    int CONNECT_ERROR = 1001;
    int PARSE_ERROR = 1002;
    
    //*** Error codes from card *** pattern :  11**
    int OPEN_CARD_ERROR = 1100;
    int CARD_INSERTION_ERROR = 1101;
    int INVALID_CARD_TYPE_ERROR = 1102;
    int CLOSE_CARD_ERROR = 1103;
    int CARD_READ_ERROR = 1104;
    int CARD_WRITE_ERROR = 1105;
    
    //*** Unknown Error ***
    int UNKNOWN_ERROR = 1111;
    

    
}
