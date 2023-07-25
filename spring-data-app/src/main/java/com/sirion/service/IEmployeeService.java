package com.sirion.service;

import java.util.List;

import com.sirion.entity.Employee;

public interface IEmployeeService {
	public List<Employee> getAllEmployee();
	public void addEmployee(Employee e);
	public Employee getEmployee(int empid);
}
