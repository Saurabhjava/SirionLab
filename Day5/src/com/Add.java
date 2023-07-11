package com;

public class Add implements ICalculator {

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	@Override
	public void m1() {
		System.out.println("M1 of Add");
	}
	
	
}
