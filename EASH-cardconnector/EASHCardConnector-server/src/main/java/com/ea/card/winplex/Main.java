/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.card.winplex;

import com.ea.dal.entities.PatientInfo;
import com.ea.dal.entities.EashPHR;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *javah -o WinplexJNIWrapper.h -cp dist\CardConnector.jar com.ea.card.winplex.WinplexJavaWrapper
 * @author Kalyan
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Gson gson = new Gson();
        try {
            WinplexJavaWrapper winplexJavaWrapper = new WinplexJavaWrapper();
            PodamFactory factory = new PodamFactoryImpl(); //This will use the default Random Data Provider Strategy
            PatientInfo patientInfo = factory.manufacturePojo(PatientInfo.class);
            EashPHR phr = new EashPHR();
            phr.setPatientInfo(patientInfo);
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            FileOutputStream fos = new FileOutputStream("D:/phr.ser");
//            oos = new ObjectOutputStream(fos);
//            oos.writeObject(phr);
//            fos.close();
//            System.out.println("--> " + phr.getPatientInfo().getFirstName());
            //String dataWritten = gson.toJson(phr, EashPHR.class);
//            String dataWritten = "asdddddddddddddddddddddsadsadgadsgasa";
//            String dataCompressed = compress(dataWritten);
//            System.out.println(dataWritten.length() + "~~~" + dataCompressed.length());
//            System.out.println("writeToCard : " + winplexJavaWrapper.writeToCard(baos.toByteArray(), 0, 8192));
//            //System.out.println("data written " + dataCompressed);
//            String dataRead = winplexJavaWrapper.readFromCard(0, 8192);
//            System.out.println("data read " + new String(dataRead));
//            String originalData = decompress(dataRead);
//            ByteArrayInputStream bais = new ByteArrayInputStream(dataRead.getBytes());
//            ois = new ObjectInputStream(bais);
//            EashPHR phrNew = (EashPHR) ois.readObject();
//            System.out.println("--> " + phrNew.getPatientInfo().getFirstName());
            //System.out.println("result "+new String(winplexJavaWrapper.readBytesFromCard(0, 8192)));
            FileInputStream fis = new FileInputStream("D:/phr.ser");
            ois = new ObjectInputStream(fis);
            EashPHR phr1 = (EashPHR) ois.readObject();
            System.out.println("--->" + phr1.getPatientInfo().getFirstName());
            fis.close();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oos.close();
            //ois.close();
        }
    }

    public static String compress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        System.out.println("String length : " + str.length());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes());
        gzip.close();
        String outStr = out.toString("ISO-8859-1");
        System.out.println("Output String lenght : " + outStr.length());
        return outStr;
    }

    public static String decompress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        System.out.println("Input String length : " + str.length());
        GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(str.getBytes("ISO-8859-1")));
        BufferedReader bf = new BufferedReader(new InputStreamReader(gis, "ISO-8859-1"));
        String outStr = "";
        String line;
        while ((line = bf.readLine()) != null) {
            outStr += line;
        }
        System.out.println("Output String lenght : " + outStr.length());
        return outStr;
    }

    /*public static void main(String[] args) {
    try {
    WinplexJavaWrapper winplexJavaWrapper = new WinplexJavaWrapper();
    String str = "abcdldskjfladskfjldskfjsldfjalsdfjalsdfjsdkfjasldfjasldkfjsldkfjsdljkfsdlfjksdlfjkal;skdjflkjdsfilkjdfiosd;djafivjkjfim";
    System.out.println("data written "+new String(str.getBytes()));
    winplexJavaWrapper.writeToCard(new String(str.getBytes()), 0, 8192);
    String dataRead = winplexJavaWrapper.readFromCard(0, 8192);
    System.out.println("data read : "+dataRead);
    } catch (Exception e) {
    }
    }*/
}
