package com;

public class HelloWrod {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello: "+name+"!";
	}
}
