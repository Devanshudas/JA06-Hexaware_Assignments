package com.hexaware.customerapi.services;

import java.util.List;

import com.hexaware.customerapi.dto.CustomerDTO;
import com.hexaware.customerapi.dto.CustomerPolicyVO;
import com.hexaware.customerapi.entity.Customer;

public interface ICustomerService 
{
	public Customer addCustomer(CustomerDTO customerDTO);
	public CustomerDTO getCustomerById(int customerId);
	public List<Customer> getAllCustomer();
	public CustomerPolicyVO getCustomerAndPolicyById(int customerId);

}
