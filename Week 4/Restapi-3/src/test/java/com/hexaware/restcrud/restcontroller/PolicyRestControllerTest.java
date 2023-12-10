package com.hexaware.restcrud.restcontroller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.hexaware.restcrud.entities.Policy;

@SpringBootTest
class PolicyRestControllerTest {

	@Autowired
	RestTemplate restTemplate;
	Logger logger = LoggerFactory.getLogger(PolicyRestControllerTest.class);
	String baseURL = "http://localhost:8080/api/policies";
	
	@Test
	void testAddPolicy() {
		Policy policy = new Policy();
		policy.setPolicyName("Jeevan Suraksha");
		policy.setPremium(8000);

		Policy policy2 = restTemplate.postForObject(baseURL + "/add", policy, Policy.class);

		logger.info("Product Added: " + policy2);

		assertNotNull(policy2);
	}

	@Test
	void testUpdatePolicy() {
		Policy policy = new Policy();
		policy.setPolicyName("Car");
		policy.setPremium(99000);

		Policy policy2 = restTemplate.pu

		logger.info("Product Added: " + policy2);

		assertNotNull(policy2);
	}

	@Test
	void testDeletePolicyById() {
		
		int pid = 1;
		Policy policy2 = restTemplate.deleteO(baseURL, null);

		assertNotNull(policy2);

		logger.info(policy2.toString());	
		}

	@Test
	void testGetAllPolicy() {
		List<Policy> list = restTemplate.getForObject(baseURL + "/getall", List.class);

		logger.info("List of Policies : " + list);

		assertNotNull(list);
	}

	@Test
	void testGetPolicyById() {
		int pid = 1;
		Policy policy2 = restTemplate.getForObject(baseURL + "/get/" + pid, Policy.class);

		assertNotNull(policy2);

		logger.info(policy2.toString());
	}

}
