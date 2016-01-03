/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Medication : Medication administered
 * @author Kalyan
 */
public class Medication implements Serializable{
    private int medicationId;
    private int hospitalId;
    private int branchId;
    private int departmentId;
    private int doctorId;
    private int patientId;
    private int diagnosisId;
    private int visitId;
    private String medicineName;
    private String periodicity;
    private int noOfDays;
    private int quantity;
    private Date medicationTillDate;
    private Character ongoingFlag;
    private Character lifelongFlag;
    private Character ehrFlag;

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
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

    public Character getLifelongFlag() {
        return lifelongFlag;
    }

    public void setLifelongFlag(Character lifelongFlag) {
        this.lifelongFlag = lifelongFlag;
    }

    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    public Date getMedicationTillDate() {
        return medicationTillDate;
    }

    public void setMedicationTillDate(Date medicationTillDate) {
        this.medicationTillDate = medicationTillDate;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public Character getOngoingFlag() {
        return ongoingFlag;
    }

    public void setOngoingFlag(Character ongoingFlag) {
        this.ongoingFlag = ongoingFlag;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }
    
    
}

