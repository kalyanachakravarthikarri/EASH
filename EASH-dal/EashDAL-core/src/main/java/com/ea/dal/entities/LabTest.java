/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.entities;

import java.io.Serializable;

/**
 * LabTest : Details of lab tests
 * @author Kalyan
 */
public class LabTest implements Serializable{
    private int testId;
    private int hospitalId;
    private int branchId;
    private int departmentId;
    private int doctorId;
    private int patientId;
    private int diagnosisId;
    private int visitId;
    private String testName;
    private int lowerBoundary;
    private int upperBoundary;
    private int actualValues;
    private String diagnosisSummary;
    private int dmCount;

    public int getActualValues() {
        return actualValues;
    }

    public void setActualValues(int actualValues) {
        this.actualValues = actualValues;
    }

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

    public String getDiagnosisSummary() {
        return diagnosisSummary;
    }

    public void setDiagnosisSummary(String diagnosisSummary) {
        this.diagnosisSummary = diagnosisSummary;
    }

    public int getDmCount() {
        return dmCount;
    }

    public void setDmCount(int dmCount) {
        this.dmCount = dmCount;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getLowerBoundary() {
        return lowerBoundary;
    }

    public void setLowerBoundary(int lowerBoundary) {
        this.lowerBoundary = lowerBoundary;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getUpperBoundary() {
        return upperBoundary;
    }

    public void setUpperBoundary(int upperBoundary) {
        this.upperBoundary = upperBoundary;
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }
    
}
