package com.hexaware.restcrud.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.restcrud.entities.Policy;

@SpringBootTest // special annotation for testing in springboot app
class PolicyServicesImpTest 
{
	@Autowired
	IPolicyServices service;
	
	
	@BeforeAll	
	static void setUpBeforeClass() throws Exception
	{
		
	}

	@Test
	void testAddPolicy() 
	{
		/*PolicyDTO policyDTO = new PolicyDTO();
		policyDTO.setPolicyName("Jeevan Suraksha");
		
		Policy policy = service.addPolicy(policyDTO);
		
		assertEquals("Jeevan Suraksha",policy.getPolicyName());
		*/
	}

	@Test
	void testGetAllPolicy() 
	{
		
	}

	@Test
	void testGetPolicyById() 
	{
		
		
	}

}
