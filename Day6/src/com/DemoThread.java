package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.tree.FixedHeightLayoutCache;

public class DemoThread {

	public static void main(String[] args) {
		Runnable r=()->System.out.println(Thread.currentThread().getName()+" is Running");
		ExecutorService es=Executors.newCachedThreadPool();
		for(int i=0; i<20; i++) {
			//Thread t=new Thread(r);
			//t.start();
			es.execute(r);
		}

	}

}
