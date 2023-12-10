package com.hexaware.restcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restcrud.entities.Policy;
import com.hexaware.restcrud.repository.PolicyRepository;

@Service
public class PolicyServicesImp implements IPolicyServices 
{
	
	@Autowired 
	PolicyRepository policyRepo;
	
	
	public static boolean inputValidation(Policy p)
	{
		boolean flag = false;
		if(p.getPolicyName().length()>3 && p.getPremium()>100)
		{
			flag = true;
		}
	return flag;
	}

	@Override
	public Policy addPolicy(Policy policy) 
	{
		return policyRepo.save(policy);
	}

	@Override
	public List<Policy> getAllPolicy() 
	{
		return policyRepo.findAll();
	}
	
	@Override
	public Policy getPolicyById(Long policyId) 
	{
		return policyRepo.findById(policyId).orElse(null);
	}
	
	@Override
	public void deletePolicyById(Long policyId) 
	{
		 policyRepo.deleteById(policyId);
	}

	@Override
	public Policy updatePolicy(Policy policy) {
		return policyRepo.save(policy);
	}
	
	@Override
	public Policy getPolicyByPolicyName(String policyName) {
	
		return policyRepo.findByPolicyName(policyName);
	}
	
	@Override
	public List <Policy> getPolicyByType(String policyType) {
	
		return policyRepo.findByPolicyType(policyType);
	}

	@Override
	public List<Policy> getPolicyByPremiumGreaterThan(double premium) {
		
		return policyRepo.findByPremiumGreaterThan(premium);
	}

	@Override
	public List<Policy> getPolicyByPremiumLessThan(double premium) 
	{
		return policyRepo.findByPremiumLessThan(premium);
	}

	@Override
	public List<Policy> getPolicySorted(double premium) {
		// TODO Auto-generated method stub
		return policyRepo.getPoliciesSorted(premium);
	}
	
	
}
