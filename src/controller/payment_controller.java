/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.connectivity;
import Model.payment_model;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class payment_controller {
    public boolean addPayment(payment_model pay ) throws ClassNotFoundException, SQLException{
        String sql="Insert into payment(roomCharge,noOfDays,serviceCharge,service1,service2,totalPay,paymentMode,date,Patient_index) values(?,?,?,?,?,?,?,?,?)";
        
        Connection connection;
        
        
        connection = (Connection) connectivity.getDBConnection().getConnection();
        
         PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
         
          System.out.println("payment_controller");
         st.setObject(1,pay.getRoomCharge());
         st.setObject(2,pay.getNoOfDays());
         st.setObject(3,pay.getServiceCharge());
         st.setObject(4,pay.getService1());
         st.setObject(5,pay.getService2());
         st.setObject(6,pay.getTotalpay());
         st.setObject(7,pay.getPayMode());
         st.setObject(8,pay.getPayDate());
         st.setObject(9,pay.getIndex());//index no of patient's sickness record
         
        
         
        int res = st.executeUpdate();
        
        if (res > 0) {
            return true;

        }
        return false;
        
    }
    
}
