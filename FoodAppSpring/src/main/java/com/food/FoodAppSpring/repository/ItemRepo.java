package com.food.FoodAppSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.FoodAppSpring.dto.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{

}
