package com;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> users =new HashMap<String,String>();
		
		users.put("Saurabh", "Abc123");
		users.put("Shubham", "xyz123");
		users.put("Shrthak", "aaa123");
		users.put("Samardeep", "abcd");
		users.put("Kush", "xyz123");
		users.put("Yash", "aaa123");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter UserName");
		String uname=sc.next();		
		
		if(users.containsKey(uname)) {
			System.out.println("Enter Password");
			String pass=sc.next();
			if(users.get(uname).equals(pass)) 
				System.out.println("Welcome "+uname+ " !");
			else
				System.out.println("Wrong Password");
		}
		else {
			System.out.println("Invalid User!!!");
		}
	}

}
