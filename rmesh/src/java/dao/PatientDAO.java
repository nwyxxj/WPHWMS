/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class PatientDAO {

    public static Patient retrieve(String patientNRIC) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Patient patient = null;

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from patient where patientNRIC = ?");
            stmt.setString(1, patientNRIC);

            rs = stmt.executeQuery();
            while (rs.next()) {
                patient = new Patient(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return patient;
    }

    public static void add(String patientNRIC, String firstName, String lastName, String gender, String dob, String maritalStatus, double weight, double height, String occupation, String race, String religion, String nationality, int wardID) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        String queryLine = "INSERT INTO patient VALUES ('"
                + patientNRIC + "','" + firstName + "','" + lastName + "','" + gender + "','" + dob + "','" + maritalStatus+ "','" + weight+ "','" + height+ "','" + occupation+ "','" + race+ "','" + religion+ "','" + nationality+ "','" + wardID + "')";

        try {
            conn = ConnectionManager.getConnection();
            preparedStatement = conn.prepareStatement(queryLine);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, preparedStatement, null);
        }
    }

}
