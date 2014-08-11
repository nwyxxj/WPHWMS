/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author kaiwen.teh.2012
 */
public class Baby {
    
    private int babyId;
    private String babyName;
    private String fatherName;
    private String motherName;
    private double weight;
    private double height;

    public Baby(int babyId, String babyName, String fatherName, String motherName, double weight, double height) {
        this.babyId = babyId;
        this.babyName = babyName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.weight = weight;
        this.height = height;
    }

    public int getBabyId() {
        return babyId;
    }

    public void setBabyId(int babyId) {
        this.babyId = babyId;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    
}
