package com.hexaware.hibernateassignment.dao;

import java.util.List;

import com.hexaware.hibernateassignment.entity.Policy;


public interface IPolicyDAO 
{
	public boolean createPolicy(Policy policy);
	public boolean updatePolicy(Policy policy);
	public boolean deletePolicy(Policy policy);
	
    public Policy getPolicyById(int policy_id);
	
	public List<Policy> getAllPolicy();

}
