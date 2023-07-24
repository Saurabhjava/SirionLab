package com.sirion.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sirion.bean.Employee;

@Service("es")
//@Scope("prototype")
public class EmployeeService {
	@Autowired
	private Employee emp;
	
	public EmployeeService() {
		System.out.println("EmployeeService Object Created....");
	}
	public void printEmployee() {
		System.out.println("Employee ID:"+emp.getEmpid());
		System.out.println("Employee Name:"+emp.getName());
		System.out.println("Employee Email:"+emp.getEmail());
		System.out.println("Employee Salary:"+emp.getSalary());
		System.out.println("=============Address of Employee===========");
		System.out.println("Address Id="+emp.getAddress().getAid());
		System.out.println("City="+emp.getAddress().getCity());
		System.out.println("Country="+emp.getAddress().getCountry());
		System.out.println("Zip="+emp.getAddress().getZip());
	}
	@PostConstruct
	public void init() {
		System.out.println("Called before Object Creation");
	}
	@PreDestroy
	public void des() {
		System.out.println("Object Destroyes....");
	}
}
