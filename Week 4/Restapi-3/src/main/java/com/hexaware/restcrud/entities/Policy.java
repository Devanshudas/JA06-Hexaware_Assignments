package com.hexaware.restcrud.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity     //everything from persistence pkg working with springboot
@Table(name = "Policy_Details")
public class Policy implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long policyId;
	
	@NotNull
	@Pattern(regexp="[A-Z][a-z]{3,10}")
	private String policyName;
	
	
	private String company;
	
	
	private double premium;
	private String policyType;
	private LocalDate startDate;
	
	
	public Policy(long policyId, String policyName, String company, double premium, String policyType,
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
	
	



	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", company=" + company + ", premium="
				+ premium + ", policyType=" + policyType + ", startDate=" + startDate + "]";
	}
	
	
	

	
}
