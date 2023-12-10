package com.hexaware.mapping.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department 
{
	@Id
	private int departmentId;
	private String departmentName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	//@JoinColumn(name = "dno")// dno is fk in employee child table(use for onetomanytest)
	private Set<Employee> employees = new HashSet<Employee>();// always initialize coll type pproperties to avoide null pointer excep.
	
	

	public Department() {
		super();	}

	public Department(int departmentId, String departmentName, Set<Employee> employees) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employees = employees;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
	
	public void addEmployee(Employee employee)
	{
		employee.setDepartment(this);// here employee need dept obj do adding current dept obj
		
		Set<Employee> set = getEmployees();
		
		set.add(employee);
	}
	
	

}
