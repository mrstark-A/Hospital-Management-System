/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.connectivity;

import Model.employee_model;
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
public class employee_controller {
 public boolean addEmployee(employee_model nurse) throws ClassNotFoundException, SQLException {
        String sql = "Insert into nurse values(?,?,?,?,?,?,?)";

        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);

        st.setObject(1, nurse.getId());
        st.setObject(2, nurse.getName());
        st.setObject(3, nurse.getNic());
        st.setObject(4, nurse.getAddress());
        st.setObject(5, nurse.getContactNo());
        st.setObject(6, nurse.getRole());
        st.setObject(7, nurse.getJoinedDate());

        int res = st.executeUpdate();

        return res > 0;

    }

    public employee_model viewNurse1(int index) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM otherEmployee where emp_id = " + index;

        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = connection.createStatement();

        ResultSet rs = st.executeQuery(sql);

        employee_model nurse = new employee_model();
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
            String role =rs.getString("role");
            nurse.setRole(role);
            Date joinedDate = rs.getDate("joinedDate");
            nurse.setJoinedDate(joinedDate);

        }
        return nurse;

    }
    
    public employee_model viewNurse2(String index) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM otherEmployee where nic = " + index;

        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        Statement st = connection.createStatement();

        ResultSet rs = st.executeQuery(sql);

        employee_model nurse = new employee_model();
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
            String role =rs.getString("role");
            nurse.setRole(role);
            Date joinedDate = rs.getDate("joinedDate");
            nurse.setJoinedDate(joinedDate);

        }
        return nurse;

    }    
}
