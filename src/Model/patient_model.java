/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import util.index;


public class patient_model {
    private  int PA_ID;
    private String title;
    private String name;
    private String dob;
    private String nic;
    private int contactNo1;
    private int contactNo2;
    private String address;
    private String allergies;
    private String notes;

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    
    public int getContactNo1() {
        return contactNo1;
    }

    
    public void setContactNo1(int contactNo1) {
        this.contactNo1 = contactNo1;
    }

    
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

   
    public String getNotes() {
        return notes;
    }

    
    public void setNotes(String notes) {
        this.notes = notes;
    }

    
    public int getContactNo2() {
        return contactNo2;
    }

   
    public void setContactNo2(int contactNo2) {
        this.contactNo2 = contactNo2;
    }

   
    public  int getPA_ID() {
        return PA_ID;
    }

   
    public  void setPA_ID(int pa_id)  {
        
        PA_ID =pa_id;
    }

    

    
   
    
}
