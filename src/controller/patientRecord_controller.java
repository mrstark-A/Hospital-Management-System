/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.connectivity;

import Model.section_model;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */

public class patientRecord_controller {
    //returns all past records
    public List<section_model> getAllRecords(int index) throws ClassNotFoundException, SQLException{
        ArrayList<section_model> datarecord = new ArrayList<section_model>();
        
        String sql="Select * from patient where Admission_PA_ID = "+index;
        
         Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
       
        ward_controller ward=new ward_controller();
        section_model record =new section_model();
        
        
        while(rs.next()){
           int pindex=rs.getInt("rc_index");
           
           record.setIndex(pindex);
           
          Date admitDate=rs.getDate("admittedDate");     
           record.setAdmitteddate(admitDate);
           
           Date dischargeDate=rs.getDate("dischargedDate");
           record.setDischargedDate(dischargeDate);
           
           String sickness =rs.getString("sickness");
           record.setSickness(sickness);
           
           int docId =rs.getInt("checkedBy");
          // String doctor =ward.getDoctor(docId);
           record.setCheckedBy(docId);
           
           String notes =rs.getString("notes");
           record.setNotes(notes);
           
           datarecord.add(record);
           
           
        }
        //System.out.print(datarecord.get(0).getIndex());
        return datarecord;
        
    }
    
    //Returns the record of patient's current sickness details
    public section_model getRecord(int index) throws ClassNotFoundException, SQLException{
        section_model datarecord = new section_model();
        
        String sql="Select * from patient where Admission_PA_ID = "+index;
        
         Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
       
        section_model record =new section_model();
        
        
        while(rs.next()){
           int pindex=rs.getInt("rc_index");
           
           record.setIndex(pindex);
           
          Date admitDate=rs.getDate("admittedDate");     
           record.setAdmitteddate(admitDate);
           
           Date dischargeDate=rs.getDate("dischargedDate");
           record.setDischargedDate(dischargeDate);
           
           String sickness =rs.getString("sickness");
           record.setSickness(sickness);
           
           int docId =rs.getInt("checkedBy");
          // String doctor =ward.getDoctor(docId);
           record.setCheckedBy(docId);
           
           String notes =rs.getString("notes");
           record.setNotes(notes);
           
           
           
        }
        //System.out.print(datarecord.get(0).getIndex());
        System.out.println("got sickness records");
        System.out.println(datarecord.getSickness());
        return record;
        
    }
    
    
}
