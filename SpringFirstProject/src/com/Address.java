package com;

public class Address {
	private String city;
	private String country;
	private long zip;
	
	public Address() {
		
	}
	public Address(String city, String country, long zip) {
		super();
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	
}
