/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class PracticalGroupDAO {
    
    public static PracticalGroup retrieve(String practicalGroupID) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PracticalGroup practicalGroup = null;
        
        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from practicalgroup where practicalGroupID = ?");
            stmt.setString(1, practicalGroupID);
            
            rs = stmt.executeQuery();
            while (rs.next()) {
                practicalGroup = new PracticalGroup(rs.getString(1), rs.getString(2), rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        
        return practicalGroup;
    }
    
}
