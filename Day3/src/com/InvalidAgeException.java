package com;

public class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public InvalidAgeException(String msg) {
		//super(msg);
		this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}
}
