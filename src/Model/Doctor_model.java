/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author user
 */
public class Doctor_model {
    private int emp_id;
    private String name;
    private String role;
    private String address;
    private int age;
    private String nic;
    private int contactNo;
    private String wd_id;
    private String specility;
    private Date joinedDate;

    
    public int getEmp_id() {
        return emp_id;
    }

   
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    
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

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }

    
    public String getNic() {
        return nic;
    }

   
    public void setNic(String nic) {
        this.nic = nic;
    }

    
    public int getContactNo() {
        return contactNo;
    }

    
    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    
    public String getWd_id() {
        return wd_id;
    }

    
    public void setWd_id(String wd_id) {
        this.wd_id = wd_id;
    }

    
    public String getSpecility() {
        return specility;
    }

    
    public void setSpecility(String specility) {
        this.specility = specility;
    }

    
    public Date getJoinedDate() {
        return joinedDate;
    }

    
    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    
    public String getRole() {
        return role;
    }

   
    public void setRole(String role) {
        this.role = role;
    }
}
