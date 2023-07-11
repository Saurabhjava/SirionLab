package com;

public class Demo {
	public static int method1(int x, int y) {
		System.out.println("Function1 Called");
		return x+y;
	}
	public static void main(String[] args) {
		//Demo obj=new Demo();
		ICalculator cal= Demo::method1;
		
		cal.calculate(20, 10);
	}
}
