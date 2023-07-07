package com;

import java.io.Serializable;

public class Shipment {
	private int sid;
	private String sName;
	public Shipment(int sid, String sName) {
		super();
		this.sid = sid;
		this.sName = sName;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	
}
