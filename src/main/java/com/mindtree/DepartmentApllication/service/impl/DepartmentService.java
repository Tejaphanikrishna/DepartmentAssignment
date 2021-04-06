package com.mindtree.DepartmentApllication.service.impl;

import com.mindtree.DepartmentApllication.entity.Department;

public interface DepartmentService {

	Department addDepartmentDetails(Department dept);

	Department getDepartmentDetails(String name);

	Department getDepartmentDetailsById(int id);

}
