package com;

public class Product implements Comparable<Product> {
	private String productName;
	private double price;

	public Product(String productName) {
		super();
		this.productName = productName;
	}
	
	public String toString() {
		return productName;
	}
	/*@Override
	public int hashCode() {
		return productName.length();
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("================");
		if(obj instanceof Product && this.productName==((Product)obj).productName)
			return true;
		else
			return false;
					
	}*/

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		
		System.out.println("*********************");
		return this.productName.compareTo(o.productName);
	}
	
}
