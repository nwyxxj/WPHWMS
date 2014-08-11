/*
* Editted by SQ
 * To change this template, choose Tools | Templates
 * and open the template in the editor. 
 */
package dao;

import connection.ConnectionManager;
import entity.Baby;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaiwen.teh.2012
 */
public class BabyDAO {

    private static final String TBLNAME = "baby";

    public static void insertBaby(Baby baby) {

        int babyId = baby.getBabyId();
        String babyName = baby.getBabyName();
        String fatherName = baby.getFatherName();
        String motherName = baby.getMotherName();
        double weight = baby.getWeight();
        double height = baby.getHeight();
        try {
            Connection conn = ConnectionManager.getConnection();
            PreparedStatement ps;
            String insertBaby = "insert into baby(babyId, babyName, fatherName, motherName, weight, height) Values(?,?,?,?,?,?);";
            ps = conn.prepareStatement(insertBaby);
            ps.setInt(1, babyId);
            ps.setString(2, babyName);
            ps.setString(3, fatherName);
            ps.setString(4, motherName);
            ps.setDouble(5, weight);
            ps.setDouble(6, height);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteBaby(int babyId) {
        Connection conn = null;
        PreparedStatement stmt = null;
        String sql = "";
        try {
            conn = ConnectionManager.getConnection();

            sql = "DELETE FROM " + TBLNAME + " where babyId = ? ";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, babyId);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectionManager.close(conn, stmt);
        }
    }

    public static List<Baby> retrieveBabies() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "";
        List<Baby> results = new ArrayList<Baby>();

        try {
            conn = ConnectionManager.getConnection();

            sql = "SELECT babyId, babyName, fatherName, motherName, weight, height FROM " + TBLNAME;
            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {
                //Retrieve by column name
                int babyId = rs.getInt("babyId");
                String babyName = rs.getString("babyName");
                String fatherName = rs.getString("fatherName");
                String motherName = rs.getString("motherName");
                double weight = rs.getDouble("weight");
                double height = rs.getDouble("height");

                Baby obj = new Baby(babyId, babyName, fatherName, motherName, weight, height);
                results.add(obj);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectionManager.close(conn, stmt, rs);

        }
        return results;
    }

    public static void updateBaby(Baby baby) {
        Connection conn = null;
        PreparedStatement stmt = null;
        String sql = "";
        try {
            conn = ConnectionManager.getConnection();

            sql = "UPDATE " + TBLNAME + " set babyId=?, babyName=?, fatherName=?, motherName=?, weight=?, height=? " + " where babyId = ? ";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, baby.getBabyId());
            stmt.setString(2, baby.getBabyName());
            stmt.setString(3, baby.getFatherName());
            stmt.setString(4, baby.getMotherName());
            stmt.setDouble(5, baby.getWeight());
            stmt.setDouble(6, baby.getHeight());
            stmt.setInt(7, baby.getBabyId());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            //
        } finally {
            ConnectionManager.close(conn, stmt);
        }
    }
}