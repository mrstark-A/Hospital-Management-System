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
public class test_model {
    private int pa_id;
    private String test;
    private String result;
    private Date date;
    private int labouritistId;

    
    public int getPa_id() {
        return pa_id;
    }

    
    public void setPa_id(int pa_id) {
        this.pa_id = pa_id;
    }

   
    public String getTest() {
        return test;
    }

   
    public void setTest(String test) {
        this.test = test;
    }

    
    public String getResult() {
        return result;
    }

   
    public void setResult(String result) {
        this.result = result;
    }

   
    public Date getDate() {
        return date;
    }

   
    public void setDate(Date date) {
        this.date = date;
    }

    
    public int getLabouritistId() {
        return labouritistId;
    }

    
    public void setLabouritistId(int labouritistId) {
        this.labouritistId = labouritistId;
    }
    
}
