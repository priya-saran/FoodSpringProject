package com.food.FoodAppSpring.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.FoodAppSpring.dto.Customer;
import com.food.FoodAppSpring.repository.CustomerRepo;

@Repository
public class CustomerDao {

	@Autowired
	CustomerRepo customerRepo; 
	
	public Customer saveCustomer(Customer customer)
	{
		return customerRepo.save(customer);
	}
	
	public Optional<Customer> getCustomerById(int id)
	{
		return customerRepo.findById(id);
	}
	
	public Customer getCustomerByEmail(String email)
	{
		/*
		 * This new method must written in CustomerRepo Interface, so that only we can
		 * get it easily
		 */
		return customerRepo.findByEmail(email);
	}
	
	public List<Customer> getAllCustomer()
	{
		return customerRepo.findAll();
	}
	
	public Customer updateCustomer(Customer customer)
	{
		return customerRepo.save(customer);
	}
	
	public void deleteCustomer(int id)
	{
		customerRepo.deleteById(id);
	}
}
