/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Good implements Serializable{
    private String name;
    private Integer price;
    
    public Good() {
    }

public Good(String name, Integer price){
    this.name = name;
    this.price = price;
}
    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
        @Override
    public String toString() {
        return "Good{" 
                + "name=" + name 
                + ", price=" + price 
                + '}';
    }
}        
