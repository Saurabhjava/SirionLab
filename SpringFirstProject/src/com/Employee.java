package com;

public class Employee {
	private int empid; 
	private String name;
	private String email;
	private Address address;
	
	public Employee(int empid, String name, String email,Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.address=address;
	}	
	public void printEmployee() {
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Email:"+email);
		System.out.println("=======Address Of Employee=========");
		System.out.println("City:"+address.getCity());
		System.out.println("Country:"+address.getCountry());
		System.out.println("Zip:"+address.getZip());
	}
	
}
