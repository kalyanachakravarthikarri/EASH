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
@Table(name = "EMR_LAB_TESTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmrLabTests.findAll", query = "SELECT e FROM EmrLabTests e"),
    @NamedQuery(name = "EmrLabTests.findByTestId", query = "SELECT e FROM EmrLabTests e WHERE e.testId = :testId"),
    @NamedQuery(name = "EmrLabTests.findByHospitalId", query = "SELECT e FROM EmrLabTests e WHERE e.hospitalId = :hospitalId"),
    @NamedQuery(name = "EmrLabTests.findByBranchId", query = "SELECT e FROM EmrLabTests e WHERE e.branchId = :branchId"),
    @NamedQuery(name = "EmrLabTests.findByDepartmentId", query = "SELECT e FROM EmrLabTests e WHERE e.departmentId = :departmentId"),
    @NamedQuery(name = "EmrLabTests.findByDoctorId", query = "SELECT e FROM EmrLabTests e WHERE e.doctorId = :doctorId"),
    @NamedQuery(name = "EmrLabTests.findByPatientId", query = "SELECT e FROM EmrLabTests e WHERE e.patientId = :patientId"),
    @NamedQuery(name = "EmrLabTests.findByDiagnosisId", query = "SELECT e FROM EmrLabTests e WHERE e.diagnosisId = :diagnosisId"),
    @NamedQuery(name = "EmrLabTests.findByVisitId", query = "SELECT e FROM EmrLabTests e WHERE e.visitId = :visitId"),
    @NamedQuery(name = "EmrLabTests.findByTestName", query = "SELECT e FROM EmrLabTests e WHERE e.testName = :testName"),
    @NamedQuery(name = "EmrLabTests.findByLowerBoundary", query = "SELECT e FROM EmrLabTests e WHERE e.lowerBoundary = :lowerBoundary"),
    @NamedQuery(name = "EmrLabTests.findByUpperBoundary", query = "SELECT e FROM EmrLabTests e WHERE e.upperBoundary = :upperBoundary"),
    @NamedQuery(name = "EmrLabTests.findByActualValues", query = "SELECT e FROM EmrLabTests e WHERE e.actualValues = :actualValues"),
    @NamedQuery(name = "EmrLabTests.findByDiagnosisSummary", query = "SELECT e FROM EmrLabTests e WHERE e.diagnosisSummary = :diagnosisSummary"),
    @NamedQuery(name = "EmrLabTests.findByDmCount", query = "SELECT e FROM EmrLabTests e WHERE e.dmCount = :dmCount"),
    @NamedQuery(name = "EmrLabTests.findBySynchronizationRequired", query = "SELECT e FROM EmrLabTests e WHERE e.synchronizationRequired = :synchronizationRequired"),
    @NamedQuery(name = "EmrLabTests.findByRecordCreationDate", query = "SELECT e FROM EmrLabTests e WHERE e.recordCreationDate = :recordCreationDate"),
    @NamedQuery(name = "EmrLabTests.findByCardUpdatedTimestamp", query = "SELECT e FROM EmrLabTests e WHERE e.cardUpdatedTimestamp = :cardUpdatedTimestamp"),
    @NamedQuery(name = "EmrLabTests.findByClouddbUpdatedTimestamp", query = "SELECT e FROM EmrLabTests e WHERE e.clouddbUpdatedTimestamp = :clouddbUpdatedTimestamp"),
    @NamedQuery(name = "EmrLabTests.findByLocaldbUpdatedTimestamp", query = "SELECT e FROM EmrLabTests e WHERE e.localdbUpdatedTimestamp = :localdbUpdatedTimestamp"),
    @NamedQuery(name = "EmrLabTests.findByTranslogUpdatedTimestamp", query = "SELECT e FROM EmrLabTests e WHERE e.translogUpdatedTimestamp = :translogUpdatedTimestamp")})
public class EmrLabTests implements Serializable {
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
    @Column(name = "TEST_ID")
    private BigDecimal testId;
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
    @Column(name = "TEST_NAME")
    private String testName;
    @Column(name = "LOWER_BOUNDARY")
    private BigInteger lowerBoundary;
    @Column(name = "UPPER_BOUNDARY")
    private BigInteger upperBoundary;
    @Column(name = "ACTUAL_VALUES")
    private BigInteger actualValues;
    @Column(name = "DIAGNOSIS_SUMMARY")
    private String diagnosisSummary;
    @Column(name = "DM_COUNT")
    private BigInteger dmCount;
    @Column(name = "SYNCHRONIZATION_REQUIRED")
    private Character synchronizationRequired;

    public EmrLabTests() {
    }

    public EmrLabTests(BigDecimal testId) {
        this.testId = testId;
    }

    public BigDecimal getTestId() {
        return testId;
    }

    public void setTestId(BigDecimal testId) {
        this.testId = testId;
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

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public BigInteger getLowerBoundary() {
        return lowerBoundary;
    }

    public void setLowerBoundary(BigInteger lowerBoundary) {
        this.lowerBoundary = lowerBoundary;
    }

    public BigInteger getUpperBoundary() {
        return upperBoundary;
    }

    public void setUpperBoundary(BigInteger upperBoundary) {
        this.upperBoundary = upperBoundary;
    }

    public BigInteger getActualValues() {
        return actualValues;
    }

    public void setActualValues(BigInteger actualValues) {
        this.actualValues = actualValues;
    }

    public String getDiagnosisSummary() {
        return diagnosisSummary;
    }

    public void setDiagnosisSummary(String diagnosisSummary) {
        this.diagnosisSummary = diagnosisSummary;
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
        hash += (testId != null ? testId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmrLabTests)) {
            return false;
        }
        EmrLabTests other = (EmrLabTests) object;
        if ((this.testId == null && other.testId != null) || (this.testId != null && !this.testId.equals(other.testId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ea.dal.db.entities.EmrLabTests[ testId=" + testId + " ]";
    }

    
}
