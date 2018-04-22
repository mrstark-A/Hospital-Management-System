/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.connectivity;
import View.wards;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class ward_controller {
    public String getDoctor(int wd_id) throws SQLException, ClassNotFoundException{
        String sql1 = "Select * From ward Where wd_id = " + wd_id;
        
        int emp_id = 0;
        String docName="";
       
        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = connection.createStatement();

        ResultSet rs1 = st.executeQuery(sql1);

        while (rs1.next()) {
            emp_id = rs1.getInt("doctor_incharge");
            
        }
        
        String sql2="Select * From doctor Where emp_id = " + emp_id;
        
        ResultSet rs2 = st.executeQuery(sql2);
        while (rs2.next()) {
           docName= rs2.getString("name");
            
        }
        return docName;
        
    }
    
    public String docName(int emp_id) throws ClassNotFoundException, SQLException{
       
        String docName="";
        String sql2="Select * From doctor Where emp_id = " + emp_id;
        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = connection.createStatement();

        ResultSet rs2 = st.executeQuery(sql2);
        while (rs2.next()) {
           docName= rs2.getString("name");
            
        }
        return docName;
        
    }
    
    public String getNurse(int wd_id) throws SQLException, ClassNotFoundException{
        String sql1 = "Select * From ward Where wd_id = " + wd_id;
        
        int emp_id = 0;
        String nurName="";
       
        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = connection.createStatement();

        ResultSet rs1 = st.executeQuery(sql1);

        while (rs1.next()) {
            emp_id = rs1.getInt("nurse_incharge");
            
        }
        
        String sql2="Select * From nurse Where emp_id = " + emp_id;
        
        ResultSet rs2 = st.executeQuery(sql2);
        while (rs2.next()) {
           nurName= rs2.getString("name");
            
        }
        return nurName;
        
    }
    
    public int getTotal(int wd_id) throws ClassNotFoundException, SQLException{
         
        String sql = "Select * From ward Where wd_id = " + wd_id;
        int no = 0;
       
        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = connection.createStatement();

        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            no = rs.getInt("totalRooms");
            
        }
        return no;
    }

    public int manageRooms(int wd_id) throws ClassNotFoundException, SQLException {
        
        String sql = "Select * From ward Where wd_id = " + wd_id;
        int no = 0;
       
        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = connection.createStatement();

        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            no = rs.getInt("vacanctRooms");
            
        }
        return no;
    }

    public void allocateRoom() throws ClassNotFoundException, SQLException {
        wards ward = new wards();
        int wd_id =ward.getWardID();
        int no = this.manageRooms(wd_id);
        String sql = "UPDATE ward SET vacanctRooms = "+ --no +" WHERE wd_id = "+ wd_id;
        System.out.print(no);
        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
        int res = st.executeUpdate();

    }

    public void deallocateRoom() throws ClassNotFoundException, SQLException {
        wards ward = new wards();
        int wd_id = ward.getWardID();
        int no = this.manageRooms(wd_id);
        System.out.print(no);
        String sql = "UPDATE ward SET vacanctRooms = " + (++no) + " WHERE wd_id = " + wd_id;
        
        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
        int res = st.executeUpdate();
    }
    
   /* public static void main(String args[]) throws ClassNotFoundException, SQLException{
        ward_controller wd=new ward_controller();
        wd.deallocateRoom();
    }*/
}
