/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.db.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kalyan
 */
@Entity
@Table(name = "EMR_MEDICATIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmrMedications.findAll", query = "SELECT e FROM EmrMedications e"),
    @NamedQuery(name = "EmrMedications.findByMedicationId", query = "SELECT e FROM EmrMedications e WHERE e.medicationId = :medicationId"),
    @NamedQuery(name = "EmrMedications.findByHospitalId", query = "SELECT e FROM EmrMedications e WHERE e.hospitalId = :hospitalId"),
    @NamedQuery(name = "EmrMedications.findByBranchId", query = "SELECT e FROM EmrMedications e WHERE e.branchId = :branchId"),
    @NamedQuery(name = "EmrMedications.findByDepartmentId", query = "SELECT e FROM EmrMedications e WHERE e.departmentId = :departmentId"),
    @NamedQuery(name = "EmrMedications.findByDoctorId", query = "SELECT e FROM EmrMedications e WHERE e.doctorId = :doctorId"),
    @NamedQuery(name = "EmrMedications.findByPatientId", query = "SELECT e FROM EmrMedications e WHERE e.patientId = :patientId"),
    @NamedQuery(name = "EmrMedications.findByDiagnosisId", query = "SELECT e FROM EmrMedications e WHERE e.diagnosisId = :diagnosisId"),
    @NamedQuery(name = "EmrMedications.findByVisitId", query = "SELECT e FROM EmrMedications e WHERE e.visitId = :visitId"),
    @NamedQuery(name = "EmrMedications.findByMedicineName", query = "SELECT e FROM EmrMedications e WHERE e.medicineName = :medicineName"),
    @NamedQuery(name = "EmrMedications.findByPeriodicity", query = "SELECT e FROM EmrMedications e WHERE e.periodicity = :periodicity"),
    @NamedQuery(name = "EmrMedications.findByNoOfDays", query = "SELECT e FROM EmrMedications e WHERE e.noOfDays = :noOfDays"),
    @NamedQuery(name = "EmrMedications.findByQuantity", query = "SELECT e FROM EmrMedications e WHERE e.quantity = :quantity"),
    @NamedQuery(name = "EmrMedications.findByMedicationTillDate", query = "SELECT e FROM EmrMedications e WHERE e.medicationTillDate = :medicationTillDate"),
    @NamedQuery(name = "EmrMedications.findByOngoingFlag", query = "SELECT e FROM EmrMedications e WHERE e.ongoingFlag = :ongoingFlag"),
    @NamedQuery(name = "EmrMedications.findByLifelongFlag", query = "SELECT e FROM EmrMedications e WHERE e.lifelongFlag = :lifelongFlag"),
    @NamedQuery(name = "EmrMedications.findByEhrFlag", query = "SELECT e FROM EmrMedications e WHERE e.ehrFlag = :ehrFlag"),
    @NamedQuery(name = "EmrMedications.findByDmCount", query = "SELECT e FROM EmrMedications e WHERE e.dmCount = :dmCount"),
    @NamedQuery(name = "EmrMedications.findBySynchronizationRequired", query = "SELECT e FROM EmrMedications e WHERE e.synchronizationRequired = :synchronizationRequired"),
    @NamedQuery(name = "EmrMedications.findByRecordCreationDate", query = "SELECT e FROM EmrMedications e WHERE e.recordCreationDate = :recordCreationDate"),
    @NamedQuery(name = "EmrMedications.findByCardUpdatedTimestamp", query = "SELECT e FROM EmrMedications e WHERE e.cardUpdatedTimestamp = :cardUpdatedTimestamp"),
    @NamedQuery(name = "EmrMedications.findByClouddbUpdatedTimestamp", query = "SELECT e FROM EmrMedications e WHERE e.clouddbUpdatedTimestamp = :clouddbUpdatedTimestamp"),
    @NamedQuery(name = "EmrMedications.findByLocaldbUpdatedTimestamp", query = "SELECT e FROM EmrMedications e WHERE e.localdbUpdatedTimestamp = :localdbUpdatedTimestamp"),
    @NamedQuery(name = "EmrMedications.findByTranslogUpdatedTimestamp", query = "SELECT e FROM EmrMedications e WHERE e.translogUpdatedTimestamp = :translogUpdatedTimestamp")})
