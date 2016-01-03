/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.card.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO how far is having getters and setters on List useful? Should we consider some other mechanism
 * @author Kalyan
 */
public class CardPHR implements Serializable {
    private PatientInfo patientInfo;
    private List<DiagnosticDetails> diagnosticDetailsList;
    private List<Surgery> surgeryList;
    private List<Medication> medicationsList;
    private List<LabTest> labTestList;
    private static final int MAX_LIST_SIZE = 5;//TODO Retrieve from application wide configuration file | change impl to calculate size of the records

    public CardPHR() {
        patientInfo = new PatientInfo();
        diagnosticDetailsList = new ArrayList<DiagnosticDetails>();
        surgeryList = new ArrayList<Surgery>();
        medicationsList = new ArrayList<Medication>();
        labTestList = new ArrayList<LabTest>();
    }

    public List<DiagnosticDetails> getDiagnosticDetailsList() {
        return diagnosticDetailsList;
    }

    public void addDiagnosticDetail(DiagnosticDetails diagnosticDetails) {
        diagnosticDetailsList.add(diagnosticDetails);
        while(diagnosticDetailsList.size() > MAX_LIST_SIZE){
           diagnosticDetailsList.remove(0);
       }
    }

    public List<LabTest> getLabTestList() {
        return labTestList;
    }

    public void addLabTest(LabTest labTest) {
       labTestList.add(labTest);
       while(labTestList.size() > MAX_LIST_SIZE){
           labTestList.remove(0);
       }
    }

    public List<Medication> getMedicationsList() {
        return medicationsList;
    }

    public void addMedication(Medication medication) {
        medicationsList.add(medication);
        while(medicationsList.size() > MAX_LIST_SIZE){
           medicationsList.remove(0);
       }
    }

    public PatientInfo getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(PatientInfo patientInfo) {
        this.patientInfo = patientInfo;
    }

    public List<Surgery> getSurgeryList() {
        return surgeryList;
    }

    public void addSurgery(Surgery surgery) {
        surgeryList.add(surgery);
        while(surgeryList.size() > MAX_LIST_SIZE){
           surgeryList.remove(0);
       }
    }

    
}
