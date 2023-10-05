package hibernate.E_Bill_Vegitable.maven.E_Billing_System;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vegetables {
    // Define the primary key field
    @Id
    private int vegid;
    
    // Define a column for item name
    @Column
    private String itmName;
    
    // Define a column for price
    @Column
    private String price;
    
    // Define a column for quantity
    @Column
    private String quantity;
    
    // Getter method for vegid
    public int getVegid() {
        return vegid;
    }
    
    // Setter method for vegid
    public void setVegid(int vegid) {
        this.vegid = vegid;
    }
    
    // Getter method for itmName
    public String getItmName() {
        return itmName;
    }
    
    // Setter method for itmName
    public void setItmName(String itmName) {
        this.itmName = itmName;
    }
    
    // Getter method for price
    public String getPrice() {
        return price;
    }
    
    // Setter method for price
    public void setPrice(String price) {
        this.price = price;
    }
    
    // Getter method for quantity
    public String getQuantity() {
        return quantity;
    }
    
    // Setter method for quantity
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
