package com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//create entity to the database
@Entity

//This annotation specifies the name of the table in the database where this entity is stored.
@Table(name = "product_info")

//Annotation for Getters and setters
@Data

//Annotation for Default constructor
@NoArgsConstructor

// Annotation for Parameterized constructor
@AllArgsConstructor
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;	// This field represents the primary key 
	
    // This field stores the name of the product.
	@Column(name="product_name")
	private String pname;
	
    // This field stores the type of the product.
	private String ptype;
	
    // This field stores the price of the product.
	private double cost;

}
