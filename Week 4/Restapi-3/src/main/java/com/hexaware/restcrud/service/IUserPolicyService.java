package com.hexaware.restcrud.service;

import java.util.List;

import com.hexaware.restcrud.entities.UserPolicy;

public interface IUserPolicyService 
{
	public UserPolicy addUserPolicy(UserPolicy policy);
	public List<UserPolicy> getAllUserPolicy();
	public UserPolicy updateUserPolicy(UserPolicy policy);
	public UserPolicy getUserPolicyByNo(Long policyNo);
	public void deleteUserPolicyByNo(Long policyNo);
	

}
