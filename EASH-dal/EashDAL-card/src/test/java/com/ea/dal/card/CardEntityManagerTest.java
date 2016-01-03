///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.ea.dal.card;
//
//import com.ea.dal.entities.DiagnosticDetails;
//import com.ea.dal.entities.EashPHR;
//import com.ea.dal.entities.LabTest;
//import com.ea.dal.entities.PatientInfo;
//import com.ea.dal.entities.Surgery;
//import com.ea.dal.exceptions.DataAccessException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import junit.framework.TestCase;
//import uk.co.jemos.podam.api.PodamFactory;
//import uk.co.jemos.podam.api.PodamFactoryImpl;
//
///**
// *
// * @author Kalyan
// */
//public class CardEntityManagerTest extends TestCase {
//
//    public CardEntityManagerTest(String testName) {
//        super(testName);
//    }
//
//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//    }
//
//    @Override
//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }
//
//    public void testCard() throws Exception {
//        CardEntityManager entityManager = new CardEntityManager();
//        for (int i = 0; i < 20; i++) {
//            try {
//                entityManager.startSession();
//                PodamFactory podamFactory = new PodamFactoryImpl();
//                EashPHR eashPhr = podamFactory.manufacturePojo(EashPHR.class);
//                PatientInfo patientInfo = podamFactory.manufacturePojo(PatientInfo.class);
//                DiagnosticDetails diagnosticDetails = podamFactory.manufacturePojo(DiagnosticDetails.class);
//                LabTest labTest = podamFactory.manufacturePojo(LabTest.class);
//                Surgery surgery = podamFactory.manufacturePojo(Surgery.class);
//                eashPhr.setDiagnosticDetails(diagnosticDetails);
//                eashPhr.setLabTest(labTest);
//                eashPhr.setSurgery(surgery);
//                eashPhr.setPatientInfo(patientInfo);
//                entityManager.updatePatientHealthRecord(eashPhr);
//                entityManager.endSession();
//                entityManager.startSession();
//                EashPHR eashPHR = entityManager.getPatientHealthRecord(patientInfo.getPatientId());
//                assertTrue(eashPHR.getPatientInfo().getPatientId().equals(eashPhr.getPatientInfo().getPatientId()));
//                assertTrue(eashPHR.getDiagnosticDetails().getDiagnosisId().equals(eashPhr.getDiagnosticDetails().getDiagnosisId()));
//                assertTrue(eashPHR.getSurgery().getSurgeryDetails().equals(eashPhr.getSurgery().getSurgeryDetails()));
//                assertTrue(eashPHR.getLabTest().getTestName().equals(eashPhr.getLabTest().getTestName()));
//                
//            } catch (DataAccessException ex) {
//                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//    /**
//     * Test of startSession method, of class CardEntityManager.
//     */
//    /*public void testStartSession() throws Exception {
//    System.out.println("startSession");
//    CardEntityManager instance = new CardEntityManager();
//    instance.startSession();
//    // TODO review the generated test code and remove the default call to fail.
//    fail("The test case is a prototype.");
//    }*/
//    /**
//     * Test of getPatientHealthRecord method, of class CardEntityManager.
//     */
////    public void testGetPatientHealthRecord() throws Exception {
////        System.out.println("getPatientHealthRecord");
////        CardEntityManager instance = new CardEntityManager();
////        instance.startSession();
////
////        PodamFactory factory = new PodamFactoryImpl(); //This will use the default Random Data Provider Strategy
////        PatientInfo patientInfo = factory.manufacturePojo(PatientInfo.class);
////        EashPHR phr = new EashPHR();
////        phr.setPatientInfo(patientInfo);
////        //save the PHR to Card
//////        instance.updatePatientHealthRecord(phr);
////        EashPHR result = instance.getPatientHealthRecord();
////        System.out.println("result.getPatientInfo().getPatientId : " + result.getPatientInfo().getPatientId());
//////        assertEquals(phr.getPatientInfo().getFirstName(), result.getPatientInfo().getFirstName());
////
////    }
////    /**
////     * Test of updatePatientHealthRecord method, of class CardEntityManager.
////     */
////    public void testUpdatePatientHealthRecord() throws Exception {
////        System.out.println("updatePatientHealthRecord");
////        EashPHR phr = null;
////        CardEntityManager instance = new CardEntityManager();
////        boolean expResult = false;
////        boolean result = instance.updatePatientHealthRecord(phr);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of endSession method, of class CardEntityManager.
////     */
////    public void testEndSession() throws Exception {
////        System.out.println("endSession");
////        CardEntityManager instance = new CardEntityManager();
////        instance.endSession();
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//}
