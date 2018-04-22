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
public class payment_model {
    private int index;
    private int roomCharge;
    private int noOfDays;
    private int serviceCharge;
    private int service1;
    private int service2;
    private int totalpay;
    private String payMode;
    private Date payDate;
    private int pID;
    private int wdID;

    
    public int getIndex() {
        return index;
    }

    
    public void setIndex(int index) {
        this.index = index;
    }

    
    public int getRoomCharge() {
        return roomCharge;
    }

    
    public void setRoomCharge(int roomCharge) {
        this.roomCharge = roomCharge;
    }

    
    public int getNoOfDays() {
        return noOfDays;
    }

    
    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    
    public int getServiceCharge() {
        return serviceCharge;
    }

    
    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    
    public int getService1() {
        return service1;
    }

    
    public void setService1(int service1) {
        this.service1 = service1;
    }

    
    public int getService2() {
        return service2;
    }

    
    public void setService2(int service2) {
        this.service2 = service2;
    }

    
    public int getTotalpay() {
        return totalpay;
    }

    
    public void setTotalpay(int totalpay) {
        this.totalpay = totalpay;
    }

    
    public String getPayMode() {
        return payMode;
    }

    
    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

   
    public Date getPayDate() {
        return payDate;
    }

    
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    
    public int getpID() {
        return pID;
    }

    
    public void setpID(int pID) {
        this.pID = pID;
    }

    
    public int getWdID() {
        return wdID;
    }

    
    public void setWdID(int wdID) {
        this.wdID = wdID;
    }
    
}
