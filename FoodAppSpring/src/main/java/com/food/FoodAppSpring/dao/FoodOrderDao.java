package com.food.FoodAppSpring.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.FoodAppSpring.dto.FoodOrder;
import com.food.FoodAppSpring.repository.FoodOrderRepo;
import com.food.FoodAppSpring.repository.ItemRepo;

@Repository
public class FoodOrderDao {

	@Autowired
	FoodOrderRepo foodOrderRepo;
	
	@Autowired
	ItemRepo itemRepo;
	
	public FoodOrder saveFoodOrder(FoodOrder foodOrder)
	{
		return foodOrderRepo.save(foodOrder);
	}
	
	public Optional<FoodOrder> getFoodOrderById(int id)
	{
		return foodOrderRepo.findById(id);
	}
	
	public List<FoodOrder> getAllFoodOrder()
	{
		return foodOrderRepo.findAll();
	}
	
	public FoodOrder updateFoodOrder(FoodOrder foodOrder)
	{
		return foodOrderRepo.save(foodOrder);
	}
	
	public void deleteFoodOrder(int id)
	{
		foodOrderRepo.deleteById(id);
	}
}
