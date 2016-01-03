package com.ea.dal.db.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2013-12-27T23:57:19")
@StaticMetamodel(EmrLabTests.class)
public class EmrLabTests_ { 

    public static volatile SingularAttribute<EmrLabTests, Date> cardUpdatedTimestamp;
    public static volatile SingularAttribute<EmrLabTests, BigInteger> dmCount;
    public static volatile SingularAttribute<EmrLabTests, String> testName;
    public static volatile SingularAttribute<EmrLabTests, BigDecimal> testId;
    public static volatile SingularAttribute<EmrLabTests, BigInteger> upperBoundary;
    public static volatile SingularAttribute<EmrLabTests, BigInteger> diagnosisId;
    public static volatile SingularAttribute<EmrLabTests, Date> clouddbUpdatedTimestamp;
    public static volatile SingularAttribute<EmrLabTests, BigInteger> hospitalId;
    public static volatile SingularAttribute<EmrLabTests, BigInteger> visitId;
    public static volatile SingularAttribute<EmrLabTests, Date> recordCreationDate;
    public static volatile SingularAttribute<EmrLabTests, String> diagnosisSummary;
    public static volatile SingularAttribute<EmrLabTests, BigInteger> patientId;
    public static volatile SingularAttribute<EmrLabTests, BigInteger> actualValues;
    public static volatile SingularAttribute<EmrLabTests, BigInteger> doctorId;
    public static volatile SingularAttribute<EmrLabTests, BigInteger> branchId;
    public static volatile SingularAttribute<EmrLabTests, BigInteger> lowerBoundary;
    public static volatile SingularAttribute<EmrLabTests, Date> translogUpdatedTimestamp;
    public static volatile SingularAttribute<EmrLabTests, Date> localdbUpdatedTimestamp;
    public static volatile SingularAttribute<EmrLabTests, Character> synchronizationRequired;
    public static volatile SingularAttribute<EmrLabTests, BigInteger> departmentId;

}