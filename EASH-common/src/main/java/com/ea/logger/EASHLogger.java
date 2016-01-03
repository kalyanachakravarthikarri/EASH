/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * EASHLogger : Class which handles all the log statements in EASH application
 * @author Kalyan
 */
public class EASHLogger {
    
    /**
     * Method to retrieve the logger instance for a given class name.
     * @param className - String representation of class name, fully qualified class names are preferred
     *                    Incase the logger is already created same instance is returned
     * @return Logger instance
     */
    public static Logger getLogger(final String className) {
        Logger log = Logger.getLogger(className);
        log.setLevel(Level.ALL);
        return log;
    }
    
}
