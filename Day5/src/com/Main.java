package com;

public class Main {

	public static void main(String[] args) {
		/*
		 * ICalculator add=new ICalculator() {
		 * 
		 * @Override public int calculate(int a, int b) { // TODO Auto-generated method
		 * stub return a+b; }
		 * 
		 * @Override public void m2() { // TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * };
		 * 
		 * ICalculator sub=new ICalculator() {
		 * 
		 * @Override public int calculate(int a, int b) { // TODO Auto-generated method
		 * stub return a-b; }
		 * 
		 * };
		 */

		ICalculator add = (x, y) -> {
			System.out.println("Adding Two Nos.....");
			return x + y;
		};
		ICalculator sub = (x, y) -> x - y;
		System.out.println(add.calculate(10, 5));
		add.m1();
		System.out.println(sub.calculate(10, 5));

	}

}
