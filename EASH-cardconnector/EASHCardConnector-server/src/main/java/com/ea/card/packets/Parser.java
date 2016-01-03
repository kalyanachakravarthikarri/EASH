/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.card.packets;

import com.ea.card.common.ErrorCodes;
import com.ea.card.common.Utils;
import com.ea.card.exceptions.CardException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Parser : This class is used to marshall and unmarshall the {@link CardOp} instance so that it may be 
 *          sent over the network
 * @author Kalyan
 */
//TODO Should java serialization be used instead??
public class Parser {
    
    private static final Logger logger = Utils.getLogger(Parser.class.getName());

    final String startPattern = "@@@@";//Start Pattern
    final String endPattern = "####";//End Pattern
    final String delimiterPattern = "!!!!";//Delim Pattern
        
    public static final String EOF = "$$EOF@@"; // End Of Feed
    public static final String CARD_ERROR = "CARD_ERROR_";//Card Error
    public static final String SHUT_DOWN_CMD = "SHUTDOWN";//Shut Down command

    /**
     * Method to convert the card operation into string representation.
     * @param cardOp instance of card operation
     * @return String representation of the card Operation
     */
    public String packetize(final CardOp cardOp) {
        StringBuilder data = new StringBuilder(startPattern);
        data.append(cardOp.getOpName());
        data.append(delimiterPattern);
        data.append(cardOp.getStatusCode());
        data.append(delimiterPattern);
        data.append(cardOp.getAddress());
        data.append(delimiterPattern);
        data.append(cardOp.getLength());
        data.append(delimiterPattern);
        data.append(cardOp.getBuffer());
        data.append(endPattern);
        return data.toString();
    }

    /**
     * Method to convert the payload received over socket into Card Operation instance.
     * @param payLoad String representation of the card Operation
     * @return instance of CardOp
     * @throws CardException  Card Exception is thrown in case of any parse exception(For error codes of CardException refer to {@link ErrorCodes}
     */
    public CardOp depacketize(final String payLoad) throws CardException {
        if (!payLoad.contains(startPattern) || !payLoad.contains(endPattern)) {
            throw new CardException(ErrorCodes.PARSE_ERROR);
        }
        logger.log(Level.INFO, "data before removing start and end patterns : {0}", payLoad);
        String data = payLoad.substring(payLoad.indexOf(startPattern) + 4, payLoad.indexOf(endPattern));
        logger.log(Level.INFO, "data after removing start and end patterns : {0}", data);
        String[] tokens = data.split(delimiterPattern);
        logger.log(Level.INFO, "total # of tokens : {0}", tokens.length);
        logger.log(Level.INFO, "token[0] + {0}", tokens[0]);
        String opName = null, buffer = null;
        long address = 0, length = 0;
        int statusCode;
        if (tokens.length == 5) {
            opName = tokens[0];
            statusCode = Integer.parseInt(tokens[1]);
            address = Long.parseLong(tokens[2]);
            length = Long.parseLong(tokens[3]);
            buffer = tokens[4];
        } else {
            throw new CardException(ErrorCodes.PARSE_ERROR);
        }
        CardOp cardOp = new CardOp(opName, address, length, buffer, statusCode);
        return cardOp;
    }
}
