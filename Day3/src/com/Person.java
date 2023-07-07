package com;

public class Person {
	private int age;
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) throws InvalidAgeException {
		if(age<18)
			throw new InvalidAgeException("Invalid Age");
		this.age = age;
	}


	public static void main(String[] args) {
		Person p=new Person();
		try {
			p.setAge(13);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
		
		System.out.println(p.getAge());
	}

}