public class EmrMedications implements Serializable {
    @Column(name = "MEDICATION_TILL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date medicationTillDate;
    @Column(name = "RECORD_CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordCreationDate;
    @Column(name = "CARD_UPDATED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cardUpdatedTimestamp;
    @Column(name = "CLOUDDB_UPDATED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clouddbUpdatedTimestamp;
    @Column(name = "LOCALDB_UPDATED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date localdbUpdatedTimestamp;
    @Column(name = "TRANSLOG_UPDATED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date translogUpdatedTimestamp;
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "MEDICATION_ID")
    private BigDecimal medicationId;
    @Column(name = "HOSPITAL_ID")
    private BigInteger hospitalId;
    @Column(name = "BRANCH_ID")
    private BigInteger branchId;
    @Column(name = "DEPARTMENT_ID")
    private BigInteger departmentId;
    @Column(name = "DOCTOR_ID")
    private BigInteger doctorId;
    @Column(name = "PATIENT_ID")
    private BigInteger patientId;
    @Column(name = "DIAGNOSIS_ID")
    private BigInteger diagnosisId;
    @Column(name = "VISIT_ID")
    private BigInteger visitId;
    @Column(name = "MEDICINE_NAME")
    private String medicineName;
    @Column(name = "PERIODICITY")
    private String periodicity;
    @Column(name = "NO_OF_DAYS")
    private BigInteger noOfDays;
    @Column(name = "QUANTITY")
    private BigInteger quantity;
    @Column(name = "ONGOING_FLAG")
    private Character ongoingFlag;
    @Column(name = "LIFELONG_FLAG")
    private Character lifelongFlag;
    @Column(name = "EHR_FLAG")
    private Character ehrFlag;
    @Column(name = "DM_COUNT")
    private BigInteger dmCount;
    @Column(name = "SYNCHRONIZATION_REQUIRED")
    private Character synchronizationRequired;

    public EmrMedications() {
    }

    public EmrMedications(BigDecimal medicationId) {
        this.medicationId = medicationId;
    }

    public BigDecimal getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(BigDecimal medicationId) {
        this.medicationId = medicationId;
    }

    public BigInteger getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(BigInteger hospitalId) {
        this.hospitalId = hospitalId;
    }

    public BigInteger getBranchId() {
        return branchId;
    }

    public void setBranchId(BigInteger branchId) {
        this.branchId = branchId;
    }

    public BigInteger getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(BigInteger departmentId) {
        this.departmentId = departmentId;
    }

    public BigInteger getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(BigInteger doctorId) {
        this.doctorId = doctorId;
    }

    public BigInteger getPatientId() {
        return patientId;
    }

    public void setPatientId(BigInteger patientId) {
        this.patientId = patientId;
    }

    public BigInteger getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(BigInteger diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public BigInteger getVisitId() {
        return visitId;
    }

    public void setVisitId(BigInteger visitId) {
        this.visitId = visitId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public BigInteger getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(BigInteger noOfDays) {
        this.noOfDays = noOfDays;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    public Date getMedicationTillDate() {
        return medicationTillDate;
    }

    public void setMedicationTillDate(Date medicationTillDate) {
        this.medicationTillDate = medicationTillDate;
    }

    public Character getOngoingFlag() {
        return ongoingFlag;
    }

    public void setOngoingFlag(Character ongoingFlag) {
        this.ongoingFlag = ongoingFlag;
    }

    public Character getLifelongFlag() {
        return lifelongFlag;
    }

    public void setLifelongFlag(Character lifelongFlag) {
        this.lifelongFlag = lifelongFlag;
    }

    public Character getEhrFlag() {
        return ehrFlag;
    }

    public void setEhrFlag(Character ehrFlag) {
        this.ehrFlag = ehrFlag;
    }

    public BigInteger getDmCount() {
        return dmCount;
    }

    public void setDmCount(BigInteger dmCount) {
        this.dmCount = dmCount;
    }

    public Character getSynchronizationRequired() {
        return synchronizationRequired;
    }

    public void setSynchronizationRequired(Character synchronizationRequired) {
        this.synchronizationRequired = synchronizationRequired;
    }

    public Date getRecordCreationDate() {
        return recordCreationDate;
    }

    public void setRecordCreationDate(Date recordCreationDate) {
        this.recordCreationDate = recordCreationDate;
    }

    public Date getCardUpdatedTimestamp() {
        return cardUpdatedTimestamp;
    }

    public void setCardUpdatedTimestamp(Date cardUpdatedTimestamp) {
        this.cardUpdatedTimestamp = cardUpdatedTimestamp;
    }

    public Date getClouddbUpdatedTimestamp() {
        return clouddbUpdatedTimestamp;
    }

    public void setClouddbUpdatedTimestamp(Date clouddbUpdatedTimestamp) {
        this.clouddbUpdatedTimestamp = clouddbUpdatedTimestamp;
    }

    public Date getLocaldbUpdatedTimestamp() {
        return localdbUpdatedTimestamp;
    }

    public void setLocaldbUpdatedTimestamp(Date localdbUpdatedTimestamp) {
        this.localdbUpdatedTimestamp = localdbUpdatedTimestamp;
    }

    public Date getTranslogUpdatedTimestamp() {
        return translogUpdatedTimestamp;
    }

    public void setTranslogUpdatedTimestamp(Date translogUpdatedTimestamp) {
        this.translogUpdatedTimestamp = translogUpdatedTimestamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (medicationId != null ? medicationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmrMedications)) {
            return false;
        }
        EmrMedications other = (EmrMedications) object;
        if ((this.medicationId == null && other.medicationId != null) || (this.medicationId != null && !this.medicationId.equals(other.medicationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ea.dal.db.entities.EmrMedications[ medicationId=" + medicationId + " ]";
    }

    
}
