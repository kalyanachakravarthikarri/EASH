package com.ea.dal.db.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2013-12-27T23:57:19")
@StaticMetamodel(EmrPatients.class)
public class EmrPatients_ { 

    public static volatile SingularAttribute<EmrPatients, Date> dateOfBirth;
    public static volatile SingularAttribute<EmrPatients, Date> cardUpdatedTimestamp;
    public static volatile SingularAttribute<EmrPatients, Character> sex;
    public static volatile SingularAttribute<EmrPatients, String> bloodGroup;
    public static volatile SingularAttribute<EmrPatients, BigInteger> spousePhoneno;
    public static volatile SingularAttribute<EmrPatients, BigInteger> mobilePhoneno;
    public static volatile SingularAttribute<EmrPatients, String> state;
    public static volatile SingularAttribute<EmrPatients, String> eyecolour;
    public static volatile SingularAttribute<EmrPatients, BigInteger> noOfChildren;
    public static volatile SingularAttribute<EmrPatients, String> maritalStatus;
    public static volatile SingularAttribute<EmrPatients, String> city;
    public static volatile SingularAttribute<EmrPatients, BigDecimal> patientId;
    public static volatile SingularAttribute<EmrPatients, String> height;
    public static volatile SingularAttribute<EmrPatients, Date> translogUpdatedTimestamp;
    public static volatile SingularAttribute<EmrPatients, Date> localdbUpdatedTimestamp;
    public static volatile SingularAttribute<EmrPatients, Character> synchronizationRequired;
    public static volatile SingularAttribute<EmrPatients, String> firstName;
    public static volatile SingularAttribute<EmrPatients, String> middleName;
    public static volatile SingularAttribute<EmrPatients, BigInteger> cardId;
    public static volatile SingularAttribute<EmrPatients, BigInteger> dmCount;
    public static volatile SingularAttribute<EmrPatients, String> lastName;
    public static volatile SingularAttribute<EmrPatients, String> occupation;
    public static volatile SingularAttribute<EmrPatients, BigInteger> officePhoneno;
    public static volatile SingularAttribute<EmrPatients, Date> clouddbUpdatedTimestamp;
    public static volatile SingularAttribute<EmrPatients, Date> recordCreationDate;
    public static volatile SingularAttribute<EmrPatients, String> addressLine2;
    public static volatile SingularAttribute<EmrPatients, String> addressLine1;
    public static volatile SingularAttribute<EmrPatients, String> spouseName;
    public static volatile SingularAttribute<EmrPatients, String> country;
    public static volatile SingularAttribute<EmrPatients, BigInteger> pincode;

}