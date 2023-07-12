package com;

public class PrimeChecke {
	public boolean validatePrimeNumber(int number) {
		boolean flag=true;
		int n=number/2;
		if(number==0 || number==1) {
			flag=false;
		}
		if(number==2) {
			flag=true;
		}
		for(int i=2; i<n&&flag; i++) {
			if(number%i==0)
				flag=false;
		}
		return flag;
	}
	public void calculateNumber() {
		System.out.println("Calculate Method");	
	}
}
