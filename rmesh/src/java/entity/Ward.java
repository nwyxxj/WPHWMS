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
public class Ward {
    private String wardID;
    private boolean bedNumber;
    private boolean availabilityStatus;

    public Ward(String wardID, boolean bedNumber, boolean availabilityStatus) {
        this.wardID = wardID;
        this.bedNumber = bedNumber;
        this.availabilityStatus = availabilityStatus;
    }

    public String getWardID() {
        return wardID;
    }

    public boolean isBedNumber() {
        return bedNumber;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setWardID(String wardID) {
        this.wardID = wardID;
    }

    public void setBedNumber(boolean bedNumber) {
        this.bedNumber = bedNumber;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
    
    
}
