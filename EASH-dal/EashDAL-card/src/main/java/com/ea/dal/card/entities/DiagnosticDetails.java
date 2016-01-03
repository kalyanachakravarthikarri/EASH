/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.card.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Kalyan
 */
public class DiagnosticDetails implements Serializable{
    
    private String docFirstName;
    private String docLastName;
    private String specialization;
    private String hospitalId;
    private String branchId;
    private String deptId;
    private String docId;
    private String diagnosisId;
    private String visitId;
    private String visityTypeId;
    private Date datevisited;
    private int weight;//In Kgs
    private int pulse;
    private int bpSystolic;
    private int bpDiastolic;
    private int temp;//In fahrenheit
    private String complaint;
    private String diagnosis;
    private String treatment;
    private String allergies;
    private String doctorNotes;

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

    public Date getDatevisited() {
        return datevisited;
    }

    public void setDatevisited(Date datevisited) {
        this.datevisited = datevisited;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
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

    public String getDocFirstName() {
        return docFirstName;
    }

    public void setDocFirstName(String docFirstName) {
        this.docFirstName = docFirstName;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocLastName() {
        return docLastName;
    }

    public void setDocLastName(String docLastName) {
        this.docLastName = docLastName;
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

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
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

    public String getVisityTypeId() {
        return visityTypeId;
    }

    public void setVisityTypeId(String visityTypeId) {
        this.visityTypeId = visityTypeId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    
    
    
    
}
