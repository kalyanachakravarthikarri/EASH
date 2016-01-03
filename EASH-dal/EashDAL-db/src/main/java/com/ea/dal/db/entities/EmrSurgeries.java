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
@Table(name = "EMR_SURGERIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmrSurgeries.findAll", query = "SELECT e FROM EmrSurgeries e"),
    @NamedQuery(name = "EmrSurgeries.findBySurgeryId", query = "SELECT e FROM EmrSurgeries e WHERE e.surgeryId = :surgeryId"),
    @NamedQuery(name = "EmrSurgeries.findByHospitalId", query = "SELECT e FROM EmrSurgeries e WHERE e.hospitalId = :hospitalId"),
    @NamedQuery(name = "EmrSurgeries.findByBranchId", query = "SELECT e FROM EmrSurgeries e WHERE e.branchId = :branchId"),
    @NamedQuery(name = "EmrSurgeries.findByDepartmentId", query = "SELECT e FROM EmrSurgeries e WHERE e.departmentId = :departmentId"),
    @NamedQuery(name = "EmrSurgeries.findByDoctorId", query = "SELECT e FROM EmrSurgeries e WHERE e.doctorId = :doctorId"),
    @NamedQuery(name = "EmrSurgeries.findByPatientId", query = "SELECT e FROM EmrSurgeries e WHERE e.patientId = :patientId"),
    @NamedQuery(name = "EmrSurgeries.findByDiagnosisId", query = "SELECT e FROM EmrSurgeries e WHERE e.diagnosisId = :diagnosisId"),
    @NamedQuery(name = "EmrSurgeries.findByVisitId", query = "SELECT e FROM EmrSurgeries e WHERE e.visitId = :visitId"),
    @NamedQuery(name = "EmrSurgeries.findBySurgeryDesc", query = "SELECT e FROM EmrSurgeries e WHERE e.surgeryDesc = :surgeryDesc"),
    @NamedQuery(name = "EmrSurgeries.findByDateOfSurgery", query = "SELECT e FROM EmrSurgeries e WHERE e.dateOfSurgery = :dateOfSurgery"),
    @NamedQuery(name = "EmrSurgeries.findByPreSurgeryMedications", query = "SELECT e FROM EmrSurgeries e WHERE e.preSurgeryMedications = :preSurgeryMedications"),
    @NamedQuery(name = "EmrSurgeries.findBySurgeryDetails", query = "SELECT e FROM EmrSurgeries e WHERE e.surgeryDetails = :surgeryDetails"),
    @NamedQuery(name = "EmrSurgeries.findBySurgeryObservations", query = "SELECT e FROM EmrSurgeries e WHERE e.surgeryObservations = :surgeryObservations"),
    @NamedQuery(name = "EmrSurgeries.findBySurgeryResults", query = "SELECT e FROM EmrSurgeries e WHERE e.surgeryResults = :surgeryResults"),
    @NamedQuery(name = "EmrSurgeries.findByComplications", query = "SELECT e FROM EmrSurgeries e WHERE e.complications = :complications"),
    @NamedQuery(name = "EmrSurgeries.findByPostSurgeryMedications", query = "SELECT e FROM EmrSurgeries e WHERE e.postSurgeryMedications = :postSurgeryMedications"),
    @NamedQuery(name = "EmrSurgeries.findByProgressNotes", query = "SELECT e FROM EmrSurgeries e WHERE e.progressNotes = :progressNotes"),
    @NamedQuery(name = "EmrSurgeries.findByEhrFlag", query = "SELECT e FROM EmrSurgeries e WHERE e.ehrFlag = :ehrFlag"),
    @NamedQuery(name = "EmrSurgeries.findByDmCount", query = "SELECT e FROM EmrSurgeries e WHERE e.dmCount = :dmCount"),
    @NamedQuery(name = "EmrSurgeries.findBySynchronizationRequired", query = "SELECT e FROM EmrSurgeries e WHERE e.synchronizationRequired = :synchronizationRequired"),
    @NamedQuery(name = "EmrSurgeries.findByRecordCreationDate", query = "SELECT e FROM EmrSurgeries e WHERE e.recordCreationDate = :recordCreationDate"),
    @NamedQuery(name = "EmrSurgeries.findByCardUpdatedTimestamp", query = "SELECT e FROM EmrSurgeries e WHERE e.cardUpdatedTimestamp = :cardUpdatedTimestamp"),
    @NamedQuery(name = "EmrSurgeries.findByClouddbUpdatedTimestamp", query = "SELECT e FROM EmrSurgeries e WHERE e.clouddbUpdatedTimestamp = :clouddbUpdatedTimestamp"),
    @NamedQuery(name = "EmrSurgeries.findByLocaldbUdatedTimestamp", query = "SELECT e FROM EmrSurgeries e WHERE e.localdbUdatedTimestamp = :localdbUdatedTimestamp"),
    @NamedQuery(name = "EmrSurgeries.findByTranslogUpdatedTimestamp", query = "SELECT e FROM EmrSurgeries e WHERE e.translogUpdatedTimestamp = :translogUpdatedTimestamp")})
