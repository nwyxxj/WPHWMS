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
public class PracticalGroup {
    private String practicalGroupID; 
    private String practicalGroupPassword;
    private String lecturerID; 

    public PracticalGroup(String practicalGroupID, String practicalGroupPassword, String lecturerID) {
        this.practicalGroupID = practicalGroupID;
        this.practicalGroupPassword = practicalGroupPassword;
        this.lecturerID = lecturerID;
    }

    public String getPracticalGroupID() {
        return practicalGroupID;
    }

    public String getPracticalGroupPassword() {
        return practicalGroupPassword;
    }

    public String getLecturerID() {
        return lecturerID;
    }

    public void setPracticalGroupID(String practicalGroupID) {
        this.practicalGroupID = practicalGroupID;
    }

    public void setPracticalGroupPassword(String practicalGroupPassword) {
        this.practicalGroupPassword = practicalGroupPassword;
    }

    public void setLecturerID(String lecturerID) {
        this.lecturerID = lecturerID;
    }
    
    
}
