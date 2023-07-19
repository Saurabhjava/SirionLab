package com.sirion.dao;

import java.util.List;

import com.sirion.bean.Employee;

public interface IEmployeeDao {
	public String addEmployee(Employee emp);
	public List<Employee> allEmployee();
	public Employee getEmployee(int empid);
}
