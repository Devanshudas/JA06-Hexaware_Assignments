package com.hexaware.springjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc.config.AppConfig;
import com.hexaware.springjdbc.model.Product;
import com.hexaware.springjdbc.service.IProductService;
import com.hexaware.springjdbc.service.ProductServiceImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IProductService service = context.getBean(ProductServiceImp.class);
        
    /*    Product product = new Product(102,"Mobile",4000);
        boolean isCreated = service.createProduct(product);
        System.out.println("Is record created:- "+ isCreated);
    */    
        
        Product product = new Product(1000000,"Car",102);
        boolean isUpdated = service.updateProduct(product);
        System.out.println("Is record Updated:- "+ isUpdated);
        context.close();
    }
}
