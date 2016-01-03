/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.card.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Kalyan
 */
public class Surgery implements Serializable{
    private String surgeryId;
    private String surgeryDesc;
    private Date dateOfSurgery;
    private String surgeryDetails;

    public Date getDateOfSurgery() {
        return dateOfSurgery;
    }

    public void setDateOfSurgery(Date dateOfSurgery) {
        this.dateOfSurgery = dateOfSurgery;
    }

    public String getSurgeryDesc() {
        return surgeryDesc;
    }

    public void setSurgeryDesc(String surgeryDesc) {
        this.surgeryDesc = surgeryDesc;
    }

    public String getSurgeryDetails() {
        return surgeryDetails;
    }

    public void setSurgeryDetails(String surgeryDetails) {
        this.surgeryDetails = surgeryDetails;
    }

    public String getSurgeryId() {
        return surgeryId;
    }

    public void setSurgeryId(String surgeryId) {
        this.surgeryId = surgeryId;
    }
    
    
    
}
