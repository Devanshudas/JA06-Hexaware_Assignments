package com.hexaware.customerapi.dto;

import java.time.LocalDate;

public class CustomerDTO 
{
	private int customerId;
	private String customerName;
	private LocalDate dob;
	
	private long policyId;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public CustomerDTO(int customerId, String customerName, LocalDate dob, long policyId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dob = dob;
		this.policyId = policyId;
	}

	public CustomerDTO() {
		super();
	}
	
	

}
