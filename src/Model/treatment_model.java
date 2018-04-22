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
public class treatment_model {
   private int pa_id;
   private String prescription;
   private String result;
   private Date date;
   private int chemistId;

   
    public int getPa_id() {
        return pa_id;
    }

   
    public void setPa_id(int pa_id) {
        this.pa_id = pa_id;
    }

    
    public String getPrescription() {
        return prescription;
    }

   
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    
    public Date getDate() {
        return date;
    }

    
    public void setDate(Date date) {
        this.date = date;
    }

    
    public int getChemistId() {
        return chemistId;
    }

    
    public void setChemistId(int chemistId) {
        this.chemistId = chemistId;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }
   
          
}
