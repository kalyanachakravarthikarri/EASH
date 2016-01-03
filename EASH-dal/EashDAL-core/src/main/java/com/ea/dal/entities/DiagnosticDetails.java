/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * More documentation needs to be added 
 * DiagnosticDetails : This class represents diagnostic details for a patient
 */
public class DiagnosticDetails  implements Serializable{
    
    private String hospitalId;
    private String branchId;
    private String departmentId;
    private String doctorId;
    private String patientId;
    private String diagnosisId;
    private String visitId;
    private String visitTypeId;
    private String visitStatusId;
    private int weight;//in Kgs
    private int pulse;
    private int bpSystolic;
    private int bpDiastolic;
    private int temp;//In Fahrenheit
    private String complaint;
    private String diagnosis;
    private String treatment;
    private String allergies;
    private String progressNotes;
    private String doctorNotes;
    private String surgeries;
    private Date dateVisited;
    //X-Rays,CTScans TODO decide the datatypes

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public int getBpDiastolic() {
        return bpDiastolic;
    }

    public void setBpDiastolic(int bpDiastolic) {
        this.bpDiastolic = bpDiastolic;
    }

    public int getBpSystolic() {
        return bpSystolic;
    }

    public void setBpSystolic(int bpSystolic) {
        this.bpSystolic = bpSystolic;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public Date getDateVisited() {
        return dateVisited;
    }

    public void setDateVisited(Date dateVisited) {
        this.dateVisited = dateVisited;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(String diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorNotes() {
        return doctorNotes;
    }

    public void setDoctorNotes(String doctorNotes) {
        this.doctorNotes = doctorNotes;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getProgressNotes() {
        return progressNotes;
    }

    public void setProgressNotes(String progressNotes) {
        this.progressNotes = progressNotes;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(String surgeries) {
        this.surgeries = surgeries;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitStatusId() {
        return visitStatusId;
    }

    public void setVisitStatusId(String visitStatusId) {
        this.visitStatusId = visitStatusId;
    }

    public String getVisitTypeId() {
        return visitTypeId;
    }

    public void setVisitTypeId(String visitTypeId) {
        this.visitTypeId = visitTypeId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    

    
}
