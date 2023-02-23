package com.food.FoodAppSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.FoodAppSpring.dto.FoodOrder;

public interface FoodOrderRepo extends JpaRepository<FoodOrder, Integer>{

}
