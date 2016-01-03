package com.ea.dal.db.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2013-12-27T23:57:19")
@StaticMetamodel(EmrDiagnosisDetails.class)
public class EmrDiagnosisDetails_ { 

    public static volatile SingularAttribute<EmrDiagnosisDetails, Date> cardUpdatedTimestamp;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> weight;
    public static volatile SingularAttribute<EmrDiagnosisDetails, Character> oldPrescriptions;
    public static volatile SingularAttribute<EmrDiagnosisDetails, String> treatment;
    public static volatile SingularAttribute<EmrDiagnosisDetails, String> diagnosis;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> hospitalId;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> visitId;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> patientId;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> bpdiastolic;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> visitTypeId;
    public static volatile SingularAttribute<EmrDiagnosisDetails, String> doctorNotes;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> branchId;
    public static volatile SingularAttribute<EmrDiagnosisDetails, Date> translogUpdatedTimestamp;
    public static volatile SingularAttribute<EmrDiagnosisDetails, Date> localdbUpdatedTimestamp;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> tempFahrenheit;
    public static volatile SingularAttribute<EmrDiagnosisDetails, Character> synchronizationRequired;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> bpsystolic;
    public static volatile SingularAttribute<EmrDiagnosisDetails, String> complaint;
    public static volatile SingularAttribute<EmrDiagnosisDetails, String> allergies;
    public static volatile SingularAttribute<EmrDiagnosisDetails, Character> xRays;
    public static volatile SingularAttribute<EmrDiagnosisDetails, String> progressnotes;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> dmCount;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigDecimal> diagnosisId;
    public static volatile SingularAttribute<EmrDiagnosisDetails, Date> clouddbUpdatedTimestamp;
    public static volatile SingularAttribute<EmrDiagnosisDetails, Date> recordCreationDate;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> visitStatusId;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> doctorId;
    public static volatile SingularAttribute<EmrDiagnosisDetails, Date> dateVisited;
    public static volatile SingularAttribute<EmrDiagnosisDetails, BigInteger> departmentId;

}