/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Surgery : POJO holding the surgery details
 * @author Kalyan
 */
public class Surgery implements Serializable {

    private int surgeryId;
    private int hospitalId;
    private int branchId;
    private int departmentId;
    private int doctorId;
    private int patientId;
    private int diagnosisId;
    private int visitId;
    private String surgeryDesc;
    private Date dateOfSurgery;
    private String preSurgeryMedications;
    private String surgeryDetails;
    private String surgeryObservations;
    private String surgeryResults;
    private String complications;
    private String postSurgeryMedications;
    private String progressNotes;
    private Character ehrFlag;

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getComplications() {
        return complications;
    }

    public void setComplications(String complications) {
        this.complications = complications;
    }

    public Date getDateOfSurgery() {
        return dateOfSurgery;
    }

    public void setDateOfSurgery(Date dateOfSurgery) {
        this.dateOfSurgery = dateOfSurgery;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(int diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Character getEhrFlag() {
        return ehrFlag;
    }

    public void setEhrFlag(Character ehrFlag) {
        this.ehrFlag = ehrFlag;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPostSurgeryMedications() {
        return postSurgeryMedications;
    }

    public void setPostSurgeryMedications(String postSurgeryMedications) {
        this.postSurgeryMedications = postSurgeryMedications;
    }

    public String getPreSurgeryMedications() {
        return preSurgeryMedications;
    }

    public void setPreSurgeryMedications(String preSurgeryMedications) {
        this.preSurgeryMedications = preSurgeryMedications;
    }

    public String getProgressNotes() {
        return progressNotes;
    }

    public void setProgressNotes(String progressNotes) {
        this.progressNotes = progressNotes;
    }

    public String getSurgeryDesc() {
        return surgeryDesc;
    }

    public void setSurgeryDesc(String surgeryDesc) {
        this.surgeryDesc = surgeryDesc;
    }

    public String getSurgeryDetails() {
        return surgeryDetails;
    }

    public void setSurgeryDetails(String surgeryDetails) {
        this.surgeryDetails = surgeryDetails;
    }

    public int getSurgeryId() {
        return surgeryId;
    }

    public void setSurgeryId(int surgeryId) {
        this.surgeryId = surgeryId;
    }

    public String getSurgeryObservations() {
        return surgeryObservations;
    }

    public void setSurgeryObservations(String surgeryObservations) {
        this.surgeryObservations = surgeryObservations;
    }

    public String getSurgeryResults() {
        return surgeryResults;
    }

    public void setSurgeryResults(String surgeryResults) {
        this.surgeryResults = surgeryResults;
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }
    
}
