package com.mindtree.DepartmentApllication.service.impl;

import java.util.List;

import com.mindtree.DepartmentApllication.entity.Employee;

public interface EmployeeService {

	Employee addEmployeeDetails(Employee emp, int id);

	List<Employee> getAllDepartmentAndEmployeeDetails();

}
