/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ea.dal.card.entities;

import java.io.Serializable;

/**
 *
 * @author Kalyan
 */
public class LabTest implements Serializable{
    private String testId;
    private String testName;
    private int lowerBoundary;
    private int upperBoundary;
    private int actualValues;
    private String diagnosisSummary;

    public int getActualValues() {
        return actualValues;
    }

    public void setActualValues(int actualValues) {
        this.actualValues = actualValues;
    }

    public String getDiagnosisSummary() {
        return diagnosisSummary;
    }

    public void setDiagnosisSummary(String diagnosisSummary) {
        this.diagnosisSummary = diagnosisSummary;
    }

    public int getLowerBoundary() {
        return lowerBoundary;
    }

    public void setLowerBoundary(int lowerBoundary) {
        this.lowerBoundary = lowerBoundary;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getUpperBoundary() {
        return upperBoundary;
    }

    public void setUpperBoundary(int upperBoundary) {
        this.upperBoundary = upperBoundary;
    }
    
}
