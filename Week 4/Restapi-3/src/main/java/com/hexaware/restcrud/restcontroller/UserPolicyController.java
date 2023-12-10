package com.hexaware.restcrud.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restcrud.entities.UserPolicy;
import com.hexaware.restcrud.service.IUserPolicyService;

@RestController
@RequestMapping("/api/userpolicies")
public class UserPolicyController 
{
	@Autowired
	IUserPolicyService service;
	
	
	
	@PostMapping(value = "/add",consumes = "application/json",produces = "application/json")
	public UserPolicy addUserPolicy(@RequestBody UserPolicy policy)
	{
		return service.addUserPolicy(policy);
	}
	
	
	@PutMapping(value = "/update",consumes = "application/json",produces = "application/json")
	public UserPolicy updateUserPolicy(@RequestBody UserPolicy policy)
	{
		return service.updateUserPolicy(policy);
	}
	
	
	@DeleteMapping(value = "/delete/{policyId}",consumes = "application/json")
	public void deleteUserPolicyById(@PathVariable Long policyNo)
	{
		service.deleteUserPolicyByNo(policyNo);
		System.out.println("Record has been deleted");
	}
	
	
	@GetMapping(value = "/getall",produces = "application/json")
	public List<UserPolicy> getAllUserPolicy()
	{
		return service.getAllUserPolicy();
		
	}
	
	
	@GetMapping(value = "/get/{policyId}",produces = "application/json")
	public UserPolicy getUserPolicyById(@PathVariable Long policyNo)
	{
		return service.getUserPolicyByNo(policyNo);
		
	}
}