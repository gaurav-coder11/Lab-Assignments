package com.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//create entity to the database
@Entity

//This annotation specifies the name of the table in the database where this entity is stored.
@Table(name = "customers_info")

//this annotation are use for getters and setters for the Customer entity.
@Data

//this annotation are use for Default constructor for the Customer entity.
@NoArgsConstructor

//this annotation are use for Parameterized constructor for the Customer entity.
@AllArgsConstructor

public class Customers {

	@Id // This field represents the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cid;

	// Field to store the name of the customer.
	@Column(name = "customer_name")
	private String cName;

	// Field to store the city of the customer.
	@Column(name = "customer_city")
	private String cCity;

	// Field to store the mobile Number of the customer.
	@Column(name = "customer_mobileNo")
	private double cMob;

	// Create a One-to-Many association with the Product entity using a list.
	// This means that each customer can have multiple associated products.
	@OneToMany(cascade = CascadeType.ALL)

	// Define the foreign key relationship between Customer and Product entities.
	@JoinColumn(name = "cust_prod", referencedColumnName = "cid")
	List<Products> products = new ArrayList<Products>();
}
