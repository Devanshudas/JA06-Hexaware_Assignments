package com.hexaware.hibernateassignment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.hibernateassignment.dao.IPolicyDAOImp;
import com.hexaware.hibernateassignment.entity.Policy;

@Service
public class IPolicyServicesImp implements IPolicyServices 
{
	IPolicyDAOImp dao = new IPolicyDAOImp();

	@Override
	public boolean createPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return dao.createPolicy(policy);
	}

	@Override
	public boolean updatePolicy(Policy policy) {
		// TODO Auto-generated method stub
		return dao.updatePolicy(policy);
	}

	@Override
	public boolean deletePolicy(Policy policy) {
		// TODO Auto-generated method stub
		return dao.deletePolicy(policy);
	}

	@Override
	public Policy getPolicyById(int policy_id) {
		// TODO Auto-generated method stub
		return dao.getPolicyById(policy_id);
	}

	@Override
	public List<Policy> getAllPolicy() {
		// TODO Auto-generated method stub
		return dao.getAllPolicy();
	}

}
