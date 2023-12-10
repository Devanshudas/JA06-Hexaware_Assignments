package com.hexaware.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc.model.Product;

@Repository
public class ProductDaoImp implements IProductDAO {
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ProductDaoImp(DataSource datasource)
	{
		jdbcTemplate  = new JdbcTemplate(datasource);
	}

	@Override
	public boolean createProduct(Product product) {
		String insertQuery = "insert into product(pid,pname,price) values (?,?,?)";
		int count = jdbcTemplate.update(insertQuery,product.getPid(),product.getProductName(),product.getPrice());
		return count>0;
	}

	@Override
	public boolean updateProduct(Product product) {
		String updateQuery = "update product set price = ? , pname = ?  where pid = ?";
		int count = jdbcTemplate.update(updateQuery,product.getPrice(),product.getProductName(),product.getPid());
		return count>0;
	}

	@Override
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
