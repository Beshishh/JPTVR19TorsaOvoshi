/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author User
 */
public class History implements Serializable{
    private Buyer buyer;
    private Good good;
    private Date boughtDate;
    
    public History(Buyer buyer, Good good, Date boughtDate) {
     
    }
      public History(){  
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Good getGood() {
        return good;
    }

    public Date getBoughtDate() {
        return boughtDate;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public void setBoughtDate(Date boughtDate) {
        this.boughtDate = boughtDate;
    }
  
            @Override
    public String toString() {
        return "History{" 
                + "Buyer=" + buyer 
                + ", Good=" + good 
                + ", boughtDate=" + boughtDate
                + '}';
    }
}


