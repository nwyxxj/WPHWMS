/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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

    public static State retrieve(String stateID, String scenarioID) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        State state = null;

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from state where stateID = ? and scenarioID =?");
            stmt.setString(1, stateID);
            stmt.setString(2, scenarioID);

            rs = stmt.executeQuery();
            while (rs.next()) {
                //state = new State(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getString(10), rs.getString(11));
                state = new State(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return state;
    }

    public static State retrieveActivateScenarioPatient(String scenarioID) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        State state = null;

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from state where scenarioID =?");
            stmt.setString(1, scenarioID);

            rs = stmt.executeQuery();
            while (rs.next()) {
                state = new State(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return state;
    }

//    public static void add(String stateID, String scenarioID, String RR, String BP, String HR, String SPO, String intake, String output, double temperature, String stateDescription, String patientNRIC) {
//        Connection conn = null;
//        PreparedStatement preparedStatement = null;
//        String queryLine = "INSERT INTO state VALUES ('"
//                + stateID + "','" + scenarioID + "','" + RR + "','" + BP+ "','" + HR+ "','" + SPO+ "','" + intake + "','" + output + "','" + temperature + "','" + stateDescription + "','" + patientNRIC +  "')";
//
//        try {
//            conn = ConnectionManager.getConnection();
//            preparedStatement = conn.prepareStatement(queryLine);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            ConnectionManager.close(conn, preparedStatement, null);
//        }
//    }
    public static void add(String stateID, String scenarioID, String stateDescription, boolean stateStatus, String patientNRIC) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        String queryLine = "INSERT INTO state VALUES ('"
                + stateID + "','" + scenarioID + "','" + stateDescription + "','" + "','" + stateStatus + patientNRIC + "')";

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

    public static void updateState(String stateID, String scenarioID, String stateDescription, boolean stateStatus, String patientNRIC) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        String query = "UPDATE state SET stateDescription = ?, stateStatus =?, patientNRIC = ? WHERE stateID =? and scenarioID = ?";

        try {
            conn = ConnectionManager.getConnection();

            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, stateDescription);
            preparedStatement.setBoolean(2, stateStatus);
            preparedStatement.setString(3, patientNRIC);
            preparedStatement.setString(4, stateID);
            preparedStatement.setString(5, scenarioID);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, preparedStatement, null);
        }
    }

    public static void delete(String scenarioID) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        String query = "DELETE FROM state WHERE scenarioID =?";

        try {
            conn = ConnectionManager.getConnection();

            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, scenarioID);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, preparedStatement, null);
        }
    }
}
