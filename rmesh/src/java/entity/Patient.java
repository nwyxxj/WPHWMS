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
public class Patient {
    private String patientNRIC; 
    private String firstName; 
    private String lastName;
    private String gender; 
    private String dob;
    private String wardID;
    private int bedNumber;

    public Patient(String patientNRIC, String firstName, String lastName, String gender, String dob, String wardID, int bedNumber) {
        this.patientNRIC = patientNRIC;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.wardID = wardID;
        this.bedNumber = bedNumber;
    }

    
    
    public String getPatientNRIC() {
        return patientNRIC;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getWardID() {
        return wardID;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setPatientNRIC(String patientNRIC) {
        this.patientNRIC = patientNRIC;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setWardID(String wardID) {
        this.wardID = wardID;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }
    
    
    
    
    
}
