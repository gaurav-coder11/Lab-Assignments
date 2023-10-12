package hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Annotating the class as an entity, indicating it is mapped to a database table named "emptbl"
@Entity
@Table(name = "vegetable")
public class Vegetables {
	// Annotating empid as the primary key column with auto-increment
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Mapping Vegetables column named 
	@Column(name = "Veg_ID")
private int vId;
	@Column(name = "Veg_Name")
private String vName;
	@Column(name = "Veg_Quentity")
private String vQuantity;
	@Column(name = "Veg_Price")
private Double vPrice;
	
public String getvName() {
	return vName;
}
public void setvName(String vName) {
	this.vName = vName;
}
public String getvQuantity() {
	return vQuantity;
}
public void setvQuantity(String vQuantity) {
	this.vQuantity = vQuantity;
}
public Double getvPrice() {
	return vPrice;
}
public void setvPrice(Double vPrice) {
	this.vPrice = vPrice;
}
//Parameterized constructor
public Vegetables( String vName, String vQuantity, Double vPrice) {
	super();
	this.vName = vName;
	this.vQuantity = vQuantity;
	this.vPrice = vPrice;
}
public Vegetables() {
	super();
	// TODO Auto-generated constructor stub
}
//toString
@Override
public String toString() {
	return "Vegetables [vId=" + vId + ", vName=" + vName + ", vQuantity=" + vQuantity + ", vPrice=" + vPrice + "]";
}


}
