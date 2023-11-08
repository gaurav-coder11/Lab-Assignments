package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long>{
	// No additional methods are needed here  JpaRepository provides basic CRUD operations.

}
