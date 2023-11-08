package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Customers;
import com.demo.repository.CustomerRepository;

@RestController
@RequestMapping("/api/Customer") // This annotation maps the controller to the "/api" base URL
public class CustomerController {
	@Autowired
	private CustomerRepository crepo;

	// This method handles HTTP GET requests for retrieving a list of all customers.
	@GetMapping("/getCustomers")
	public List<Customers> getAllCustomers() {
		return crepo.findAll();
	}

	// This method handles HTTP GET requests for retrieving a customer by their ID.
	@GetMapping("/getPost/{cid}")
	public Customers getcustomerById(@PathVariable long cid) {
		return crepo.findById(cid).get();
	}

	// This method handles HTTP POST requests for adding a new customer.
	@PostMapping("/addCustomers")
	public String getAllCustomers(@RequestBody Customers customer) {
		crepo.save(customer);
		return "Customer added Successfully";
	}

	// This method handles HTTP PUT requests for updating an existing customer.
	@PutMapping("/updateCustomer/{cid}")
	public String customerUpdate(@RequestBody Customers cust, @PathVariable long id) {
		if (crepo.existsById(id)) {
			cust.setCid(id);
			crepo.save(cust);
			return "Customer updated successfully with ID: " + id;
		} else {
			return "Customer not found";
		}
	}

	// This method handles HTTP DELETE requests for deleting a customer by their ID.
	@DeleteMapping("deleteCustomer/{cid}")
	public String deletePost(@PathVariable long cid) {
		crepo.deleteById(cid);
		return "Customer with ID: " + cid + " deleted successfully";
	}
}
