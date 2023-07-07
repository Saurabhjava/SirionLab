package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter Name"); String
		 * name=sc.next(); System.out.println("Enter Email"); String email=sc.next();
		 * System.out.println("Enter Age"); int age=sc.nextInt();
		 */
		try {
			FileReader fr=new FileReader("c://demo/NewFile.txt");
			/*
			 * int data=0; while((data=fr.read())!=-1) System.out.print((char)data);
			 */
			BufferedReader br=new BufferedReader(fr);
			String str=null;
			while((str=br.readLine())!=null)
				System.out.println(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
