package com.hexaware.restcrud.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity     //everything from persistence pkg working with springboot
@Table(name = "User_Policy_Details")
public class UserPolicy implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long policyNo;
	private String userName;
	private String policyName;
	private String company;
	private double premium;
	private String policyType;
	private LocalDate startDate;
	
	
	
	
	public UserPolicy(long policyNo, String userName, String policyName, String company, double premium,
			String policyType, LocalDate startDate) {
		super();
		this.policyNo = policyNo;
		this.userName = userName;
		this.policyName = policyName;
		this.company = company;
		this.premium = premium;
		this.policyType = policyType;
		this.startDate = startDate;
	}
	
	
	public long getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(long policyNo) {
		this.policyNo = policyNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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


	@Override
	public String toString() {
		return "UserPolicy [policyNo=" + policyNo + ", userName=" + userName + ", policyName=" + policyName
				+ ", company=" + company + ", premium=" + premium + ", policyType=" + policyType + ", startDate="
				+ startDate + "]";
	}
	
	
	
	
}
	
	
	