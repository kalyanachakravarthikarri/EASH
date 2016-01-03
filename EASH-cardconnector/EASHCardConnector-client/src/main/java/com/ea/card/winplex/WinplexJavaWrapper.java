/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.card.winplex;

/**
 * javah -o WinplexJNIWrapper.h -cp dist\CardConnector.jar com.ea.card.winplex.WinplexJavaWrapper
 * @author Kalyan
 */
public class WinplexJavaWrapper {
    
//    static {
//        File currentPath = new File("");
//        System.load(currentPath.getAbsolutePath()+"/Winplex/CppWrapper.dll");
//        //System.loadLibrary("CppWrapper");
//    }
    
    public native long writeToCard(String data, long address, long length);
    
    public native long writeToCard(byte[] data, long address, long length);

    public native String readFromCard(long address, long length);
    
    public native byte[] readBytesFromCard(long address, long length);

    
}
