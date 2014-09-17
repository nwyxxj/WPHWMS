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
import java.util.ArrayList;
import java.sql.Time;
import java.util.List;

/**
 *
 * @author hpkhoo.2012
 */
public class  ScenarioDAO{
  
    public static Scenario retrieve(String scenarioID){
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
               scenario = new Scenario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return scenario;
    }
    
    
     public static List<Scenario> retrieveAll(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Scenario> scenarioList = new ArrayList<Scenario>();
        
        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM scenario");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
               Scenario newScenario= new Scenario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
               scenarioList.add(newScenario);
            }
               
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return scenarioList;
    }
     
     
      public static void updateScenarioStatus(String scenarioID, String status){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("UPDATE scenario SET status = ? WHERE  scenarioID = ?");
            stmt.setString(1, status);
            stmt.setString(2, scenarioID);
            
            stmt.executeUpdate();
           

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt);
        }
      
    }
   
}