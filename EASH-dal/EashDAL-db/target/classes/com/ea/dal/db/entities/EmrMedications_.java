package com.ea.dal.db.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2013-12-27T23:57:19")
@StaticMetamodel(EmrMedications.class)
public class EmrMedications_ { 

    public static volatile SingularAttribute<EmrMedications, Date> cardUpdatedTimestamp;
    public static volatile SingularAttribute<EmrMedications, BigInteger> dmCount;
    public static volatile SingularAttribute<EmrMedications, BigInteger> noOfDays;
    public static volatile SingularAttribute<EmrMedications, BigInteger> diagnosisId;
    public static volatile SingularAttribute<EmrMedications, Date> clouddbUpdatedTimestamp;
    public static volatile SingularAttribute<EmrMedications, BigInteger> hospitalId;
    public static volatile SingularAttribute<EmrMedications, BigInteger> visitId;
    public static volatile SingularAttribute<EmrMedications, Date> recordCreationDate;
    public static volatile SingularAttribute<EmrMedications, Character> ongoingFlag;
    public static volatile SingularAttribute<EmrMedications, BigInteger> patientId;
    public static volatile SingularAttribute<EmrMedications, String> medicineName;
    public static volatile SingularAttribute<EmrMedications, BigInteger> branchId;
    public static volatile SingularAttribute<EmrMedications, BigInteger> doctorId;
    public static volatile SingularAttribute<EmrMedications, Date> translogUpdatedTimestamp;
    public static volatile SingularAttribute<EmrMedications, Date> localdbUpdatedTimestamp;
    public static volatile SingularAttribute<EmrMedications, BigDecimal> medicationId;
    public static volatile SingularAttribute<EmrMedications, Character> lifelongFlag;
    public static volatile SingularAttribute<EmrMedications, Character> ehrFlag;
    public static volatile SingularAttribute<EmrMedications, Character> synchronizationRequired;
    public static volatile SingularAttribute<EmrMedications, String> periodicity;
    public static volatile SingularAttribute<EmrMedications, BigInteger> quantity;
    public static volatile SingularAttribute<EmrMedications, BigInteger> departmentId;
    public static volatile SingularAttribute<EmrMedications, Date> medicationTillDate;

}