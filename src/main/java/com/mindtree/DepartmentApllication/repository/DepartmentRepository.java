package com.mindtree.DepartmentApllication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.DepartmentApllication.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	@Query("select d from Department d where d.departmentName=?1 ")
	Department findByName(String deptName);
}
