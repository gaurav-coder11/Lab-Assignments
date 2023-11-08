package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.repository.ProductRepository;

@RestController
@RequestMapping("/api/Products")
public class ProductController {
	@Autowired
	private ProductRepository prepo;

//This method handles HTTP DELETE requests for deleting a products by their ID.
	@DeleteMapping("deleteProduct/{pid}")
	public String deletePost(@PathVariable long pid) {
		prepo.deleteById(pid);
		return "Product Of ID: " + pid + "Deleted Succefully";
	}
}
