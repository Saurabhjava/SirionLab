package com;

public class MyThread {
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r=()->{
			for(int i=0;i<5; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		};
		Runnable r1=()->{
			for(int i=0;i<5; i++) {
				System.out.println("Thread2 is Running..");
			}
		};
		Runnable r2=()->{
			for(int i=0;i<5; i++) {
				System.out.println("Thread3 is Running..");
			}
		};
		
		Thread t1=new Thread(r,"A");
		Thread t2=new Thread(r,"B");
		Thread t3=new Thread(r,"C");
		
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY-2);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
