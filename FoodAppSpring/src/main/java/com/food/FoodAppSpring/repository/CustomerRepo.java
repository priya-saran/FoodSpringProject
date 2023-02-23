package com.food.FoodAppSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.FoodAppSpring.dto.Customer;

public interface CustomerRepo extends JpaRepository<Customer , Integer>{

	/*
	 * If you want any new method you can add it here like "findByEmail"
	 */
	
	Customer findByEmail(String email);
}
