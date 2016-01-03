/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.db;

import com.ea.dal.db.entities.EmrPatients;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Kalyan
 */
public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmrPU");
        javax.persistence.EntityManager eManager = emf.createEntityManager();

        EmrPatients patientInfo1 = new EmrPatients();
        patientInfo1.setPatientId(BigDecimal.TEN);
        patientInfo1.setFirstName("Scott2");
        patientInfo1.setLastName("Williams");
        
        EmrPatients patientInfo2 = new EmrPatients();
        patientInfo2.setPatientId(BigDecimal.ONE);
        patientInfo2.setFirstName("Scott1");
        patientInfo2.setLastName("Williams");
        System.out.println("patientInfo created");
        
        
        eManager.getTransaction().begin();
        eManager.merge(patientInfo1);
        eManager.merge(patientInfo2);
        //EmrPatients patientInfo1 = (EmrPatients) eManager.createNamedQuery("EmrPatients.findByPatientId").setParameter("patientId", BigInteger.ZERO).getSingleResult();
//        List<EmrPatients> patients =  eManager.createNamedQuery("EmrPatients.findByFirstName").setParameter("firstName", "Scott").getResultList();
//        System.out.println("first name :"+patients.get(0).getPatientId());
//        System.out.println("first name :"+patients.get(1).getPatientId());
        eManager.getTransaction().commit();
        System.out.println("patientInfo persisted");
        eManager.close();
        emf.close();
    }
}
