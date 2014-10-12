/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author hpkhoo.2012
 */
public class Scenario {
    
    private String scenarioID;
    private String scenarioName;
    private String scenarioDescription;
    private boolean scenarioStatus;
    private String admissionInfo;

    public Scenario(String scenarioID, String scenarioName, String scenarioDescription, boolean scenarioStatus, String admissionInfo) {
        this.scenarioID = scenarioID;
        this.scenarioName = scenarioName;
        this.scenarioDescription = scenarioDescription;
        this.scenarioStatus = scenarioStatus;
        this.admissionInfo = admissionInfo;
    }

    public String getScenarioID() {
        return scenarioID;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public String getScenarioDescription() {
        return scenarioDescription;
    }

    public boolean isScenarioStatus() {
        return scenarioStatus;
    }

    public void setScenarioID(String scenarioID) {
        this.scenarioID = scenarioID;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public void setScenarioDescription(String scenarioDescription) {
        this.scenarioDescription = scenarioDescription;
    }

    public void setScenarioStatus(boolean scenarioStatus) {
        this.scenarioStatus = scenarioStatus;
    }

    public void setAdmissionInfo(String admissionInfo) {
        this.admissionInfo = admissionInfo;
    }

    public String getAdmissionInfo() {
        return admissionInfo;
    }
    
    

  
    
    
         
}
