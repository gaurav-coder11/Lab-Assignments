package com.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.Product;

//Define an interface for data access operations related to the Product entity
public interface ProductDao extends CrudRepository<Product, Integer> {
	// This interface extends the CrudRepository, providing basic CRUD operations
	// for the Product entity.

}
