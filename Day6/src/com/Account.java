package com;

public class Account implements Runnable {
	private double balance = 20000;

	public void withdraw(String name, double amt) {
		synchronized (this) {
			if (amt < balance) {
				System.out.println(name + " is going to withdraw..");
				balance -= amt;
			} else {
				System.out.println("Withdraw Not Allowed... for" + name);
			}
		}
		System.out.println(name + " has available balance=" + balance);
	}

	@Override
	public void run() {
		withdraw(Thread.currentThread().getName(), 8000);

	}
}
