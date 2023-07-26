package com.sirion.service;

import java.util.List;

import com.sirion.entity.Employee;

public interface IEmployeeService {
	public Iterable<Employee> getAllEmployee();
	public void addEmployee(Employee e);
	public Employee getEmployee(int empid);
	public Employee getEmployeeByName(String name,String email);
}
