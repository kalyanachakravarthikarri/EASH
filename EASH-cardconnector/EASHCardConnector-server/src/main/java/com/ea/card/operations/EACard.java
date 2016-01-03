/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.card.operations;

import com.ea.card.common.ErrorCodes;
import com.ea.card.connectors.Client;
import com.ea.card.exceptions.CardException;
import com.ea.card.packets.CardOp;
import com.ea.card.packets.Parser;
import java.io.IOException;

/**
 * EACard : The class through which all the card operations are exposed.
 * The application interacts with this Class which in turn communicates with the {@link Server} to execute the card operation
 * @author Kalyan
 */
//TODO Add validations
public class EACard {

    public static final int A3_DATA_SIZE = 8192;
    private Client client;
    private Parser parser;

    public EACard() {
        parser = new Parser();
    }

    /**
     * Opens the reader for performing card operations.
     * This should be invoked before any card operation is performed, 
     * This method establishes connection to Server which performs the required operations.
     * @throws CardException If opening the reader resulted in any error. 
     * The error code {@link ErrorCodes#CONNECT_ERROR} is thrown if unable to establish connection
     */
    public void openReader_64() throws CardException {
        try {
            client = new Client(8888);
        } catch (IOException ex) {
            throw new CardException(ErrorCodes.CONNECT_ERROR);
        }
    }

    /**
     * Method to write contents to the Card.
     * @param data String - data to be written to the card
     * @return boolean value representing the card operation being successful or not
     * @throws CardException thrown in case any exception should occur during writing to card
     */
    public boolean writeCard_64(final String data) throws CardException {
        CardOp cardOp = new CardOp(CardOp.WRITE_TO_CARD, 0, A3_DATA_SIZE, data, -1);
        String request = parser.packetize(cardOp);
        String response = client.send(request);
        cardOp = parser.depacketize(response);
        if (cardOp.getStatusCode() != ErrorCodes.OPERATION_SUCCESSFUL) {
            System.out.println("cardOp.getStatusCode : " + cardOp.getStatusCode());
            throw new CardException(cardOp.getStatusCode());
        }


        return true;
    }

    /**
     * Method to write contents to the Card from a specified start address
     * @param data String - data to be written to the card
     * @param startAddress - start address from where the content should be written
     * @param length - the length in bytes of data that should be read
     * @return boolean value representing the card operation being successful or not
     * @throws CardException thrown in case any exception should occur during writing to card
     */
    public boolean writeCard_64(final String data, final int startAddress, final int length) throws CardException {
        CardOp cardOp = new CardOp(CardOp.WRITE_TO_CARD, startAddress, length, data, -1);
        String request = parser.packetize(cardOp);
        String response = client.send(request);
        cardOp = parser.depacketize(response);
        if (cardOp.getStatusCode() != ErrorCodes.OPERATION_SUCCESSFUL) {
            throw new CardException(cardOp.getStatusCode());
        }
        return true;
    }

    /**
     * Method to read all the data from the card
     * @return String card contents
     * @throws CardException thrown if any thing goes wrong during read
     */
    public String readCard_64() throws CardException {
        CardOp cardOp = new CardOp(CardOp.READ_FROM_CARD, 0, A3_DATA_SIZE, null, -1);
        String request = parser.packetize(cardOp);
        String response = client.send(request);
        cardOp = parser.depacketize(response);
        if (cardOp.getStatusCode() != ErrorCodes.OPERATION_SUCCESSFUL) {
            throw new CardException(cardOp.getStatusCode());
        }
        return cardOp.getBuffer();

    }

    /**
     * Method to erase the entire contents of the card
     * @return boolean value representing the card operation being successful or not
     * @throws CardException thrown if any thing goes wrong during read 
     */
    public boolean eraseCard_64() throws CardException {
        StringBuilder data = new StringBuilder();
        for (int i = 0; i < A3_DATA_SIZE; i++) {
            data.append(" ");
        }
        return writeCard_64(data.toString());
    }

    /**
     * Method to erase the entire contents of the card
     * @return boolean value representing the card operation being successful or not
     * @throws CardException thrown if any thing goes wrong during read 
     */
    public boolean eraseCard_64(final int startAddress, final int length) throws CardException {
        StringBuilder data = new StringBuilder();
        for (int i = 0; i < length; i++) {
            data.append(" ");
        }
        return writeCard_64(data.toString(), startAddress, length);
    }

    /**
     * Method to read all the data from the card, starting from startAddress and upto the length specified
     * @param startAddress - start address from where the content should be written
     * @param length - the length in bytes of data that should be read
     * @return String card contents
     * @throws CardException thrown if any thing goes wrong during read
     */
    public String readCard_64(final int startAddress, final int length) throws CardException {
        CardOp cardOp = new CardOp(CardOp.READ_FROM_CARD, startAddress, length, null, -1);
        String request = parser.packetize(cardOp);
        String response = client.send(request);
        cardOp = parser.depacketize(response);
        if (cardOp.getStatusCode() != ErrorCodes.OPERATION_SUCCESSFUL) {
            throw new CardException(cardOp.getStatusCode());
        }
        return cardOp.getBuffer();
    }

    /**
     * Closes the reader after performing card operations.
     * This should be invoked after all the card operation are performed, 
     * This method closes the connection to Server established during {@link #openReader_64}
     * This sends {@link Parser#SHUT_DOWN_CMD} to the server which in turns closes this connection
     * @throws CardException If closing the reader resulted in any error. 
     * The error code {@link ErrorCodes#CONNECT_ERROR} is thrown if unable to close connection
     */
    public void closeReader_64() throws CardException {
        client.shutDown();
    }

    /*public static void main(String[] args) throws CardException {
    EACard eaCard = new EACard();
    eaCard.openReader_64();
    eaCard.writeCard_64("Baba black sheep");
    System.out.println("data written");
    System.out.println("data read : " + eaCard.readCard_64());
    eaCard.closeReader_64();
    }*/
}
