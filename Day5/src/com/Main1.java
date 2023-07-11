package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {
	public void filterEmployee(List<Employee> li,Predicate<Employee> p) {
		for(Employee e:li) {
			if(p.test(e))
				System.out.println(e);
		}
	}
	public static void main(String[] args) {
		List<Employee> li=new ArrayList<Employee>();
		li.add(new Employee(101,"Sarthak",123000));
		li.add(new Employee(102,"Amit",123000));
		li.add(new Employee(103,"Suman",23000));
		li.add(new Employee(104,"Atul",53000));
		li.add(new Employee(105,"Mayank",63000));
		li.add(new Employee(106,"Arvind",33000));
		li.add(new Employee(107,"Arvind",43000));
		li.add(new Employee(108,"Arvind",73000));
		li.add(new Employee(109,"Arvind",83000));
		
		/*
		 * li.stream().filter(e->e.getSalary()<50000).forEach(System.out::println);
		 * List<String>
		 * names=li.stream().filter(e->e.getSalary()>50000).map(e->e.getName()).collect(
		 * Collectors.toList());
		 * li.stream().filter(e->e.getSalary()>50000).sorted((e1,e2)->(int)(e1.getSalary
		 * ()-e2.getSalary())).forEach(System.out::println);
		 * 
		 * double
		 * totalSal=li.stream().filter(e->e.getSalary()>50000).collect(Collectors.
		 * averagingDouble(e->e.getSalary()));
		 * 
		 * for(Employee e:li) { names.add(e.getName()); }
		 * 
		 * System.out.println("Total Salary="+totalSal);
		 */
		
		long curTime=System.currentTimeMillis();
		double totalSal=li.stream().collect(Collectors.summingDouble(e->e.getSalary()));
		long curTime1=System.currentTimeMillis();
		System.out.println("Total Salary By Stream="+totalSal);
		System.out.println("Total Time By Stream="+(curTime1-curTime));
		System.out.println("===================================================");
		
		long curTime2=System.currentTimeMillis();
		double totalSal1=li.parallelStream().collect(Collectors.summingDouble(e->e.getSalary()));
		long curTime3=System.currentTimeMillis();
		System.out.println("Total Salary By Parallel Stream="+totalSal);
		System.out.println("Total Time By Parallel Stream="+(curTime3-curTime2));
		
	}

}
