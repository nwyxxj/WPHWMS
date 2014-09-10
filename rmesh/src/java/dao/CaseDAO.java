/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entity.Case;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hpkhoo.2012
 */
public class CaseDAO {
    public Case retrieve(String caseid){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Case c = null; 
        
        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from Case where caseID = ?");
            stmt.setString(1, caseid);
            
            rs = stmt.executeQuery();
            while (rs.next()) {
               c = new Case(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return c;
    }
   
}
