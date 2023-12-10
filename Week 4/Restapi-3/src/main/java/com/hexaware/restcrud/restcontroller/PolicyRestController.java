package com.hexaware.restcrud.restcontroller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restcrud.entities.Policy;
import com.hexaware.restcrud.exceptions.PolicyNotFoundException;
import com.hexaware.restcrud.service.IPolicyServices;
import com.hexaware.restcrud.service.PolicyServicesImp;

@RestController
@RequestMapping("/api/policies")
public class PolicyRestController 
{
	@Autowired
	IPolicyServices service;
	
	
	
	@PostMapping(value = "/add",consumes = "application/json",produces = "application/json")
	public Policy addPolicy(@RequestBody Policy policy)
	{
		boolean isValid = PolicyServicesImp.inputValidation(policy);
		Policy p = null;
		if(isValid)
		{
			p= service.addPolicy(policy);
		}
		return p;
	}
	
	
	@PutMapping(value = "/update",consumes = "application/json",produces = "application/json")
	public Policy updatePolicy(@Validated @RequestBody Policy policy)
	{
		return service.updatePolicy(policy);
	}
	
	
	@DeleteMapping(value = "/delete/{policyId}",consumes = "application/json")
	public void deletePolicyById(@PathVariable @Valid @Min(1) Long policyId)
	{
		service.deletePolicyById(policyId);
		System.out.println("Record has been deleted");
	}
	
	@GetMapping(value = "/get/{policyId}")
	public Policy getPolicyById(@PathVariable Long policyId)
	{
		return service.getPolicyById(policyId);
	}
	
	
	@GetMapping(value = "/getall",produces = "application/json")
	public List<Policy> getAllPolicy()
	{
		return service.getAllPolicy();
		
	}
	
	
	
	/*@GetMapping(value = "/get/{policyId}",produces = "application/json")
	public ResponseEntity<String> getPolicyById(@PathVariable Long policyId) throws PolicyNotFoundException
	{
		
		Policy p = service.getPolicyById(policyId);
		ResponseEntity<String> response;
		if(p==null)
		{
			try 
			{
				throw new PolicyNotFoundException(HttpStatus.BAD_REQUEST, "Policy Not Found with policyId "+ policyId);
	
			}
			catch(PolicyNotFoundException po)
			{
				response = new ResponseEntity<String>(po.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}
		
		else
		{
			response = new ResponseEntity<String>(p.toString(), HttpStatus.FOUND);

		}
		return response;
	}
	*/
	
	@GetMapping("/getbyname/{policyName}")
	public Policy getPolicyByName(@PathVariable @Validated String policyName) 
	{
		
		return service.getPolicyByPolicyName(policyName);
		
	}
	
	@GetMapping("/getbytype/{policyType}")
	public List<Policy> getPolicyByType(@PathVariable @Validated String policyType) {
		
		return service.getPolicyByType(policyType);
		
	}
	
	
	@GetMapping("/get/premiumgt/{premium}")
	public List<Policy> getByPremiumGreaterThan(@PathVariable @Validated double premium)
	{
		return service.getPolicyByPremiumGreaterThan(premium);
		
	}
	
	@GetMapping("/get/premiumlt/{premium}")
	public List<Policy> getByPremiumLessThan(@PathVariable @Validated double premium)
	{
		return service.getPolicyByPremiumLessThan(premium);
		
	}
	
	@GetMapping("/get/sorted/{premium}")
	public List<Policy> getPoliciesSorted(@PathVariable @Validated double premium)
	{
		return service.getPolicySorted(premium);
		
	}
	
	@GetMapping("/get/{a}/{b}")
	public int div(@PathVariable int a, @PathVariable int b)
	{
		return a/b;
	}
	
	@ResponseStatus(value = HttpStatus.FORBIDDEN, reason= "Cannoy divide by 0")
	@ExceptionHandler({ArithmeticException.class})
	public void handleException()
	{
		
	}

}
