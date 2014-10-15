/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class VitalDAO {
    
//    public static void updateVital(String patientNRIC, double temperature, int RR, int BPsystolic, int BPdiastolic, int HR, int SPO, String intake, String output) {
//        Connection conn = null;
//        PreparedStatement preparedStatement = null;
//        //String query = "UPDATE vital SET vitalDatetime = ?, patientNRIC =?, temperature = ?, RR = ?, BPsystolic = ?, BPdiastolic = ?,  HR = ?, SPO = ?, intake = ?, output = ?";
//        String query = "INSERT INTO vital (vitalDatetime, patientNRIC, temperature, RR, BPsystolic, BPdiastolic, HR, SPO, intake, output) VALUES (?,?,?,?,?,?,?,?,?,?)";
//
//        try {
//            conn = ConnectionManager.getConnection();
//            
//            Date dateTime= new Date();
//            preparedStatement = conn.prepareStatement(query);
//            preparedStatement.setString(1, dateTime.toString());
//            preparedStatement.setString(2, patientNRIC);
//            preparedStatement.setDouble(3, temperature);
//            preparedStatement.setInt(4, RR);
//            preparedStatement.setInt(5, BPsystolic);
//            preparedStatement.setInt(6, BPdiastolic);
//            preparedStatement.setInt(7, HR);
//            preparedStatement.setInt(8, SPO);
//            preparedStatement.setString(9, intake);
//            preparedStatement.setString(10, output);
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            ConnectionManager.close(conn, preparedStatement, null);
//        }
//    }
    
     public static void updateVital(String patientNRIC, double temperature, int RR, int BPsystolic, int BPdiastolic, int HR, int SPO, String output, String oralType, String oralAmount, String intravenousType, String intravenousAmount) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        //String query = "UPDATE vital SET vitalDatetime = ?, patientNRIC =?, temperature = ?, RR = ?, BPsystolic = ?, BPdiastolic = ?,  HR = ?, SPO = ?, intake = ?, output = ?";
        String query = "INSERT INTO vital (vitalDatetime, patientNRIC, temperature, RR, BPsystolic, BPdiastolic, HR, SPO, output, oralType, oralAmount, intravenousType, intravenousAmount) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            conn = ConnectionManager.getConnection();
            
            Date dateTime= new Date();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, dateTime.toString());
            preparedStatement.setString(2, patientNRIC);
            preparedStatement.setDouble(3, temperature);
            preparedStatement.setInt(4, RR);
            preparedStatement.setInt(5, BPsystolic);
            preparedStatement.setInt(6, BPdiastolic);
            preparedStatement.setInt(7, HR);
            preparedStatement.setInt(8, SPO);
            preparedStatement.setString(9, output);
            preparedStatement.setString(10, oralType);
            preparedStatement.setString(11, oralAmount);
            preparedStatement.setString(12, intravenousType);
            preparedStatement.setString(13, intravenousAmount);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, preparedStatement, null);
        }
    }
    
}
