/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.connectivity;
import Model.treatment_model;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class treatment_controller {
    public boolean addTreatment(treatment_model treatment) throws ClassNotFoundException, SQLException{
       String sql="Insert into treatment(Patient_rc_index,test,Result,date,lab_Id) values(?,?,?,?,?)";
        
        
        Connection connection;
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) connectivity.getDBConnection().getConnection();
        
        
         
         PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
         
         st.setObject(1,treatment.getPa_id());
         st.setObject(2,treatment.getPrescription());
         st.setObject(3,treatment.getResult());
         st.setObject(4,treatment.getDate());
         st.setObject(5,treatment.getChemistId());
         
         
         
         
        int res = st.executeUpdate();
        System.out.print("Treatment adding Done");
        
        if (res > 0) {
            return true;

        }
        return false;
    
    }
}
