package foo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		sc.close();
	}

}
