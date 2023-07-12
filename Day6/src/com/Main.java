package com;

public class Main {

	public static void main(String[] args) {
		Account obj=new Account();
		
		Thread t1=new Thread(obj,"X");
		Thread t2=new Thread(obj,"Y");
		Thread t3=new Thread(obj,"Z");

		t1.start();
		t2.start();
		t3.start();
	}

}
