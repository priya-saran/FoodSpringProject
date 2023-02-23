package com.food.FoodAppSpring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.food.FoodAppSpring.dao.CustomerDao;
import com.food.FoodAppSpring.dto.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerDao customerDao;
	
	@PostMapping
	public Customer saveCustomer(@RequestBody Customer cust)
	{
		return customerDao.saveCustomer(cust);
	}
	
	@GetMapping("/{id}")
	public Customer getCustById(@PathVariable int id)
	{
	     Optional<Customer> op = customerDao.getCustomerById(id);
	     if(op.isEmpty())
	     {
	    	 return null;
	     }
	     else
	     {
	    	 return op.get();
	     }
	}
	
	@GetMapping("/{email}")
	public Customer getCustByEmail(@PathVariable String email)
	{
		return customerDao.getCustomerByEmail(email);
	}
	
	@GetMapping
	public List<Customer> getAllCust()
	{
		return customerDao.getAllCustomer();
	}
	
	@PutMapping
	public Customer updateCust(Customer customer)
	{
		return customerDao.updateCustomer(customer);
	}
	
	@DeleteMapping
	public String deleteCust(@RequestParam int id)
	{
		Optional<Customer> op = customerDao.getCustomerById(id);
		if(op.isPresent())
		{
			return "Data is deleted";
		}
		else
		{
			return "Data is not present";
		}
	}
}
