/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.card.common;

import com.ea.card.packets.Parser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * Utils : Utility class.
 * @author Kalyan
 */
public class Utils {

    /**
     * Method to read from Input Stream, the lines are read till End of Feed(EOF) is encountered.
     * @param is - Input Stream
     * @return - String 
     * @throws IOException  - Exception thrown in case anything goes wrong with stream
     */
    public static String readFromStream(InputStream is) throws IOException {
        System.out.println("*** Inside readFromStream method ***");
        String nextLine;
        String content = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        while ((nextLine = bufferedReader.readLine()) != null) {
            System.out.println("nextline : " + nextLine);
            if (Parser.EOF.equalsIgnoreCase(nextLine)) {
                break;
            }
            content += nextLine;
        }
        return content;
    }

    /**
     * Method to write to output Stream, the data is written followed by End of Feed(EOF) special sequence.
     * @param os - output Stream
     * @param data - String data to be written
     * @throws IOException - Exception thrown in case anything goes wrong with stream
     */
    public static void writeToStream(OutputStream os, String data) throws IOException {
        System.out.println("*** Inside writeToStream method ***");
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(os));
        printWriter.println(data);
        printWriter.println(Parser.EOF);
        printWriter.flush();
    }

    /**
     * Method to retrieve the logger instance for a given class name.
     * @param className - String representation of class name, fully qualified class names are preferred
     *                    Incase the logger is already created same instance is returned
     * @return Logger instance
     */
    public static Logger getLogger(final String className) {
        Logger log = Logger.getLogger(className);
        return log;
    }
}
