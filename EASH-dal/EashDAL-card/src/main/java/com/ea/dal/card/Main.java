/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.card;

import com.ea.dal.entities.DiagnosticDetails;
import com.ea.dal.entities.EashPHR;
import com.ea.dal.entities.LabTest;
import com.ea.dal.entities.PatientInfo;
import com.ea.dal.entities.Surgery;
import com.ea.dal.exceptions.DataAccessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *
 * @author Kalyan
 */
public class Main {

    public static void main(String[] args) {
//        String str1 = "?The quick brown fox jumps over the lazy dog";
//        String str2 = "The quick brown fox jumpsKalyan over the lazy dog";
//        diff_match_patch diff = new diff_match_patch();
//        List<diff_match_patch.Diff> differences = diff.diff_main(str1, str2);
//        System.out.println(differences);
//        System.out.println("str1 : " + str1);
//        StringBuilder sb = new StringBuilder();
//        for (byte b : str1.getBytes()) {
//            sb.append(Byte.toString(b)).append(",");
//        }
//        System.out.println("sb : " + sb.toString());
//        System.out.println("sb String : "+str1.getBytes().length);
//        String str = null;
//        System.out.println("sb bytearray length : "+sb.toString().getBytes().length);
//        byte[] reversedBytes = new byte[sb.toString().getBytes().length];
//        int i = 0;
//        for(String s : sb.toString().split(",")){
//            reversedBytes[i++] = Byte.parseByte(s);
//        }
//        System.out.println("reversed bytes length : "+reversedBytes.length);
//        System.out.println("str : "+new String(reversedBytes));
        
//        EashPHR eashPhr = new EashPHR();
//        CardPHR cardPhr = null;
//        PatientInfo patientInfo = new PatientInfo();
//        patientInfo.setPatientId("P001");
//        patientInfo.setFirstName("Scott");
//        patientInfo.setLastName("Tiger");
//        eashPhr.setPatientInfo(patientInfo);
//        
//        DiagnosticDetails diagDetails = new DiagnosticDetails();
//        diagDetails.setDiagnosisId("D001");
//        diagDetails.setAllergies("Allergies");
//        List<DiagnosticDetails> diagList = new ArrayList<DiagnosticDetails>();
//        diagList.add(diagDetails);
//        eashPhr.setDiagnosticDetailsList(diagList);
        
//        try {
//            MapperFactory factory = new DefaultMapperFactory.Builder().build();
//            factory.classMap(EashPHR.class, CardPHR.class).byDefault().register();
//            MapperFacade mapper = factory.getMapperFacade();
//            cardPhr = mapper.map(eashPhr, CardPHR.class);
//        } catch (Exception ex) {
//
//        }
//        System.out.println("cardPhr.getPatientInfo().getPatientId : "+cardPhr.getPatientInfo().getPatientId());
//        System.out.println("cardPhr.getPatientInfo().getFirstName : "+cardPhr.getPatientInfo().getFirstName());
//        System.out.println("cardPhr.getPatientInfo().getLastName : "+cardPhr.getPatientInfo().getLastName());
//        System.out.println("cardPhr.getDiagnosticDetailsList().get(0).getDiagnosisId : "+cardPhr.getDiagnosticDetailsList().get(0).getDiagnosisId());
//        System.out.println("cardPhr.getDiagnosticDetailsList().get(0).getAllergies : "+cardPhr.getDiagnosticDetailsList().get(0).getAllergies());
        
        CardEntityManager entityManager = new CardEntityManager();
        try {
            entityManager.startSession();
            PodamFactory podamFactory = new PodamFactoryImpl();
            EashPHR eashPhr = podamFactory.manufacturePojo(EashPHR.class);
            PatientInfo patientInfo = podamFactory.manufacturePojo(PatientInfo.class);
            DiagnosticDetails diagnosticDetails = podamFactory.manufacturePojo(DiagnosticDetails.class);
            LabTest labTest = podamFactory.manufacturePojo(LabTest.class);
            Surgery surgery = podamFactory.manufacturePojo(Surgery.class);
            eashPhr.setDiagnosticDetails(diagnosticDetails);
            eashPhr.setLabTest(labTest);
            eashPhr.setSurgery(surgery);
            eashPhr.setPatientInfo(patientInfo);
            entityManager.updatePatientHealthRecord(eashPhr);
            EashPHR eashPHR = entityManager.getPatientHealthRecord(patientInfo.getPatientId());
            assert eashPHR.getPatientInfo().equals(eashPhr.getPatientInfo().getPatientId());
        } catch (DataAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
