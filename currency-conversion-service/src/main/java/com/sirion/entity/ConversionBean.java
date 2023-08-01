package com.sirion.entity;

public class ConversionBean {
	private int qty;
	private String currencyFrom;
	private String currencyTo;
	private double rate;
	private int port;
	private double totalAmount;
	public ConversionBean() {
		// TODO Auto-generated constructor stub
	}
	
	public ConversionBean(int qty, String currencyFrom, String currencyTo, double rate, int port, double totalAmount) {
		super();
		this.qty = qty;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.rate = rate;
		this.port = port;
		this.totalAmount = totalAmount;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
