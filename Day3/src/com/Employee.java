package com;

import java.util.Objects;

public class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return name.length();
	}

	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee && this.name == ((Employee) obj).name)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Employee e = new Employee("Monty");
		Employee e1 = new Employee("Mont");

		String s1 = new String("M");

		System.out.println(e);
		System.out.println(e1);

		System.out.println(e.equals(e1));
	}
}
