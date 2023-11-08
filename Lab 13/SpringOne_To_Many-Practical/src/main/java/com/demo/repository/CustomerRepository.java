package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Long>{
	// No additional methods are needed here  JpaRepository provides basic CRUD operations.

}
