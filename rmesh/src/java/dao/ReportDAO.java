/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entity.Report;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author weiyi.ngow.2012
 */
public class ReportDAO {
//    public static Report retrieve(String scenarioID, String stateID, String type){
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        Report report = null; 
//        
//        try {
//            conn = ConnectionManager.getConnection();
//            stmt = conn.prepareStatement("select * from NURSE where nurseID = ?");
//            stmt.setString(1, scenarioID);
//            
//            rs = stmt.executeQuery();
//            while (rs.next()) {
//            //   nurse = new Nurse(rs.getString(1), rs.getString(2));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            ConnectionManager.close(conn, stmt, rs);
//        }
//        return nurse;
//    }

    
}
