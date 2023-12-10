package com.hexaware.springrestdemo.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.hexaware.springrestdemo.entity.Product;

@Repository
public class ProductDaoImp implements IProductDao 
{
	Set<Product> productSet = new HashSet<Product>();
	
	

	@Override
	public Product addProduct(Product product) 
	{
		productSet.add(product);
		return product;
	}

	@Override
	public Product updateProduct(Product product) 
	{
		productSet.add(product);
		return product;
	}

	@Override
	public Product getProductById(int productId) 
	{
		Product product1 = null;
		for(Product product : productSet)
		{ 
			if(product.getProductId()==productId)
			{
				product1 = product;
			}
		}
		
		
		return product1;
	}

	@Override
	public Product deleteProductById(int productId) 
	{
		Product product2 = null;
		for(Product product : productSet)
				{
					if(product.getProductId()==productId)
					{
						productSet.remove(product);
						product2 = product;
					}
					
				}
		return product2;
		}

	@Override
	public Set<Product> getProducts() 
	{
		return productSet;
	}

}
