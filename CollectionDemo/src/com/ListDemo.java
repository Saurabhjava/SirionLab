package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
	// @SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice for Sorting by name or salary");
		String ch=sc.next();
		
		List<Employee> li = new ArrayList<Employee>();
		
		li.add(new Employee(101, "Parth", 98000));
		li.add(new Employee(102, "Dhruv", 128000));
		li.add(new Employee(103, "Rohit", 67000));
		li.add(new Employee(104, "Saurabh",18000));
		li.add(new Employee(105, "Monty", 198000));
		if(ch.equals("name"))
			Collections.sort(li,new SortByName());
		else
			Collections.sort(li,new SortBySalary());
		
		for(Employee e:li) {
				System.out.println(e);
		}
	
		/*List<String> li=new ArrayList<String>();		
		li.add("Parth");
		li.add("Dhruv");
		li.add("Rohit");
		li.add("Saurabh");
		li.add("Monty");
		
		Collections.sort(li);
		
		System.out.println(li);*/
	}

}
