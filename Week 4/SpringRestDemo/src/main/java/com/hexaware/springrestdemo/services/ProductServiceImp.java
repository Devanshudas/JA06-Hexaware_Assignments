package com.hexaware.springrestdemo.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestdemo.dao.IProductDao;
import com.hexaware.springrestdemo.entity.Product;
@Service
public class ProductServiceImp implements IProductService {
	
	@Autowired
	IProductDao dao;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.getProductById(productId);
	}

	@Override
	public Product deleteProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.deleteProductById(productId);
	}

	@Override
	public Set<Product> getProducts() {
		// TODO Auto-generated method stub
		return dao.getProducts();
	}

}
