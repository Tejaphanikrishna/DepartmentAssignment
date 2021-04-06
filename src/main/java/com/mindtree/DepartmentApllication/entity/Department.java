package com.mindtree.DepartmentApllication.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Dept_ID")
	private int departmentId;
	@Column(name = "Dept_Name")
	private String departmentName;
	@Column(name = "Dept_Limit")
	private int maximumLimit;
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;

	public Department() {
		super();
	}

	public Department(int departmentId, String departmentName, int maximumLimit, List<Employee> employees) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.maximumLimit = maximumLimit;
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

	public int getMaximumLimit() {
		return maximumLimit;
	}

	public void setMaximumLimit(int maximumLimit) {
		this.maximumLimit = maximumLimit;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
