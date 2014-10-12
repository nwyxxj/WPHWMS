/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Administrator
 */
public class State {
    private String stateID; 
    private String scenarioID; 
    private String stateDescription;
    private boolean stateStatus;
    private String patientNRIC; 

    public State(String stateID, String scenarioID, String stateDescription, boolean stateStatus, String patientNRIC) {
        this.stateID = stateID;
        this.scenarioID = scenarioID;
        this.stateDescription = stateDescription;
        this.stateStatus = stateStatus;
        this.patientNRIC = patientNRIC;
    }

    public String getStateID() {
        return stateID;
    }

    public String getScenarioID() {
        return scenarioID;
    }

    public String getStateDescription() {
        return stateDescription;
    }

    public boolean getStateStatus() {
        return stateStatus;
    }

    public String getPatientNRIC() {
        return patientNRIC;
    }

    public void setStateID(String stateID) {
        this.stateID = stateID;
    }

    public void setScenarioID(String scenarioID) {
        this.scenarioID = scenarioID;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    public void setStateStatus(boolean stateStatus) {
        this.stateStatus = stateStatus;
    }

    public void setPatientNRIC(String patientNRIC) {
        this.patientNRIC = patientNRIC;
    }

    
    
    
}
