/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import Database.connectivity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class index {
    public int getEmployeeId() throws ClassNotFoundException, SQLException{
        int id = 0;
        String sql = "SELECT * FROM doctor ORDER BY emp_id DESC LIMIT 1";
        Connection connection;
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();
        
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        while (rs.next())
        {
            id = rs.getInt("emp_id");
        }
        
        return ++id;
        
    }
    
     public int getPatientId() throws ClassNotFoundException, SQLException{
        int id = 0;
        String sql = "SELECT * FROM admission ORDER BY PA_ID DESC LIMIT 1";
        Connection connection;
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();
        
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        while (rs.next())
        {
            id = rs.getInt("PA_ID");
        }
        
        return ++id;
        
    }
     
     public int getNurseId() throws ClassNotFoundException, SQLException{
        int id = 0;
        String sql = "SELECT * FROM nurse ORDER BY emp_id DESC LIMIT 1";
        Connection connection;
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();
        
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        while (rs.next())
        {
            id = rs.getInt("emp_id");
        }
        
        return ++id;
        
    }
    
   
    
}
