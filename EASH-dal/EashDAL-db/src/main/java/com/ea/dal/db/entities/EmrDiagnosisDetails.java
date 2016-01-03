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
@Table(name = "EMR_DIAGNOSIS_DETAILS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmrDiagnosisDetails.findAll", query = "SELECT e FROM EmrDiagnosisDetails e"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByDiagnosisId", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.diagnosisId = :diagnosisId"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByHospitalId", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.hospitalId = :hospitalId"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByBranchId", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.branchId = :branchId"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByDepartmentId", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.departmentId = :departmentId"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByDoctorId", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.doctorId = :doctorId"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByPatientId", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.patientId = :patientId"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByVisitId", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.visitId = :visitId"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByVisitTypeId", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.visitTypeId = :visitTypeId"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByVisitStatusId", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.visitStatusId = :visitStatusId"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByWeight", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.weight = :weight"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByBpsystolic", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.bpsystolic = :bpsystolic"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByBpdiastolic", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.bpdiastolic = :bpdiastolic"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByTempFahrenheit", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.tempFahrenheit = :tempFahrenheit"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByComplaint", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.complaint = :complaint"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByDiagnosis", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.diagnosis = :diagnosis"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByTreatment", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.treatment = :treatment"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByAllergies", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.allergies = :allergies"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByProgressnotes", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.progressnotes = :progressnotes"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByDoctorNotes", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.doctorNotes = :doctorNotes"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByDateVisited", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.dateVisited = :dateVisited"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByOldPrescriptions", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.oldPrescriptions = :oldPrescriptions"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByXRays", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.xRays = :xRays"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByDmCount", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.dmCount = :dmCount"),
    @NamedQuery(name = "EmrDiagnosisDetails.findBySynchronizationRequired", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.synchronizationRequired = :synchronizationRequired"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByRecordCreationDate", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.recordCreationDate = :recordCreationDate"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByCardUpdatedTimestamp", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.cardUpdatedTimestamp = :cardUpdatedTimestamp"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByClouddbUpdatedTimestamp", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.clouddbUpdatedTimestamp = :clouddbUpdatedTimestamp"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByLocaldbUpdatedTimestamp", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.localdbUpdatedTimestamp = :localdbUpdatedTimestamp"),
    @NamedQuery(name = "EmrDiagnosisDetails.findByTranslogUpdatedTimestamp", query = "SELECT e FROM EmrDiagnosisDetails e WHERE e.translogUpdatedTimestamp = :translogUpdatedTimestamp")})
public class EmrDiagnosisDetails implements Serializable {
    @Column(name = "DATE_VISITED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVisited;
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
    @Column(name = "DIAGNOSIS_ID")
    private BigDecimal diagnosisId;
    @Basic(optional = false)
    @Column(name = "HOSPITAL_ID")
    private BigInteger hospitalId;
    @Column(name = "BRANCH_ID")
    private BigInteger branchId;
    @Column(name = "DEPARTMENT_ID")
    private BigInteger departmentId;
    @Basic(optional = false)
    @Column(name = "DOCTOR_ID")
    private BigInteger doctorId;
    @Basic(optional = false)
    @Column(name = "PATIENT_ID")
    private BigInteger patientId;
    @Column(name = "VISIT_ID")
    private BigInteger visitId;
    @Column(name = "VISIT_TYPE_ID")
    private BigInteger visitTypeId;
    @Column(name = "VISIT_STATUS_ID")
    private BigInteger visitStatusId;
    @Column(name = "WEIGHT")
    private BigInteger weight;
    @Column(name = "BPSYSTOLIC")
    private BigInteger bpsystolic;
    @Column(name = "BPDIASTOLIC")
    private BigInteger bpdiastolic;
    @Column(name = "TEMP_FAHRENHEIT")
    private BigInteger tempFahrenheit;
    @Column(name = "COMPLAINT")
    private String complaint;
    @Column(name = "DIAGNOSIS")
    private String diagnosis;
    @Column(name = "TREATMENT")
    private String treatment;
    @Column(name = "ALLERGIES")
    private String allergies;
    @Column(name = "PROGRESSNOTES")
    private String progressnotes;
    @Column(name = "DOCTOR_NOTES")
    private String doctorNotes;
    @Column(name = "OLD_PRESCRIPTIONS")
    private Character oldPrescriptions;
    @Column(name = "X_RAYS")
    private Character xRays;
    @Column(name = "DM_COUNT")
    private BigInteger dmCount;
    @Column(name = "SYNCHRONIZATION_REQUIRED")
    private Character synchronizationRequired;

    public EmrDiagnosisDetails() {
    }

    public EmrDiagnosisDetails(BigDecimal diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public EmrDiagnosisDetails(BigDecimal diagnosisId, BigInteger hospitalId, BigInteger doctorId, BigInteger patientId) {
        this.diagnosisId = diagnosisId;
        this.hospitalId = hospitalId;
        this.doctorId = doctorId;
        this.patientId = patientId;
    }

    public BigDecimal getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(BigDecimal diagnosisId) {
        this.diagnosisId = diagnosisId;
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

    public BigInteger getVisitId() {
        return visitId;
    }

    public void setVisitId(BigInteger visitId) {
        this.visitId = visitId;
    }

    public BigInteger getVisitTypeId() {
        return visitTypeId;
    }

    public void setVisitTypeId(BigInteger visitTypeId) {
        this.visitTypeId = visitTypeId;
    }

    public BigInteger getVisitStatusId() {
        return visitStatusId;
    }

    public void setVisitStatusId(BigInteger visitStatusId) {
        this.visitStatusId = visitStatusId;
    }

    public BigInteger getWeight() {
        return weight;
    }

    public void setWeight(BigInteger weight) {
        this.weight = weight;
    }

    public BigInteger getBpsystolic() {
        return bpsystolic;
    }

    public void setBpsystolic(BigInteger bpsystolic) {
        this.bpsystolic = bpsystolic;
    }

    public BigInteger getBpdiastolic() {
        return bpdiastolic;
    }

    public void setBpdiastolic(BigInteger bpdiastolic) {
        this.bpdiastolic = bpdiastolic;
    }

    public BigInteger getTempFahrenheit() {
        return tempFahrenheit;
    }

    public void setTempFahrenheit(BigInteger tempFahrenheit) {
        this.tempFahrenheit = tempFahrenheit;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getProgressnotes() {
        return progressnotes;
    }

    public void setProgressnotes(String progressnotes) {
        this.progressnotes = progressnotes;
    }

    public String getDoctorNotes() {
        return doctorNotes;
    }

    public void setDoctorNotes(String doctorNotes) {
        this.doctorNotes = doctorNotes;
    }

    public Date getDateVisited() {
        return dateVisited;
    }

    public void setDateVisited(Date dateVisited) {
        this.dateVisited = dateVisited;
    }

    public Character getOldPrescriptions() {
        return oldPrescriptions;
    }

    public void setOldPrescriptions(Character oldPrescriptions) {
        this.oldPrescriptions = oldPrescriptions;
    }

    public Character getXRays() {
        return xRays;
    }

    public void setXRays(Character xRays) {
        this.xRays = xRays;
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
        hash += (diagnosisId != null ? diagnosisId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmrDiagnosisDetails)) {
            return false;
        }
        EmrDiagnosisDetails other = (EmrDiagnosisDetails) object;
        if ((this.diagnosisId == null && other.diagnosisId != null) || (this.diagnosisId != null && !this.diagnosisId.equals(other.diagnosisId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ea.dal.db.entities.EmrDiagnosisDetails[ diagnosisId=" + diagnosisId + " ]";
    }

   
}
