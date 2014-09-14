/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Lecturer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.*;

/**
 *
 * @author weiyi.ngow.2012
 */
public class LecturerDAO {

    public static Lecturer retrieve(String userid) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Lecturer lecturer = null;

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from LECTURER where LecturerID = ?");
            stmt.setString(1, userid);

            rs = stmt.executeQuery();
            while (rs.next()) {
                lecturer = new Lecturer(rs.getString(1), rs.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }

        return lecturer;
    }

    public static List<Lecturer> retrieveAll() {
        List<Lecturer> list = new ArrayList<Lecturer>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from LECTURER");

            rs = stmt.executeQuery();
            while (rs.next()) {
                Lecturer lecturer = new Lecturer(rs.getString(1), rs.getString(2));
                list.add(lecturer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return list;
    }
    
    public static void update(String userID, String password) {
         Connection conn = null;
        PreparedStatement preparedStatement = null;
        String query= "UPDATE lecturer SET lecturerPassword =? WHERE lecturerID =?";  
        
        try {
            conn = ConnectionManager.getConnection();

            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,password);
            preparedStatement.setString(2,userID);
            preparedStatement.executeUpdate();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionManager.close(conn,preparedStatement,null);
        }        
    }
    
    public static void delete(String userID) {
         Connection conn = null;
        PreparedStatement preparedStatement = null;
        String query= "DELETE FROM lecturer WHERE lecturerID =?";  
        
        try {
            conn = ConnectionManager.getConnection();

            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,userID);
            preparedStatement.executeUpdate();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionManager.close(conn,preparedStatement,null);
        }        
    }
    
    public static void add(String userID, String password) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        String queryLine = "INSERT INTO lecturer VALUES ('"
                + userID + "','" + password + "')";

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
