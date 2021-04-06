package com.mindtree.DepartmentApllication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.DepartmentApllication.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
