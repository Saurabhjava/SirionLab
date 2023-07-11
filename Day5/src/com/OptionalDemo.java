package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

public class OptionalDemo {
	public static void main(String[] args) {
		/*
		 * Date d=new Date(); Locale l=new Locale("HI","IN"); DateFormat
		 * df=DateFormat.getDateInstance(DateFormat.FULL,l);
		 * 
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter DOB"); String
		 * dob=sc.next();
		 * 
		 * LocalDate
		 * dob1=LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		 * LocalDate now=LocalDate.now(); Period diff = Period.between(dob1,now );
		 * System.out.println("Years="+diff.getYears()+"Month="+diff.getMonths()+"Days="
		 * +diff.getDays());
		 */
		
		System.out.println(Thread.currentThread());
	}
}
