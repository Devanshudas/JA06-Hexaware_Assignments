package com.hexaware.customerapi.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer_info")
public class Customer 
{
	@Id
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

	public Customer(int customerId, String customerName, LocalDate dob, long policyId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dob = dob;
		this.policyId = policyId;
	}

	public Customer() {
		super();
	}
	
	
	
	
	

}
