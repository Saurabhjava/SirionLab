package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<Product> s=new TreeSet<Product>();
		
		s.add(new Product("dd"));//2
		s.add(new Product("Book")); //4
		s.add(new Product("Mobile"));//6
		s.add(new Product("ab"));//2
		s.add(new Product("Car"));//3
		s.add(new Product("xy"));//2
		s.add(new Product("Book")); //4
		s.add(new Product("mm"));//2
	
		System.out.println(s);
		
	}
}
