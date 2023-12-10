package com.hexaware.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mapping.entities.Department;
import com.hexaware.mapping.entities.Employee;

public class OMMO 
{
	public static void main(String[] args) 
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	        
	        Session session = sessionFactory.openSession();
	        
	        Transaction tx = session.beginTransaction();
	        
	        Employee e1 = new Employee();
	        e1.setEmployeeId(01);
	        e1.setEmployeeName("Devanshu");
	        e1.setSalary(30000);
	        
	        Employee e2 = new Employee();
	        e2.setEmployeeId(02);
	        e2.setEmployeeName("Devendra");
	        e2.setSalary(40000);
	        
	       Department dept = new Department();
	       dept.setDepartmentId(20);
	       dept.setDepartmentName("Developer");
	       
	       dept.addEmployee(e1);
	       dept.addEmployee(e2);
	       
	       session.persist(dept);
	       
	       tx.commit();
	       
	       session.close();
	}

}
