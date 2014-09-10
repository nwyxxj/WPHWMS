/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entity.Patient;
import entity.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class StateDAO {
        public static State retrieve(String stateID, int caseID){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        State state = null; 
        
        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from state where stateID = ? and caseID =?");
            stmt.setString(1, stateID);
            stmt.setInt(2, caseID);
            
            
            rs = stmt.executeQuery();
            while (rs.next()) {
                state = new State(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getDouble(9),rs.getString(10),rs.getString(11));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return state;
    }
}
