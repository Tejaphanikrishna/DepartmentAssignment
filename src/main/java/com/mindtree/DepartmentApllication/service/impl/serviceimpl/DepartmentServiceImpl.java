package com.mindtree.DepartmentApllication.service.impl.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.DepartmentApllication.entity.Department;
import com.mindtree.DepartmentApllication.repository.DepartmentRepository;
import com.mindtree.DepartmentApllication.service.impl.DepartmentService;

@Service

public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository deptRepository;

	@Override
	public Department addDepartmentDetails(Department dept) {
		Department department = null;
		department = deptRepository.save(dept);
		return department;
	}

	@Override
	public Department getDepartmentDetails(String name) {
		return deptRepository.findByName(name);
	}

	@Override
	public Department getDepartmentDetailsById(int id) {
		return deptRepository.findById(id).get();
	}

}
