package com.mindtree.DepartmentApllication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.DepartmentApllication.entity.Employee;
import com.mindtree.DepartmentApllication.service.impl.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@PostMapping("/addEmployeeDetails/{id}")
	public Employee addDetails(@RequestBody Employee emp, @PathVariable int id) {
		return empService.addEmployeeDetails(emp, id);
	}

	@GetMapping("/getAllDepartmentAndEmployeeDetails")
	public List<Employee> getAllData() {
		return empService.getAllDepartmentAndEmployeeDetails();
	}

}
