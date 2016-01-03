/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.db.entities;

import java.io.Serializable;

/**
 *
 * @author Kalyan
 */
public class DbPHR implements Serializable{
    
    private EmrPatients patientInfo;
    private EmrDiagnosisDetails diagnosticDetails;
    private EmrSurgeries surgery;
    private EmrMedications medications;
    private EmrLabTests labTest;

    public EmrDiagnosisDetails getDiagnosticDetails() {
        return diagnosticDetails;
    }

    public void setDiagnosticDetails(EmrDiagnosisDetails diagnosticDetails) {
        this.diagnosticDetails = diagnosticDetails;
    }

    public EmrLabTests getLabTest() {
        return labTest;
    }

    public void setLabTest(EmrLabTests labTest) {
        this.labTest = labTest;
    }

    public EmrMedications getMedications() {
        return medications;
    }

    public void setMedications(EmrMedications medications) {
        this.medications = medications;
    }

    public EmrPatients getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(EmrPatients patientInfo) {
        this.patientInfo = patientInfo;
    }

    public EmrSurgeries getSurgery() {
        return surgery;
    }

    public void setSurgery(EmrSurgeries surgery) {
        this.surgery = surgery;
    }
    
}
