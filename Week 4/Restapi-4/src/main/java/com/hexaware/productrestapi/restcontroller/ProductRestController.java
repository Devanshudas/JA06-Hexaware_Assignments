package com.hexaware.productrestapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.productrestapi.dto.ProductDTO;
import com.hexaware.productrestapi.entity.Product;
import com.hexaware.productrestapi.exception.ProductNotFoundException;
import com.hexaware.productrestapi.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	@Autowired
	IProductService service;
	
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody ProductDTO productDTO) {
		
		return service.addProduct(productDTO);
	}

	
	@GetMapping("/get/{pid}")
	public ProductDTO getById(@PathVariable int pid) 
	{
		ProductDTO productDTO = service.getProductById(pid);
		if (productDTO == null)
		{
			throw new ProductNotFoundException();
		}
		return productDTO;
	}


		@GetMapping("/getall")
	public List<Product> getAllProducts() {
	
		return service.getAllProduct();
	}
		
		@GetMapping("/get/{a}/{b}")
		public int div(@PathVariable int a, @PathVariable int b)
		{
			return a/b;
		}
		
		@ResponseStatus(value = HttpStatus.FORBIDDEN, reason= "Cannoy divide by 0")
		@ExceptionHandler({ArithmeticException.class})
		public void handleException()
		{
			
		}
		
		@ResponseStatus(value = HttpStatus.NOT_FOUND, reason= "Product Not Found")
		@ExceptionHandler({ProductNotFoundException.class})
		public void handleProductNotFoundException()
		{
			
		}

	
	

}
