/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author user
 */
public class connectivity  {
    private static connectivity connectivity;
    private Connection conn;

   
    

    public connectivity() {
         try {
             this.conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
             Statement st =(Statement) conn.createStatement();
            
             
         } catch (SQLException ex) {
             Logger.getLogger(connectivity.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
     
    public static connectivity getDBConnection() throws ClassNotFoundException, SQLException {
        if (connectivity == null) {
            connectivity = new connectivity();
        }
        return (connectivity) connectivity;
    } 
    
    public Connection getConnection(){
        return conn;
    }
    
}
