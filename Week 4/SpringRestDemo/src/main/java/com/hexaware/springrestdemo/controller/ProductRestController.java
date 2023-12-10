package com.hexaware.springrestdemo.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestdemo.entity.Product;
import com.hexaware.springrestdemo.services.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController 
{
	@Autowired
	IProductService service;
	
	@GetMapping("/getall")
	public Set<Product> getAllProduct()
	{
		
		return service.getProducts();
	}
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product)
	{
		
		return service.addProduct(product);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product)
	{
		
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{pid}")
	public String deleteProduct(@PathVariable int pid)
	{
		service.deleteProductById(pid);
		return "Product Deleted";
	}
	
	@GetMapping("/get/{pid}")// here pid is path variable read data from url
	public Product getProductById(@PathVariable int pid)
	{
		return  service.getProductById(pid);
	}

}
