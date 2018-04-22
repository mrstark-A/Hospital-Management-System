/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.connectivity;
import Model.test_model;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class test_controller {

    public boolean addTest(test_model test) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO `test` (`test`, `results`, `laboritist_id`, `date`, `Patient_rc_index`) VALUES (?,?,?,?,?)";

        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();

        PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);

        st.setObject(1, test.getTest());
        st.setObject(2, test.getResult());
        st.setObject(3, test.getLabouritistId());
        st.setObject(4, test.getDate());
        st.setObject(5, test.getPa_id());

        int res = st.executeUpdate();
        System.out.print("test adding Done");

        if (res > 0) {
            return true;

        }
        return false;

    }

}
