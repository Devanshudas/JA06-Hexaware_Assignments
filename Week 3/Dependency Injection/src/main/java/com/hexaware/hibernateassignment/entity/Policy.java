package com.hexaware.hibernateassignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="policy_table")


@NamedQuery(name="getPolicyById",query = "select p from Policy p where p.pid = :pid ")
@NamedQuery(name="getAllPolicy", query ="select p from Policy p")

public class Policy 
{
	
		@Id // PK
		private int pid;
		@Column(name="policy_name")
		private String pname;
		private double premium;
		private String company;
		private String type;
		
		public Policy() 
		{
			super();
		}

		public Policy(int pid, String pname, double premium, String company, String type) 
		{
			super();
			this.pid = pid;
			this.pname = pname;
			this.premium = premium;
			this.company = company;
			this.type = type;
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public double getPremium() {
			return premium;
		}

		public void setPremium(double premium) {
			this.premium = premium;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString() 
		
		{
			return "Policy [pid=" + pid + ", pname=" + pname + ", premium=" + premium + ", company=" + company
					+ ", type=" + type + "]";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
