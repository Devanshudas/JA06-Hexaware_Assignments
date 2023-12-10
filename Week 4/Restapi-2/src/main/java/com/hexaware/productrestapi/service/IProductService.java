package com.hexaware.productrestapi.service;

import java.util.List;

import com.hexaware.productrestapi.dto.ProductDTO;
import com.hexaware.productrestapi.entity.Product;

public interface IProductService 
{
	public Product addProduct(ProductDTO productDTO);

	public List<Product> getAllProduct();
	
	public ProductDTO getProductById(int pid);
	
	public Product updateProduct(ProductDTO productDTO);


}
