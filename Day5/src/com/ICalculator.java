package com;

@FunctionalInterface
public interface ICalculator {
	int calculate(int a, int b);
	default void m1() {
		System.out.println("n1 of ICalculator");
	}
	
}
