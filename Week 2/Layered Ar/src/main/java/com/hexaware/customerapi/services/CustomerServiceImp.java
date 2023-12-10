package com.hexaware.customerapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hexaware.customerapi.dto.CustomerDTO;
import com.hexaware.customerapi.dto.CustomerPolicyVO;
import com.hexaware.customerapi.dto.PolicyDTO;
import com.hexaware.customerapi.entity.Customer;
import com.hexaware.customerapi.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements ICustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	RestTemplate restTemplate;
	

	@Override
	public Customer addCustomer(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		customer.setCustomerId(customerDTO.getCustomerId());
		customer.setCustomerName(customerDTO.getCustomerName());
		customer.setDob(customerDTO.getDob());
		customer.setPolicyId(customerDTO.getPolicyId());
		return customerRepo.save(customer);
	}

	@Override
	public CustomerDTO getCustomerById(int customerId) {
		Customer customer =customerRepo.findById(customerId).orElse(new Customer());
		return new CustomerDTO(customer.getCustomerId(),customer.getCustomerName(),customer.getDob(),customer.getPolicyId());
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepo.findAll();
	}

	@Override
	public CustomerPolicyVO getCustomerAndPolicyById(int customerId) {
		CustomerDTO customerDTO = getCustomerById(customerId);
		long policyId =customerDTO.getPolicyId();
		
		PolicyDTO policyDTO = restTemplate.getForObject("http://localhost:8080/api/policies/get/"+ policyId, PolicyDTO.class);
		CustomerPolicyVO  customerpolicyvo = new CustomerPolicyVO();
		customerpolicyvo.setCustomer(customerDTO);
		customerpolicyvo.setPolicy(policyDTO);
		return customerpolicyvo;
	}

}
