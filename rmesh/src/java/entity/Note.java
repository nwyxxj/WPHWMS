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
public class Note {
    
    private int noteID;
    private String multidisciplinaryNote;
    private int grpNumber; 
    private String grpMemberNames; 
    private String noteDatetime;
    private String practicalGroupID;

    public Note(int noteID, String multidisciplinaryNote, int grpNumber, String grpMemberNames, String noteDatetime, String practicalGroupID) {
        this.noteID = noteID;
        this.multidisciplinaryNote = multidisciplinaryNote;
        this.grpNumber = grpNumber;
        this.grpMemberNames = grpMemberNames;
        this.noteDatetime = noteDatetime;
        this.practicalGroupID = practicalGroupID;
    }

    public int getNoteID() {
        return noteID;
    }

    public String getMultidisciplinaryNote() {
        return multidisciplinaryNote;
    }

    public int getGrpNumber() {
        return grpNumber;
    }

    public String getGrpMemberNames() {
        return grpMemberNames;
    }

    public String getNoteDatetime() {
        return noteDatetime;
    }

    public String getPracticalGroupID() {
        return practicalGroupID;
    }

    public void setNoteID(int noteID) {
        this.noteID = noteID;
    }

    public void setMultidisciplinaryNote(String multidisciplinaryNote) {
        this.multidisciplinaryNote = multidisciplinaryNote;
    }

    public void setGrpNumber(int grpNumber) {
        this.grpNumber = grpNumber;
    }

    public void setGrpMemberNames(String grpMemberNames) {
        this.grpMemberNames = grpMemberNames;
    }

    public void setNoteDatetime(String noteDatetime) {
        this.noteDatetime = noteDatetime;
    }

    public void setPracticalGroupID(String practicalGroupID) {
        this.practicalGroupID = practicalGroupID;
    }

    
  
    
    
}
