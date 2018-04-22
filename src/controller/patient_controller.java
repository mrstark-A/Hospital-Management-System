/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.connectivity;
import Model.patient_model;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class patient_controller {
    
     public boolean patientAdmission(patient_model patient) throws SQLException, ClassNotFoundException{
        String sql="Insert into admission values(?,?,?,?,?,?,?,?,?,?)";
        
        
        Connection connection;
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();
        
        
         
        PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
         
         
         st.setObject(1,patient.getPA_ID());
         st.setObject(2,patient.getTitle());
         st.setObject(3,patient.getName());
         st.setObject(4,patient.getDob());
         st.setObject(5,patient.getNic());
         st.setObject(6,patient.getContactNo1());
         st.setObject(7,patient.getContactNo2());
         st.setObject(8,patient.getAddress());
         st.setObject(9,patient.getAllergies());
         st.setObject(10, patient.getNotes());
         
         
         
         
         
         
        int res = st.executeUpdate();
        System.out.print("Done");
        
        if (res > 0) {
            return true;

        }
        return false;
        
    }
     
    public patient_model viewPatient(int index) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM admission where PA_ID = "+index;
        
        Connection connection;
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();
        
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        patient_model patient =new patient_model();
        while (rs.next())
        {
            int id = rs.getInt("PA_ID");
            patient.setPA_ID(id);
            String title =rs.getString("title");
            patient.setTitle(title);
            String name = rs.getString("name");
            patient.setName(name);
            String address = rs.getString("address");
            patient.setAddress(address);
            String nic =rs.getString("nic");        
            patient.setNic(nic);
            int contactNo1 = rs.getInt("contactNo");
            patient.setContactNo1(contactNo1);
            int contactNo2 = rs.getInt("contactNo2");
            patient.setContactNo1(contactNo2);
            String allergies =rs.getString("allergies");
            patient.setAllergies(allergies);
            String notes =rs.getString("notes");
            patient.setNotes(notes);

            
            
        } 
        
        return patient;
        
    }
    
    public patient_model viewPatient(String index) throws ClassNotFoundException, SQLException{
         String sql = "SELECT * FROM admission where nic = "+index;
        
        Connection connection;
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();
        
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        patient_model patient =new patient_model();
        while (rs.next())
        {
            int id = rs.getInt("PA_ID");
            patient.setPA_ID(id);
            String title =rs.getString("title");
            patient.setTitle(title);
            String name = rs.getString("name");
            patient.setName(name);
            String address = rs.getString("address");
            patient.setAddress(address);
            String nic =rs.getString("nic");        
            patient.setNic(nic);
            int contactNo1 = rs.getInt("contactNo");
            patient.setContactNo1(contactNo1);
            int contactNo2 = rs.getInt("contactNo2");
            patient.setContactNo1(contactNo2);
            String allergies =rs.getString("allergies");
            patient.setAllergies(allergies);
            String notes =rs.getString("notes");
            patient.setNotes(notes);

            
            
        } 
        
        return patient;
    
    }
}
