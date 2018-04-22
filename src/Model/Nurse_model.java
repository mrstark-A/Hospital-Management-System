/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.util.Date;
import util.index;

/**
 *
 * @author user
 */
public class Nurse_model {
   
    private int id;
    private String name;
    private String address;
    private int contactNo;
    private String nic;
    private int wd_id;
    private String role;
    private Date joinedDate;

   
   

   
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getAddress() {
        return address;
    }

   
    public void setAddress(String address) {
        this.address = address;
    }

    
    public int getContactNo() {
        return contactNo;
    }

    
    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

   
    public int getWd_id() {
        return wd_id;
    }

   
    public void setWd_id(int wd_id) {
        this.wd_id = wd_id;
    }

    
    public String getRole() {
        return role;
    }

    
    public void setRole(String role) {
        this.role =role;
    }

   
    public Date getJoinedDate() {
        return joinedDate;
    }

    
    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

   
    public String getNic() {
        return nic;
    }

    
    public void setNic(String nic) {
        this.nic = nic;
    }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) throws ClassNotFoundException, SQLException {     
        this.id =id;
    }
}
