package com.hexaware.customerapi.dto;

public class CustomerPolicyVO 
{
	private CustomerDTO customer;
	private PolicyDTO policy;
	
	
	
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	public PolicyDTO getPolicy() {
		return policy;
	}
	public void setPolicy(PolicyDTO policy) {
		this.policy = policy;
	}
	public CustomerPolicyVO(CustomerDTO customer, PolicyDTO policy) {
		super();
		this.customer = customer;
		this.policy = policy;
	}
	public CustomerPolicyVO() {
		super();
	}
	
	

}
