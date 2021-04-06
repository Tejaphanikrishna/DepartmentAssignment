package com.mindtree.DepartmentApllication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.DepartmentApllication.entity.Department;
import com.mindtree.DepartmentApllication.service.impl.DepartmentService;

@RestController
@RequestMapping("/Department")
public class DepartmentController {
	@Autowired
	private DepartmentService deptService;

	@PostMapping("/addDepartmentDetails")
	public ResponseEntity<?> addDetails(@RequestBody Department dept) {
		Department department = null;
		department = deptService.addDepartmentDetails(dept);
		return new ResponseEntity<Department>(department, HttpStatus.ACCEPTED);

	}

	@GetMapping("/getDepartmentDetails/{name}")
	public Department getDetails(@PathVariable String name) {
		return deptService.getDepartmentDetails(name);
	}

	@GetMapping("/getDepartmentIDDetails/{id}")
	public Department getDeptDetails(@PathVariable int id) {
		return deptService.getDepartmentDetailsById(id);
	}

}
