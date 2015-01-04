/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Scenario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 *
 * @author Administrator
 */
public class ScenarioDAO {

    public static Scenario retrieve(String scenarioID) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Scenario scenario = null;

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from scenario where scenarioID = ?");
            stmt.setString(1, scenarioID);

            rs = stmt.executeQuery();
            while (rs.next()) {
                scenario = new Scenario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return scenario;
    }

    public static Scenario retrieveActivatedScenario() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Scenario scenario = null;

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from scenario where scenarioStatus = ?");
            stmt.setInt(1, 1);

            rs = stmt.executeQuery();
            while (rs.next()) {
                scenario = new Scenario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return scenario;
    }
 
    public static void add(String scenarioID, String scenarioName, String scenarioDescription, int scenarioStatus, String admissionNote, String wardID, int bedNumber) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        String query = "INSERT INTO scenario (scenarioID, scenarioName, scenarioDescription, scenarioStatus, admissionNote, wardID, bedNumber) VALUES (?,?,?,?,?,?,?)";

        try {
            conn = ConnectionManager.getConnection();
            preparedStatement = conn.prepareStatement(query);
            
            preparedStatement.setString(1, scenarioID);
            preparedStatement.setString(2, scenarioName);
            preparedStatement.setString(3, scenarioDescription);
            preparedStatement.setInt(4, scenarioStatus);
            preparedStatement.setString(5, admissionNote);
            preparedStatement.setString(6, wardID);
            preparedStatement.setInt(7, bedNumber);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, preparedStatement, null);
        }
    }

    public static List<Scenario> retrieveAll() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Scenario> scenarioList = new ArrayList<Scenario>();

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM scenario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Scenario newScenario = new Scenario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
                scenarioList.add(newScenario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return scenarioList;
    }

    public static void updateScenarioStatus(String scenarioID, int scenarioStatus) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("UPDATE scenario SET scenarioStatus = ? WHERE  scenarioID = ?");
            stmt.setInt(1, scenarioStatus);
            stmt.setString(2, scenarioID);

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt);
        }

    }

    public static void update(String scenarioID, String scenarioName, String scenarioDescription, int scenarioStatus, String admissionNote) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        String query = "UPDATE scenario SET  scenarioName=?, scenarioDescription=?, scenarioStatus =?, admissionNote =?  WHERE scenarioID =?";

        try {
            conn = ConnectionManager.getConnection();

            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, scenarioName);
            preparedStatement.setString(2, scenarioDescription);
            preparedStatement.setInt(3, scenarioStatus);
            preparedStatement.setString(4, admissionNote);
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
        String query = "DELETE FROM scenario WHERE scenarioID =?;";

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