public class EmrSurgeries implements Serializable {
    @Column(name = "DATE_OF_SURGERY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfSurgery;
    @Column(name = "RECORD_CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordCreationDate;
    @Column(name = "CARD_UPDATED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cardUpdatedTimestamp;
    @Column(name = "CLOUDDB_UPDATED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clouddbUpdatedTimestamp;
    @Column(name = "LOCALDB_UDATED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date localdbUdatedTimestamp;
    @Column(name = "TRANSLOG_UPDATED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date translogUpdatedTimestamp;
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "SURGERY_ID")
    private BigDecimal surgeryId;
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
    @Column(name = "SURGERY_DESC")
    private String surgeryDesc;
    @Column(name = "PRE_SURGERY_MEDICATIONS")
    private String preSurgeryMedications;
    @Column(name = "SURGERY_DETAILS")
    private String surgeryDetails;
    @Column(name = "SURGERY_OBSERVATIONS")
    private String surgeryObservations;
    @Column(name = "SURGERY_RESULTS")
    private String surgeryResults;
    @Column(name = "COMPLICATIONS")
    private String complications;
    @Column(name = "POST_SURGERY_MEDICATIONS")
    private String postSurgeryMedications;
    @Column(name = "PROGRESS_NOTES")
    private String progressNotes;
    @Column(name = "EHR_FLAG")
    private Character ehrFlag;
    @Column(name = "DM_COUNT")
    private BigInteger dmCount;
    @Column(name = "SYNCHRONIZATION_REQUIRED")
    private Character synchronizationRequired;

    public EmrSurgeries() {
    }

    public EmrSurgeries(BigDecimal surgeryId) {
        this.surgeryId = surgeryId;
    }

    public BigDecimal getSurgeryId() {
        return surgeryId;
    }

    public void setSurgeryId(BigDecimal surgeryId) {
        this.surgeryId = surgeryId;
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

    public String getSurgeryDesc() {
        return surgeryDesc;
    }

    public void setSurgeryDesc(String surgeryDesc) {
        this.surgeryDesc = surgeryDesc;
    }

    public Date getDateOfSurgery() {
        return dateOfSurgery;
    }

    public void setDateOfSurgery(Date dateOfSurgery) {
        this.dateOfSurgery = dateOfSurgery;
    }

    public String getPreSurgeryMedications() {
        return preSurgeryMedications;
    }

    public void setPreSurgeryMedications(String preSurgeryMedications) {
        this.preSurgeryMedications = preSurgeryMedications;
    }

    public String getSurgeryDetails() {
        return surgeryDetails;
    }

    public void setSurgeryDetails(String surgeryDetails) {
        this.surgeryDetails = surgeryDetails;
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

    public String getComplications() {
        return complications;
    }

    public void setComplications(String complications) {
        this.complications = complications;
    }

    public String getPostSurgeryMedications() {
        return postSurgeryMedications;
    }

    public void setPostSurgeryMedications(String postSurgeryMedications) {
        this.postSurgeryMedications = postSurgeryMedications;
    }

    public String getProgressNotes() {
        return progressNotes;
    }

    public void setProgressNotes(String progressNotes) {
        this.progressNotes = progressNotes;
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

    public Date getLocaldbUdatedTimestamp() {
        return localdbUdatedTimestamp;
    }

    public void setLocaldbUdatedTimestamp(Date localdbUdatedTimestamp) {
        this.localdbUdatedTimestamp = localdbUdatedTimestamp;
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
        hash += (surgeryId != null ? surgeryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmrSurgeries)) {
            return false;
        }
        EmrSurgeries other = (EmrSurgeries) object;
        if ((this.surgeryId == null && other.surgeryId != null) || (this.surgeryId != null && !this.surgeryId.equals(other.surgeryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ea.dal.db.entities.EmrSurgeries[ surgeryId=" + surgeryId + " ]";
    }


}
