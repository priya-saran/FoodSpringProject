package com.food.FoodAppSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.FoodAppSpring.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
