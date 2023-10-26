package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.ProductDao;
import com.demo.model.Product;
//Define a controller class for handling product-related requests

@RestController
@RequestMapping("/products")
public class ProductController {
	// Inject the ProductDao, which allows interaction with the Product entity in
	// the database

	@Autowired
	private ProductDao productDao;
	// Define a POST endpoint for saving a list of products

	@PostMapping("/saveProducts")
	public String saveProduct(@RequestBody List<Product> product) {
		// Save all the products in the list to the database using the ProductDao

		productDao.saveAll(product);
		// Return a message indicating the number of products saved

		return "Product" + product.size() + " saved";
	}
	// Define a GET endpoint for retrieving a list of products

	@GetMapping("/getProducts")
	public List<Product> getProduct() {
		// Retrieve all products from the database using the ProductDao

		return (List<Product>) productDao.findAll();
	}
}
