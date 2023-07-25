package com.sirion.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "empdata", uniqueConstraints =@UniqueConstraint(columnNames = {"email"}))

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int empid;
	@Column(length = 20)
	private String name;
	private String email;
	private LocalDate doj;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, String email, LocalDate doj, double salary) {
		super();
		this.name = name;
		this.email = email;
		this.doj = doj;
		this.salary = salary;
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
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + ", doj=" + doj + ", salary="
				+ salary + "]";
	}
	
	

}
