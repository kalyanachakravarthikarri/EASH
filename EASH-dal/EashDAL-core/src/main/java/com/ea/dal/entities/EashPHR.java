/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.entities;

import java.io.Serializable;

/**
 * EashPHR : Patient Health Record
 * This contains details like patientInfo, diagnosticDetails, surgery info, medications administered.
 * @author Kalyan
 */
public class EashPHR implements Serializable{
    
    private PatientInfo patientInfo;
    private DiagnosticDetails diagnosticDetails;
    private Surgery surgery;
    private Medication medications;
    private LabTest labTest;

    public EashPHR() {
        patientInfo = new PatientInfo();
        diagnosticDetails = new DiagnosticDetails();
        surgery = new Surgery();
        medications = new Medication();
        labTest = new LabTest();
    }

    public DiagnosticDetails getDiagnosticDetails() {
        return diagnosticDetails;
    }

    public void setDiagnosticDetails(DiagnosticDetails diagnosticDetails) {
        this.diagnosticDetails = diagnosticDetails;
    }

    public LabTest getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTest labTest) {
        this.labTest = labTest;
    }

    public Medication getMedications() {
        return medications;
    }

    public void setMedications(Medication medications) {
        this.medications = medications;
    }

    public PatientInfo getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(PatientInfo patientInfo) {
        this.patientInfo = patientInfo;
    }

    public Surgery getSurgery() {
        return surgery;
    }

    public void setSurgery(Surgery surgery) {
        this.surgery = surgery;
    }
    
}
