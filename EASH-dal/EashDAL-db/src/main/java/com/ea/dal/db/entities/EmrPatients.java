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
@Table(name = "EMR_PATIENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmrPatients.findAll", query = "SELECT e FROM EmrPatients e"),
    @NamedQuery(name = "EmrPatients.findByPatientId", query = "SELECT e FROM EmrPatients e WHERE e.patientId = :patientId"),
    @NamedQuery(name = "EmrPatients.findByCardId", query = "SELECT e FROM EmrPatients e WHERE e.cardId = :cardId"),
    @NamedQuery(name = "EmrPatients.findByFirstName", query = "SELECT e FROM EmrPatients e WHERE e.firstName = :firstName"),
    @NamedQuery(name = "EmrPatients.findByMiddleName", query = "SELECT e FROM EmrPatients e WHERE e.middleName = :middleName"),
    @NamedQuery(name = "EmrPatients.findByLastName", query = "SELECT e FROM EmrPatients e WHERE e.lastName = :lastName"),
    @NamedQuery(name = "EmrPatients.findByDateOfBirth", query = "SELECT e FROM EmrPatients e WHERE e.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "EmrPatients.findBySex", query = "SELECT e FROM EmrPatients e WHERE e.sex = :sex"),
    @NamedQuery(name = "EmrPatients.findByBloodGroup", query = "SELECT e FROM EmrPatients e WHERE e.bloodGroup = :bloodGroup"),
    @NamedQuery(name = "EmrPatients.findByEyecolour", query = "SELECT e FROM EmrPatients e WHERE e.eyecolour = :eyecolour"),
    @NamedQuery(name = "EmrPatients.findByMobilePhoneno", query = "SELECT e FROM EmrPatients e WHERE e.mobilePhoneno = :mobilePhoneno"),
    @NamedQuery(name = "EmrPatients.findByOfficePhoneno", query = "SELECT e FROM EmrPatients e WHERE e.officePhoneno = :officePhoneno"),
    @NamedQuery(name = "EmrPatients.findByMaritalStatus", query = "SELECT e FROM EmrPatients e WHERE e.maritalStatus = :maritalStatus"),
    @NamedQuery(name = "EmrPatients.findBySpouseName", query = "SELECT e FROM EmrPatients e WHERE e.spouseName = :spouseName"),
    @NamedQuery(name = "EmrPatients.findBySpousePhoneno", query = "SELECT e FROM EmrPatients e WHERE e.spousePhoneno = :spousePhoneno"),
    @NamedQuery(name = "EmrPatients.findByNoOfChildren", query = "SELECT e FROM EmrPatients e WHERE e.noOfChildren = :noOfChildren"),
    @NamedQuery(name = "EmrPatients.findByOccupation", query = "SELECT e FROM EmrPatients e WHERE e.occupation = :occupation"),
    @NamedQuery(name = "EmrPatients.findByAddressLine1", query = "SELECT e FROM EmrPatients e WHERE e.addressLine1 = :addressLine1"),
    @NamedQuery(name = "EmrPatients.findByAddressLine2", query = "SELECT e FROM EmrPatients e WHERE e.addressLine2 = :addressLine2"),
    @NamedQuery(name = "EmrPatients.findByCity", query = "SELECT e FROM EmrPatients e WHERE e.city = :city"),
    @NamedQuery(name = "EmrPatients.findByState", query = "SELECT e FROM EmrPatients e WHERE e.state = :state"),
    @NamedQuery(name = "EmrPatients.findByCountry", query = "SELECT e FROM EmrPatients e WHERE e.country = :country"),
    @NamedQuery(name = "EmrPatients.findByPincode", query = "SELECT e FROM EmrPatients e WHERE e.pincode = :pincode"),
    @NamedQuery(name = "EmrPatients.findByHeight", query = "SELECT e FROM EmrPatients e WHERE e.height = :height"),
    @NamedQuery(name = "EmrPatients.findByDmCount", query = "SELECT e FROM EmrPatients e WHERE e.dmCount = :dmCount"),
    @NamedQuery(name = "EmrPatients.findBySynchronizationRequired", query = "SELECT e FROM EmrPatients e WHERE e.synchronizationRequired = :synchronizationRequired"),
    @NamedQuery(name = "EmrPatients.findByRecordCreationDate", query = "SELECT e FROM EmrPatients e WHERE e.recordCreationDate = :recordCreationDate"),
    @NamedQuery(name = "EmrPatients.findByCardUpdatedTimestamp", query = "SELECT e FROM EmrPatients e WHERE e.cardUpdatedTimestamp = :cardUpdatedTimestamp"),
    @NamedQuery(name = "EmrPatients.findByClouddbUpdatedTimestamp", query = "SELECT e FROM EmrPatients e WHERE e.clouddbUpdatedTimestamp = :clouddbUpdatedTimestamp"),
    @NamedQuery(name = "EmrPatients.findByLocaldbUpdatedTimestamp", query = "SELECT e FROM EmrPatients e WHERE e.localdbUpdatedTimestamp = :localdbUpdatedTimestamp"),
    @NamedQuery(name = "EmrPatients.findByTranslogUpdatedTimestamp", query = "SELECT e FROM EmrPatients e WHERE e.translogUpdatedTimestamp = :translogUpdatedTimestamp")})
