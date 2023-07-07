package com;

import java.io.Serializable;

public class Product implements Serializable {
	private int pid;
	private String productName;
	private transient double price;
	private transient Shipment shipment;
	
	public Shipment getShipment() {
		return shipment;
	}
	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
	public Product(int pid, String productName, double price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
