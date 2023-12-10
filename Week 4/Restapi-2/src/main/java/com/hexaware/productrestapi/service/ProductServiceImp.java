package com.hexaware.productrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.productrestapi.dto.ProductDTO;
import com.hexaware.productrestapi.entity.Product;
import com.hexaware.productrestapi.repository.ProductRepository;

@Service
public class ProductServiceImp implements IProductService 
{
	@Autowired
	ProductRepository repo;

	@Override
	public Product addProduct(ProductDTO productDTO) {

		Product product = new Product(); // entity class obj

		product.setPname(productDTO.getPname());
		product.setPrice(productDTO.getPrice());

		return repo.save(product);
	}

	@Override
	public ProductDTO getProductById(int pid) {

		Product product = repo.findById(pid).orElse(new Product());

		ProductDTO productDTO = new ProductDTO();

					productDTO.setPid(product.getPid());
					productDTO.setPname(product.getPname());
					productDTO.setPrice(product.getPrice());
			
		
		return  productDTO;
	}

	@Override
	public List<Product> getAllProduct() {
		return repo.findAll();
	}

	@Override
	public Product updateProduct(ProductDTO productDTO) {
		Product product = new Product(); // entity class obj

		product.setPname(productDTO.getPname());
		product.setPrice(productDTO.getPrice());

		return repo.save(product);
	}

}
