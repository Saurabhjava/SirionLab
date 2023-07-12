package com;

class Calculator extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 100; i++) {
				total += i;
			}
			notify();
		}
	}
}

public class TestCalculator {

	public static void main(String[] args) throws InterruptedException {
		Calculator cal = new Calculator();
		cal.start();
		synchronized (cal) {
			System.out.println("Waiting for Calculation.....");
			cal.wait(1000);
			System.out.println("Total=" + cal.total);
		}

	}

}
