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
public class Medicine {
    private String medicineBarCode;
    private String medicineName;
    private String medicineDosage;
    private String medicineDatetime;
    private String routeAbbr;

    public Medicine(String medicineBarCode, String medicineName, String medicineDosage, String medicineDatetime, String routeAbbr) {
        this.medicineBarCode = medicineBarCode;
        this.medicineName = medicineName;
        this.medicineDosage = medicineDosage;
        this.medicineDatetime = medicineDatetime;
        this.routeAbbr = routeAbbr;
    }

    public String getMedicineBarCode() {
        return medicineBarCode;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getMedicineDosage() {
        return medicineDosage;
    }

    public String getMedicineDatetime() {
        return medicineDatetime;
    }

    public String getRouteAbbr() {
        return routeAbbr;
    }

    public void setMedicineBarCode(String medicineBarCode) {
        this.medicineBarCode = medicineBarCode;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setMedicineDosage(String medicineDosage) {
        this.medicineDosage = medicineDosage;
    }

    public void setMedicineDatetime(String medicineDatetime) {
        this.medicineDatetime = medicineDatetime;
    }

    public void setRouteAbbr(String routeAbbr) {
        this.routeAbbr = routeAbbr;
    }

    
    
}
