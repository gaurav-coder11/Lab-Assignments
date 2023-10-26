package com.demo.model;
//Import necessary packages and classe
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity				//Define an entity that maps to a database table named "springproduct"
@Table(name = "springproduct")
@Data 				// Lombok annotation for generating getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // Lombok annotation to generate a constructor with all fields
@NoArgsConstructor	// Lombok annotation to generate a no-argument constructor
public class Product {
	// Define the primary key field
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;			// Product ID
	private String pname;		// Product name
	private double pamount;		// Product amount
	private String category;	// Product category
}
