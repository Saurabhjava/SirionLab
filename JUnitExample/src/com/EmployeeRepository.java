package com;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	private static List<Employee> li;
	static {
		li=new ArrayList<Employee>();
		li.add(new Employee(1001, "Yash", "yash@gmail.com"));
		li.add(new Employee(1002, "Dhruv", "dhruv@gmail.com"));
		li.add(new Employee(1003, "Monty", "monty@gmail.com"));
		li.add(new Employee(1004, "Sarthak", "sarthak@gmail.com"));
	}
	public static List<Employee> getEmployeeList() {
		return li;
	}
}
