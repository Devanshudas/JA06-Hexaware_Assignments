package com.hexaware.restcrud.service;

import java.util.List;

import com.hexaware.restcrud.entities.Policy;

public interface IPolicyServices 
{
	public Policy addPolicy(Policy policy);
	public List<Policy> getAllPolicy();
	public Policy updatePolicy(Policy policy);
	public Policy getPolicyById(Long policyId);
	public void deletePolicyById(Long policyId);
	public Policy  getPolicyByPolicyName(String policyName);
	public List<Policy>  getPolicyByType(String policyType);
	public List<Policy>  getPolicyByPremiumGreaterThan(double premium);
	public List<Policy>  getPolicyByPremiumLessThan(double premium);
	public List<Policy> getPolicySorted(double premium);

	
	
	

}
