/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.card.packets;

import com.ea.card.winplex.WinplexJavaWrapper;

/**
 *
 * @author Kalyan
 */
public class CardOp{

    public static final String READ_FROM_CARD = "0001";//Op code for read operation
    public static final String WRITE_TO_CARD = "0010";//Op code for write operation
    private String opName;
    private long address;
    private long length;
    private int statusCode = 0;
    private String buffer;
    private WinplexJavaWrapper winplexJavaWrapper;

    public CardOp(String argOpName, long address, long length, String buffer, int statusCode) {
        this.opName = argOpName;
        this.address = address;
        this.length = length;
        this.buffer = buffer;
        this.statusCode = statusCode;
        winplexJavaWrapper = new WinplexJavaWrapper();
    }

    public String getBuffer() {
        return buffer;
    }

    public void setBuffer(String returnValue) {
        this.buffer = returnValue;
    }

    public long getAddress() {
        return address;
    }

    public long getLength() {
        return length;
    }

    public String getOpName() {
        return opName;
    }

    public int getStatusCode() {
        return statusCode;
    }
    
    
    public void execute() {
        if (READ_FROM_CARD.equalsIgnoreCase(opName)) {
            buffer = winplexJavaWrapper.readFromCard(address, length);
            if(buffer.contains(Parser.CARD_ERROR)){
                statusCode =Integer.parseInt( buffer.substring(Parser.CARD_ERROR.length()));
            }else{
                statusCode = 0;
            }
        } else if (WRITE_TO_CARD.equalsIgnoreCase(opName)) {
            statusCode = (int) winplexJavaWrapper.writeToCard(buffer, address, length);
        }

    }
}
