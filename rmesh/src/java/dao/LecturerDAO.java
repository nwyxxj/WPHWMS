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

    public Lecturer retrieve(String userid) {
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

    public List<Lecturer> retrieveAll() {
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
}
