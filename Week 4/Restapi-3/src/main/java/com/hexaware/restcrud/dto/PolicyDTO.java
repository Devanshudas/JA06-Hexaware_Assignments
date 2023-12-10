package com.hexaware.restcrud.dto;

import java.time.LocalDate;

public class PolicyDTO 
{
	private long policyId;
	private String policyName;
	private String company;
	private double premium;
	private String policyType;
	private LocalDate startDate;
	
	
	
	public PolicyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolicyDTO(long policyId, String policyName, String company, double premium, String policyType,
			LocalDate startDate) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.company = company;
		this.premium = premium;
		this.policyType = policyType;
		this.startDate = startDate;
	}
	public long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	



}
