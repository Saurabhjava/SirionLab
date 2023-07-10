package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MixCollection {
	
	public void m1(List<Integer> li) {
		li.add(12);
		li.add(25);
		System.out.println(li);
	}

	public static void main(String[] args) {
		MixCollection obj=new MixCollection();
		List li1=new ArrayList();
		li1.add("A");
		li1.add("D");
		li1.add("B");
		
		obj.m1(li1);
	}

}
