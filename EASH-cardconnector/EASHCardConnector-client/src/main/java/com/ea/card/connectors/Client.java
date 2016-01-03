/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.card.connectors;

import com.ea.card.common.ErrorCodes;
import com.ea.card.common.Utils;
import com.ea.card.exceptions.CardException;
import com.ea.card.packets.Parser;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Client : The class responsible to send byte stream to server and get the response back.
 * This class is supposed to run on 64 bit JRE and establish connection with the {@link Server} running on 32 bit JRE
 * @author Kalyan
 */
public class Client {

    //private HttpURLConnection httpURLCon;
    private Socket socket;
    //private static URL url;

    public Client(final int port) throws IOException {
        socket = new Socket(InetAddress.getLocalHost(), port);
        //url = new URL(urlStr);
    }

    /**
     * Send byte stream to the listening server and get the response back.
     * @param payLoad Data to be sent to the Server
     * @return The Response String returned from Server
     * @throws CardException If any thing goes wrong with the underlying Stream during reading or writing. 
     *  The ErrorCode is {@link ErrorCodes#CONNECT_ERROR}
     */
    public String send(final String payLoad) throws CardException {
        String response = null;

        try {
            //send data
            Utils.writeToStream(socket.getOutputStream(), payLoad);
            System.out.println("Socket.isclosed : " + socket.isClosed());

            //read response
            response = Utils.readFromStream(socket.getInputStream());

        } catch (IOException ex) {
            throw new CardException(ErrorCodes.CONNECT_ERROR);
        }
        //return the response
        return response;

    }

    /**
     * ShutDown the connection established with the {@link Server}.
     * {@link Parser#SHUT_DOWN_CMD} is sent to notify the server to close down this connection.
     * @throws CardException 
     */
    public void shutDown() throws CardException {
        try {
            Utils.writeToStream(socket.getOutputStream(), Parser.SHUT_DOWN_CMD);
            socket.close();
        } catch (IOException ex) {
            throw new CardException(ErrorCodes.CONNECT_ERROR);
        }
    }
}
