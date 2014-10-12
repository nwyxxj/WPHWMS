/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import entity.Note;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hpkhoo.2012
 */
public class NoteDAO {
    
    public static Note retrieve(String noteID) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Note note = null;

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from note where noteID = ?");
            stmt.setString(1, noteID);

            rs = stmt.executeQuery();
            while (rs.next()) {
                note = new Note(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return note;
    }
    
    
    public static List<Note> retrieveAll() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Note> noteList = new ArrayList<Note>();

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM note");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Note newNote = new Note(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
                //Note newNote = new Note(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                noteList.add(newNote);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return noteList;
    }
    
    public static void insertNote(int noteID, String multidisciplinaryNote, int grpNumber, String grpMemberNames, String practicalGroupID) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Note note = null;

        try {
            conn = ConnectionManager.getConnection();
//            stmt = conn.prepareStatement("INSERT INTO note(multidisciplinaryNote,tutorialGroup,grpMemberName,noteDate,nurseID) VALUES (?,?,?,?,?)");
//            stmt = conn.prepareStatement("INSERT INTO note(multidisciplinaryNote,grpNumber,grpMemberNames,notedatetime,practicalGroupID) VALUES (?,?,?,?,?)");
            stmt = conn.prepareStatement("INSERT INTO note(noteID,multidisciplinaryNote,grpNumber,grpMemberNames,noteDatetime,practicalGroupID) VALUES (?,?,?,?,?,?)");

            Date dateTime= new Date();
            stmt.setInt(1, noteID);
            stmt.setString(2, multidisciplinaryNote);
            stmt.setInt(3, grpNumber);
            stmt.setString(4, grpMemberNames);
            stmt.setString(5, dateTime.toString());
            stmt.setString(6, practicalGroupID);
            stmt.executeUpdate();
       
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt);
        }
    }
    
}
