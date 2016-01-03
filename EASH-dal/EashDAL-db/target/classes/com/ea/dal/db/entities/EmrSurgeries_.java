package com.ea.dal.db.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2013-12-27T23:57:19")
@StaticMetamodel(EmrSurgeries.class)
public class EmrSurgeries_ { 

    public static volatile SingularAttribute<EmrSurgeries, Date> cardUpdatedTimestamp;
    public static volatile SingularAttribute<EmrSurgeries, Date> dateOfSurgery;
    public static volatile SingularAttribute<EmrSurgeries, BigInteger> hospitalId;
    public static volatile SingularAttribute<EmrSurgeries, BigInteger> visitId;
    public static volatile SingularAttribute<EmrSurgeries, Date> localdbUdatedTimestamp;
    public static volatile SingularAttribute<EmrSurgeries, String> surgeryDetails;
    public static volatile SingularAttribute<EmrSurgeries, BigInteger> patientId;
    public static volatile SingularAttribute<EmrSurgeries, String> surgeryDesc;
    public static volatile SingularAttribute<EmrSurgeries, String> preSurgeryMedications;
    public static volatile SingularAttribute<EmrSurgeries, BigInteger> branchId;
    public static volatile SingularAttribute<EmrSurgeries, Date> translogUpdatedTimestamp;
    public static volatile SingularAttribute<EmrSurgeries, Character> synchronizationRequired;
    public static volatile SingularAttribute<EmrSurgeries, String> postSurgeryMedications;
    public static volatile SingularAttribute<EmrSurgeries, BigInteger> dmCount;
    public static volatile SingularAttribute<EmrSurgeries, BigInteger> diagnosisId;
    public static volatile SingularAttribute<EmrSurgeries, Date> clouddbUpdatedTimestamp;
    public static volatile SingularAttribute<EmrSurgeries, BigDecimal> surgeryId;
    public static volatile SingularAttribute<EmrSurgeries, Date> recordCreationDate;
    public static volatile SingularAttribute<EmrSurgeries, String> complications;
    public static volatile SingularAttribute<EmrSurgeries, BigInteger> doctorId;
    public static volatile SingularAttribute<EmrSurgeries, String> surgeryObservations;
    public static volatile SingularAttribute<EmrSurgeries, Character> ehrFlag;
    public static volatile SingularAttribute<EmrSurgeries, BigInteger> departmentId;
    public static volatile SingularAttribute<EmrSurgeries, String> surgeryResults;
    public static volatile SingularAttribute<EmrSurgeries, String> progressNotes;

}