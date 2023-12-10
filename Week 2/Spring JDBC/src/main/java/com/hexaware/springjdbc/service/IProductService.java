package com.hexaware.springjdbc.service;

import java.util.List;

import com.hexaware.springjdbc.model.Product;

public interface IProductService 
{
	
	public boolean createProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Product product);
	
	public Product getProductById(int pid);
	
	public List<Product> getAllProducts();

}
