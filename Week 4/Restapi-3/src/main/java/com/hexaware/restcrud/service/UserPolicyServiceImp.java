package com.hexaware.restcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restcrud.entities.UserPolicy;
import com.hexaware.restcrud.repository.UserPolicyRepository;

@Service
public class UserPolicyServiceImp implements IUserPolicyService {

	@Autowired 
	UserPolicyRepository upRepo;

	@Override
	public List<UserPolicy> getAllUserPolicy() {
		return upRepo.findAll();
	}

	@Override
	public UserPolicy updateUserPolicy(UserPolicy policy) {
		return upRepo.save(policy);
	}

	@Override
	public UserPolicy getUserPolicyByNo(Long policyNo) {
		return upRepo.findById(policyNo).orElse(null);
	}

	@Override
	public void deleteUserPolicyByNo(Long policyNo) {
		upRepo.deleteById(policyNo);
		
	}

	@Override
	public UserPolicy addUserPolicy(UserPolicy policy) {
		return upRepo.save(policy);
	}



}
