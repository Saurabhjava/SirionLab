package com.sirion.bean;

import java.time.LocalDate;

public class Employee {
	private int empid;
	private String name;
	private String email;
	private LocalDate dob;
	private int phone;
	private double salary;
	private Gender gender;
	private Address address;
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + ", dob=" + dob + ", phone=" + phone
				+ ", salary=" + salary + ", gender=" + gender + ", address=" + address + "]";
	}
	public Employee(int empid, String name, String email, LocalDate dob, int phone, double salary, Gender gender) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.salary = salary;
		this.gender = gender;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
