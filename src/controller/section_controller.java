/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.connectivity;
import Model.section_model;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class section_controller {

    public boolean admitPatient(section_model patient) throws ClassNotFoundException, SQLException {
        String sql = "Insert into patient(sickness, checkedBy, assignedBy, admittedDate, notes, Admission_PA_ID, Ward_wd_ID) "
                + "values(?,?,?,?,?,?,?)";

        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
       
        st.setString(1, patient.getSickness());
        st.setInt(2, patient.getCheckedBy());
        st.setInt(3, patient.getAssignedBy());
        st.setObject(4, patient.getAdmitteddate());
        st.setString(5, patient.getNotes());
        st.setInt(6, patient.getPa_id());
        st.setInt(7, patient.getWd_id());

        return st.execute();
//                int res = 5;
//        if (res > 0) {
//            return true;
//
//        }
//        return false;
    }

    public int viewAdmission(int index) throws ClassNotFoundException, SQLException {
        String sql1 = "SELECT * FROM patient WHERE Admission_PA_ID = "+index ;

        int patientIndex=0;
        String admittedDate="";
        String dischargedDate="";
        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = (Statement) connection.createStatement();

        ResultSet rs1 = (ResultSet) st.executeQuery(sql1);

        while (rs1.next()) {
            patientIndex = rs1.getInt("rc_index");
            admittedDate = rs1.getString("admittedDate");
            dischargedDate = rs1.getString("dischargedDate");
           
            

        }
        System.out.println(patientIndex); 
        if(admittedDate==" "){
            System.out.print("admittedDAte error");
            return 0;
        }else if(dischargedDate !=null){
            System.out.println("discharged date error is "+ dischargedDate);
            return 0;
        }else{
            return patientIndex;
        }
    }

    public void dischargePatient(int index, Date date) throws ClassNotFoundException, SQLException {

        section_controller patient = new section_controller();
       
        ward_controller wd = new ward_controller();

        int pt = patient.viewAdmission(index);
        System.out.println(pt);

        if (pt==0) {
            JOptionPane.showMessageDialog(null, "Error in Entry!");
        } else {
            String sql = "Update patient set dischargedDate = ? where rc_index = " + pt;

            Connection connection;

            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) connectivity.getDBConnection().getConnection();

            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            
            st.setObject(1,date);
            
            int res = st.executeUpdate();
            wd.deallocateRoom();
            System.out.print(date);
        }

    }

}
