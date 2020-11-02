/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Buyer implements Serializable{
    private String name;
    private String lastname;
    private String phone;
    private Integer wallet;
    
    public Buyer() {
    }

public Buyer(String name, String lastname, String phone, Integer wallet){
    this.name = name;
    this.lastname = lastname;
    this.phone = phone;
    this.wallet = wallet;
}

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWallet(Integer wallet) {
        this.wallet = wallet;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getWallet() {
        return wallet;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        @Override
    public String toString() {
        return "Good{" 
                + "name=" + name 
                + ", lastname=" + lastname 
                + ", phone=" + phone
                + ", wallet=" + wallet 
                + '}';
    }
}   
