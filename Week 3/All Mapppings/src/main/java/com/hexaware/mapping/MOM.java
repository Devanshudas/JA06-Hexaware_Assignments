package com.hexaware.mapping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mapping.entities.Order;
import com.hexaware.mapping.entities.Product;

public class MOM 
{
	public static void main(String[] args) 
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	        
	        Session session = sessionFactory.openSession();
	        
	        Transaction tx = session.beginTransaction();
	        
	        Product p1 = new Product();
	        p1.setProductId(10);
	        p1.setProductName("Mobile");
	        p1.setPrice(20000);
	        
	        Product p2 = new Product();
	        p2.setProductId(20);
	        p2.setProductName("TV");
	        p2.setPrice(23000);
	        
	        Product p3 = new Product();
	        p3.setProductId(30);
	        p3.setProductName("Laptop");
	        p3.setPrice(25000);
	        
	        
	        Order o1 = new Order();
	        o1.setOrderId(101);
	        o1.setPurchaseDate(new Date());
	        
	        o1.addProduct(p1);
	        o1.addProduct(p2);
	        
	        Order o2 = new Order();
	        o2.setOrderId(102);
	        o2.setPurchaseDate(new Date(2020,02,01));
	        
	        o2.addProduct(p3);
	        o2.addProduct(p2);
	        
	        session.persist(o1);
	        session.persist(o2);
	        
	        tx.commit();
	        session.close();
	        
	        
	        
	        
	       
		
	}

}
