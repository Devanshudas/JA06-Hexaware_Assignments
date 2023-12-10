package com.hexaware.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	System.out.println(sessionFactory);
    	
    	Session session =sessionFactory.openSession();
    	
    	Transaction tr = session.beginTransaction();
    	
    	//INSERT
    	
    //	Employee emp = new Employee (101, "Devanshu",50000);
    	
   // 	Serializable ser = session.save(emp);
    	
    //	System.out.println(ser.toString());
    	
    	//SELECTALL
    	
    	Query<Employee> query =	session.createQuery("Select e from Employee e where e.eid= 101 ");
    
    	Employee emp1 = query.getSingleResult();
    	
    	System.out.println(emp1);
    	
    	
    	tr.commit();
    	
    	
    	
    }
}
