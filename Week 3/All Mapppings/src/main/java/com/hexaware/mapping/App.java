package com.hexaware.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mapping.entities.Address;
import com.hexaware.mapping.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction tx = session.beginTransaction();
        
       /* Address address = new Address(52,"Indore","MP");
        
        Student student = new Student(102,"A",address);
        
        session.persist(student); // returns void no confirmation
        
        tx.commit(); // mandatory for dml
        
        session.close(); // good practice to close
        */
        
       /* Student student = new Student(103, "Sanskar");
        
        Address address = new Address(53,"Manasa","MP", student);
        
        session.persist(address); // by using this data will be stored only in add table because we address is not the owning side and student cannot be managed by address.
        
        tx.commit();
        
        session.close();
        */
    }
}
