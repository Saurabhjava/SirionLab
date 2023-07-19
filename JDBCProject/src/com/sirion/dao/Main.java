package com.sirion.dao;

import java.time.LocalDate;

import com.sirion.bean.Address;
import com.sirion.bean.Employee;
import com.sirion.bean.Gender;
import com.sirion.service.EmployeeService;
import com.sirion.service.IEmployeeService;

public class Main {

	public static void main(String[] args) {
		IEmployeeService eService=new EmployeeService();
		Address add=new Address(13, "Bangalore", "India",65656464);
		Employee emp=new Employee(112, "Saurabh", "saurabh@gmail.com", LocalDate.parse("1984-02-22") , 999987654, 123456.00,Gender.M);
		emp.setAddress(add);
		System.out.println(eService.saveEmployee(emp));
	}

}
