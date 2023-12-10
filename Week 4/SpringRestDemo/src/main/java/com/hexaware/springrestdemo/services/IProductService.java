package com.hexaware.springrestdemo.services;

import java.util.Set;

import com.hexaware.springrestdemo.entity.Product;

public interface IProductService 
{
	public Product  addProduct(Product product);
	public Product  updateProduct(Product product);
	public Product  getProductById(int productId);
	public Product  deleteProductById(int productId);
	
	public Set<Product> getProducts();




}
