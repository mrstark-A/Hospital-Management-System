/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.connectivity;
import Model.Doctor_model;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;



/**
 *
 * @author user
 */
public class Doctor_controller {
    public Doctor_model viewRecords2(String index) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM doctor where nic="+index;
        
        Connection connection;
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();
        
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        Doctor_model doc =new Doctor_model();
        while (rs.next())
        {
            int id = rs.getInt("emp_id");
            doc.setEmp_id(id);
            String role =rs.getString("role");
            doc.setRole(role);
            String name = rs.getString("name");
            doc.setName(name);
            String address = rs.getString("address");
            doc.setAddress(address);
            String nic =rs.getString("nic");
            doc.setNic(nic);
            int contactNo = rs.getInt("contactNo");
            doc.setContactNo(contactNo);
            String speciality =rs.getString("speciality");
            doc.setSpecility(speciality);
            Date joinedDate =rs.getDate("joinedDate");
            doc.setJoinedDate(joinedDate);


            
        } 
        return doc;
    
    }
    public Doctor_model viewRecords1(int index) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM doctor where emp_id="+index;
        
        Connection connection;
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();
        
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        Doctor_model doc =new Doctor_model();
        while (rs.next())
        {
            int id = rs.getInt("emp_id");
            doc.setEmp_id(id);
            String name = rs.getString("name");
            doc.setName(name);
            String address = rs.getString("address");
            doc.setAddress(address);
            String nic =rs.getString("nic");
            doc.setNic(nic);
            int contactNo = rs.getInt("contactNo");
            doc.setContactNo(contactNo);
            String speciality =rs.getString("speciality");
            doc.setSpecility(speciality);
            Date joinedDate =rs.getDate("joinedDate");
            doc.setJoinedDate(joinedDate);
            String role =rs.getString("role");
            doc.setRole(role);


            
        } 
        
        
        return doc;
        
    }
    
    public boolean addDoctor(Doctor_model doctor) throws SQLException, ClassNotFoundException{
        String sql="Insert into doctor values(?,?,?,?,?,?,?,?)";
        
        Connection connection;
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();
        
         PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
         st.setObject(1,doctor.getEmp_id());
         st.setObject(2,doctor.getName());
         st.setObject(3,doctor.getNic());
         st.setObject(4,doctor.getAddress());
         st.setObject(5,doctor.getContactNo());
         st.setObject(6,doctor.getSpecility());
         st.setObject(7,doctor.getJoinedDate());
         st.setObject(8,doctor.getRole());
        
         
        int res = st.executeUpdate();
        
        if (res > 0) {
            return true;

        }
        return false;
        
    }
    
    public void updateDoctor(Doctor_model doctor){}
    
}
