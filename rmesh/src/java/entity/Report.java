/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author weiyi.ngow.2012
 */
public class Report {
    private String reportDatetime;
    private String reportName;
    private String reportFile;
    private boolean dispatchStatus; 
    private String scenarioID; 
    private String stateID;

    public Report(String reportDatetime, String reportName, String reportFile, boolean dispatchStatus, String scenarioID, String stateID) {
        this.reportDatetime = reportDatetime;
        this.reportName = reportName;
        this.reportFile = reportFile;
        this.dispatchStatus = dispatchStatus;
        this.scenarioID = scenarioID;
        this.stateID = stateID;
    }

    public String getReportDatetime() {
        return reportDatetime;
    }

    public String getReportName() {
        return reportName;
    }

    public String getReportFile() {
        return reportFile;
    }

    public boolean isDispatchStatus() {
        return dispatchStatus;
    }

    public String getScenarioID() {
        return scenarioID;
    }

    public String getStateID() {
        return stateID;
    }

    public void setReportDatetime(String reportDatetime) {
        this.reportDatetime = reportDatetime;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public void setReportFile(String reportFile) {
        this.reportFile = reportFile;
    }

    public void setDispatchStatus(boolean dispatchStatus) {
        this.dispatchStatus = dispatchStatus;
    }

    public void setScenarioID(String scenarioID) {
        this.scenarioID = scenarioID;
    }

    public void setStateID(String stateID) {
        this.stateID = stateID;
    }
   
    
}
