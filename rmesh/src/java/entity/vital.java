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
public class vital {
    private String vitalDatetime;
    private double temperature; 
    private int RR; 
    private int BPsystolic;
    private int BPdiastolic;
    private int HR; 
    private int SPO; 
    private String intake; 
    private String output; 
    private String patientNRIC; 

    public vital(String vitalDatetime, double temperature, int RR, int BPsystolic, int BPdiastolic, int HR, int SPO, String intake, String output, String patientNRIC) {
        this.vitalDatetime = vitalDatetime;
        this.temperature = temperature;
        this.RR = RR;
        this.BPsystolic = BPsystolic;
        this.BPdiastolic = BPdiastolic;
        this.HR = HR;
        this.SPO = SPO;
        this.intake = intake;
        this.output = output;
        this.patientNRIC = patientNRIC;
    }

    public String getVitalDatetime() {
        return vitalDatetime;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getRR() {
        return RR;
    }

    public int getBPsystolic() {
        return BPsystolic;
    }

    public int getBPdiastolic() {
        return BPdiastolic;
    }

    public int getHR() {
        return HR;
    }

    public int getSPO() {
        return SPO;
    }

    public String getIntake() {
        return intake;
    }

    public String getOutput() {
        return output;
    }

    public String getPatientNRIC() {
        return patientNRIC;
    }

    public void setVitalDatetime(String vitalDatetime) {
        this.vitalDatetime = vitalDatetime;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setRR(int RR) {
        this.RR = RR;
    }

    public void setBPsystolic(int BPsystolic) {
        this.BPsystolic = BPsystolic;
    }

    public void setBPdiastolic(int BPdiastolic) {
        this.BPdiastolic = BPdiastolic;
    }

    public void setHR(int HR) {
        this.HR = HR;
    }

    public void setSPO(int SPO) {
        this.SPO = SPO;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public void setPatientNRIC(String patientNRIC) {
        this.patientNRIC = patientNRIC;
    }
    
    
    
}
