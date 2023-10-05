package com.hibernate.newhiber.NewHiber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cars {
    // Define the primary key field
    @Id
    private int id;
    
    // Define a column for the car's name
    @Column
    private String carName;
    
    // Define a column for the car's cost
    @Column
    private String cost;
    
    // Getter method for id
    public int getId() {
        return id;
    }
    
    // Setter method for id
    public void setId(int id) {
        this.id = id;
    }
    
    // Getter method for carName
    public String getCarName() {
        return carName;
    }
    
    // Setter method for carName
    public void setCarName(String carName) {
        this.carName = carName;
    }
    
    // Getter method for cost
    public String getCost() {
        return cost;
    }
    
    // Setter method for cost
    public void setCost(String cost) {
        this.cost = cost;
    }
}
