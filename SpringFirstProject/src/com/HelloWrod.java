package com;

import java.util.List;
import java.util.Set;

public class HelloWrod {
	private String name;
	private int age;
	private Set<String> books;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	public String sayHello() {
		System.out.println(books);
		return "Hello "+name+"!"+"Your Age is:"+age;
	}
}