public class EmrPatients implements Serializable {
    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
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
    @Column(name = "PATIENT_ID")
    private BigDecimal patientId;
    @Column(name = "CARD_ID")
    private BigInteger cardId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "SEX")
    private Character sex;
    @Column(name = "BLOOD_GROUP")
    private String bloodGroup;
    @Column(name = "EYECOLOUR")
    private String eyecolour;
    @Column(name = "MOBILE_PHONENO")
    private BigInteger mobilePhoneno;
    @Column(name = "OFFICE_PHONENO")
    private BigInteger officePhoneno;
    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;
    @Column(name = "SPOUSE_NAME")
    private String spouseName;
    @Column(name = "SPOUSE_PHONENO")
    private BigInteger spousePhoneno;
    @Column(name = "NO_OF_CHILDREN")
    private BigInteger noOfChildren;
    @Column(name = "OCCUPATION")
    private String occupation;
    @Column(name = "ADDRESS_LINE1")
    private String addressLine1;
    @Column(name = "ADDRESS_LINE2")
    private String addressLine2;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "PINCODE")
    private BigInteger pincode;
    @Column(name = "HEIGHT")
    private String height;
    @Column(name = "DM_COUNT")
    private BigInteger dmCount;
    @Column(name = "SYNCHRONIZATION_REQUIRED")
    private Character synchronizationRequired;

    public EmrPatients() {
    }

    public EmrPatients(BigDecimal patientId) {
        this.patientId = patientId;
    }

    public BigDecimal getPatientId() {
        return patientId;
    }

    public void setPatientId(BigDecimal patientId) {
        this.patientId = patientId;
    }

    public BigInteger getCardId() {
        return cardId;
    }

    public void setCardId(BigInteger cardId) {
        this.cardId = cardId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEyecolour() {
        return eyecolour;
    }

    public void setEyecolour(String eyecolour) {
        this.eyecolour = eyecolour;
    }

    public BigInteger getMobilePhoneno() {
        return mobilePhoneno;
    }

    public void setMobilePhoneno(BigInteger mobilePhoneno) {
        this.mobilePhoneno = mobilePhoneno;
    }

    public BigInteger getOfficePhoneno() {
        return officePhoneno;
    }

    public void setOfficePhoneno(BigInteger officePhoneno) {
        this.officePhoneno = officePhoneno;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public BigInteger getSpousePhoneno() {
        return spousePhoneno;
    }

    public void setSpousePhoneno(BigInteger spousePhoneno) {
        this.spousePhoneno = spousePhoneno;
    }

    public BigInteger getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(BigInteger noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigInteger getPincode() {
        return pincode;
    }

    public void setPincode(BigInteger pincode) {
        this.pincode = pincode;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
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
        hash += (patientId != null ? patientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmrPatients)) {
            return false;
        }
        EmrPatients other = (EmrPatients) object;
        if ((this.patientId == null && other.patientId != null) || (this.patientId != null && !this.patientId.equals(other.patientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ea.dal.db.entities.EmrPatients[ patientId=" + patientId + " ]";
    }

}
