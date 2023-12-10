package com.hexaware.hibernateassignment.dao;

import java.util.List;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hexaware.hibernateassignment.entity.Policy;


@Repository
public class IPolicyDAOImp implements IPolicyDAO {

	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tr = session.beginTransaction();
	
	
	
	@Override
	public boolean createPolicy(Policy policy) {
		
		session.save(policy);
		tr.commit();
		sessionFactory.close();
		return false;
	}

	@Override
	public boolean updatePolicy(Policy policy) {
		
		session.saveOrUpdate(policy);
		tr.commit();
		sessionFactory.close();
		return false;
	}

	@Override
	public boolean deletePolicy(Policy policy) {
		
		session.delete(policy);
		tr.commit();
		sessionFactory.close();
		return false;
	}

	@Override
	public Policy getPolicyById(int id) {
		
		TypedQuery<Policy> query1 = session.getNamedQuery("getPolicyById");
		query1.setParameter("pid",id);
		Policy s1 = query1.getSingleResult();
		tr.commit();
		sessionFactory.close();
		return s1;
	}

	@Override
	public List<Policy> getAllPolicy() {
		
		javax.persistence.Query query3 = session.createNamedQuery("getAllPolicy");
		List <Policy> list = query3.getResultList();
		tr.commit();
		sessionFactory.close();
		
		
		return list;
	}
	
	
}
