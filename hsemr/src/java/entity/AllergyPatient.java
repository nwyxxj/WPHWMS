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
public class AllergyPatient {
    
    private String patientNric;
    private String allergy;
    
    public AllergyPatient(String patientNric, String allergy){
        
        this.patientNric= patientNric;
        this.allergy= allergy;
    }

    public String getPatientNric() {
        return patientNric;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setPatientNric(String patientNric) {
        this.patientNric = patientNric;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
    
    
    
}
