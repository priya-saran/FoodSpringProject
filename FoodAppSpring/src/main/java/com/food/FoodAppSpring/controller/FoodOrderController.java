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

import com.food.FoodAppSpring.dao.FoodOrderDao;
import com.food.FoodAppSpring.dto.FoodOrder;

@RestController
@RequestMapping("/foodorders")
public class FoodOrderController {

	@Autowired
	FoodOrderDao foodOrderDao;
	
	@PostMapping
	public FoodOrder saveFoodOrd(@RequestBody FoodOrder foodOrder)
	{
		return foodOrderDao.saveFoodOrder(foodOrder);
	}
	
	@GetMapping("/{id}")
	public FoodOrder getFoodById(@PathVariable int id)
	{
		Optional<FoodOrder> op = foodOrderDao.getFoodOrderById(id);
		if(op.isEmpty())
		{
			return null;
		}
		else
		{
			return op.get();
		}
	}
	
	@GetMapping
	public List<FoodOrder> getAllFood()
	{
		return foodOrderDao.getAllFoodOrder();
	}
	
	@PutMapping
	public FoodOrder updateFood(FoodOrder foodOrder)
	{
		return foodOrderDao.updateFoodOrder(foodOrder);
	}
	
	@DeleteMapping
	public String deleteFood(@RequestParam int id)
	{
		Optional<FoodOrder> op = foodOrderDao.getFoodOrderById(id);
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
