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
public class section_model {
    private int index;
    private int pa_id;
    private String sickness;
    private int checkedBy;
    private int assignedBy;
    private Date admitteddate;
    private int wd_id;
    private String notes;
    private Date dischargedDate;

    public int getPa_id() {
        return pa_id;
    }

    public void setPa_id(int pa_id) {
        this.pa_id = pa_id;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public int getCheckedBy() {
        return checkedBy;
    }

    public void setCheckedBy(int checkedBy) {
        this.checkedBy = checkedBy;
    }

    public int getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(int assignedBy) {
        this.assignedBy = assignedBy;
    }

    public Date getAdmitteddate() {
        return admitteddate;
    }

    public void setAdmitteddate(Date admitteddate) {
        this.admitteddate = admitteddate;
    }

    public int getWd_id() {
        return wd_id;
    }

    public void setWd_id(int wd_id) {
        this.wd_id = wd_id;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    
    public String getNotes() {
        return notes;
    }

    
    public Date getDischargedDate() {
        return dischargedDate;
    }

   
    public void setDischargedDate(Date dischargedDate) {
        this.dischargedDate = dischargedDate;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

  

}
