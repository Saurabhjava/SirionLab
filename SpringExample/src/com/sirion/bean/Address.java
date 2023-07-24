package com.sirion.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Address {
	
	private int aid;
	//@Value("${city}")
	private String city;
	//@Value("${country}")
	private String country;
	private long zip;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int aid, String city, String country, long zip) {
		super();
		this.aid = aid;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	public int getAid() {
		return aid;
	}	
	public String getCity() {
		return city;
	}	
	public String getCountry() {
		return country;
	}	
	public long getZip() {
		return zip;
	}
	
	
	

}
