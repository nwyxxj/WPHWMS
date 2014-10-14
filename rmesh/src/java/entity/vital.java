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
public class Vital {
    private String vitalDatetime;
    private String patientNRIC; 
    private double temperature; 
    private int RR; 
    private int BPsystolic;
    private int BPdiastolic;
    private int HR; 
    private int SPO; 
    private String output;
    private String oralType;
    private String oralAmount;
    private String intravenousType;
    private String intravenousAmount;

    public Vital(String vitalDatetime, String patientNRIC, double temperature, int RR, int BPsystolic, int BPdiastolic, int HR, int SPO, String output, String oralType, String oralAmount, String intravenousType, String intravenousAmount) {
        this.vitalDatetime = vitalDatetime;
        this.patientNRIC = patientNRIC;
        this.temperature = temperature;
        this.RR = RR;
        this.BPsystolic = BPsystolic;
        this.BPdiastolic = BPdiastolic;
        this.HR = HR;
        this.SPO = SPO;
        this.output = output;
        this.oralType = oralType;
        this.oralAmount = oralAmount;
        this.intravenousType = intravenousType;
        this.intravenousAmount = intravenousAmount;
    }

    public String getVitalDatetime() {
        return vitalDatetime;
    }

    public String getPatientNRIC() {
        return patientNRIC;
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

    public String getOutput() {
        return output;
    }

    public String getOralType() {
        return oralType;
    }

    public String getOralAmount() {
        return oralAmount;
    }

    public String getIntravenousType() {
        return intravenousType;
    }

    public String getIntravenousAmount() {
        return intravenousAmount;
    }

    public void setVitalDatetime(String vitalDatetime) {
        this.vitalDatetime = vitalDatetime;
    }

    public void setPatientNRIC(String patientNRIC) {
        this.patientNRIC = patientNRIC;
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

    public void setOutput(String output) {
        this.output = output;
    }

    public void setOralType(String oralType) {
        this.oralType = oralType;
    }

    public void setOralAmount(String oralAmount) {
        this.oralAmount = oralAmount;
    }

    public void setIntravenousType(String intravenousType) {
        this.intravenousType = intravenousType;
    }

    public void setIntravenousAmount(String intravenousAmount) {
        this.intravenousAmount = intravenousAmount;
    }
    
    
}
