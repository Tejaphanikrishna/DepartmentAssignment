package com.mindtree.DepartmentApllication.service.impl.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.DepartmentApllication.entity.Department;
import com.mindtree.DepartmentApllication.entity.Employee;
import com.mindtree.DepartmentApllication.repository.DepartmentRepository;
import com.mindtree.DepartmentApllication.repository.EmployeeRepository;
import com.mindtree.DepartmentApllication.service.impl.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepository;
	@Autowired
	private DepartmentRepository deptRepository;

	@Override
	public Employee addEmployeeDetails(Employee emp, int id) {
		Department dept = deptRepository.findById(id).orElse(null);
		Employee employee = null;
		if (dept != null) {
			emp.setDepartment(dept);
			employee = empRepository.save(emp);
			List<Employee> empList = new ArrayList<Employee>();
			empList.add(emp);
			dept.setEmployees(empList);
			deptRepository.save(dept);
		}
		return employee;
	}

	@Override
	public List<Employee> getAllDepartmentAndEmployeeDetails() {
		List<Employee> empList = new ArrayList<>();
		empList = empRepository.findAll();
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				double res;
				res = o1.getEmployeeSalary() - o2.getEmployeeSalary();
				return (int) res;
			}
		});
		return empList;
	}

}
