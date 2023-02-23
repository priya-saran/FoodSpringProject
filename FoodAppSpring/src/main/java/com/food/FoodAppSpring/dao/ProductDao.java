package com.food.FoodAppSpring.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.FoodAppSpring.dto.Product;
import com.food.FoodAppSpring.repository.ProductRepo;

@Repository
public class ProductDao {

	@Autowired
	ProductRepo productRepo;
	
	public Product saveProduct(Product product)
	{
		return productRepo.save(product);
	}
	
	public Optional<Product> getProductById(int id)
	{
		return productRepo.findById(id);
	}
	
	public List<Product> getAllProduct()
	{
		return productRepo.findAll();
	}
	
	public Product updateProduct(Product product)
	{
		return productRepo.save(product);
	}
	
	public void deleteProduct(int id)
	{
		productRepo.deleteById(id);
	}
}
