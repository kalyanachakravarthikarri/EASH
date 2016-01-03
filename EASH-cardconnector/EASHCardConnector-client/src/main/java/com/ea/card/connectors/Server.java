/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.card.connectors;

import com.ea.card.common.Utils;
import com.ea.card.packets.CardOp;
import com.ea.card.packets.Parser;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Server : The Server Class listens continuously on the port and accepts any connection from {@link Client}.
 * This class is intended to run on 32 bit JRE and interacts with the underlying Card DLLs using JNI
 * @author Kalyan
 */
public class Server {

    private ServerSocket serverSocket;
    private boolean shutDown = false;
    private static final Logger logger = Utils.getLogger(Server.class.getName());

    public Server() throws IOException {
        this.serverSocket = new ServerSocket(8888);

    }

    public void listen() {
        while (!shutDown) {
            try {
                logger.info("Listening at port 8888");
                Socket socket = serverSocket.accept();
                logger.info("got a connection");
                WorkerThread worker = new WorkerThread(socket);
                logger.log(Level.INFO, "starting worker thread {0}", worker.getName());
                worker.start();
            } catch (IOException ex) {
                logger.severe(ex.getMessage());
            }
        }
    }

    public void shutDown() {
        logger.info("Shutting down the Listner");
        shutDown = true;
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.listen();
    }
}

class WorkerThread extends Thread {

    private Socket socket;
    private Parser parser;
    private boolean shutDown = false;

    public WorkerThread(Socket socket) {
        this.socket = socket;
        this.parser = new Parser();
    }

    @Override
    public void run() {
        while (!shutDown) {
            try {
                String request = Utils.readFromStream(socket.getInputStream());
                if (isShutDownCmd(request)) {
                    break;
                }
                System.out.println("Request received : " + request);

                //depacketize
                CardOp cardOp = parser.depacketize(request);
                System.out.println("CardOp created");

                //execute the method
                cardOp.execute();
                System.out.println("Operation executed");

                //packetize the result
                String result = parser.packetize(cardOp);
                System.out.println("Response created : " + result);

                //send the data back
                Utils.writeToStream(socket.getOutputStream(), result);
                System.out.println("Response sent successfully");

            } catch (IOException ex) {
                Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                shutDown();
            }
        }
        System.out.println("thread closed");
    }

    private boolean isShutDownCmd(final String request) {
        if (Parser.SHUT_DOWN_CMD.equalsIgnoreCase(request)) {
            shutDown = true;
        }
        return shutDown;
    }
    public void shutDown(){
        shutDown = true;
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
