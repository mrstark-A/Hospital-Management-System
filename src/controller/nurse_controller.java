/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.connectivity;
import Model.Nurse_model;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class nurse_controller {

    public boolean addNurse(Nurse_model nurse) throws ClassNotFoundException, SQLException {
        String sql = "Insert into nurse values(?,?,?,?,?,?,?,?)";

        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);

        st.setObject(1, nurse.getId());
        st.setObject(2, nurse.getRole());
        st.setObject(3, nurse.getName());
        st.setObject(4, nurse.getNic());
        st.setObject(5, nurse.getAddress());
        st.setObject(6, nurse.getContactNo());
        st.setObject(7, nurse.getJoinedDate());
        st.setObject(8, nurse.getWd_id());

        int res = st.executeUpdate();
        
        return res > 0;

    }

    public Nurse_model viewNurse1(int index) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM nurse where emp_id=" + index;

        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = connection.createStatement();

        ResultSet rs = st.executeQuery(sql);

        Nurse_model nurse = new Nurse_model();
        while (rs.next()) {
            int id = rs.getInt("emp_id");
            nurse.setId(id);
            String name = rs.getString("name");
            nurse.setName(name);
            String address = rs.getString("address");
            nurse.setAddress(address);
            String nic = rs.getString("nic");
            nurse.setNic(nic);
            int contactNo = rs.getInt("contactNo");
            nurse.setContactNo(contactNo);
            int wd_id = rs.getInt("Ward_wd_id");
            nurse.setWd_id(wd_id);
            Date joinedDate = rs.getDate("joinedDate");
            nurse.setJoinedDate(joinedDate);

        }
        return nurse;

    }
    
    public Nurse_model viewNurse2(String index) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM nurse where nic=" + index;

        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = connection.createStatement();

        ResultSet rs = st.executeQuery(sql);

        Nurse_model nurse = new Nurse_model();
        while (rs.next()) {
            int id = rs.getInt("emp_id");
            nurse.setId(id);
            String name = rs.getString("name");
            nurse.setName(name);
            String address = rs.getString("address");
            nurse.setAddress(address);
            String nic = rs.getString("nic");
            nurse.setNic(nic);
            int contactNo = rs.getInt("contactNo");
            nurse.setContactNo(contactNo);
            int wd_id = rs.getInt("Ward_wd_id");
            nurse.setWd_id(wd_id);
            Date joinedDate = rs.getDate("joinedDate");
            nurse.setJoinedDate(joinedDate);

        }
        return nurse;

    }
}
