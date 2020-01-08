package com.deloitte.estore.util;

public class InvalidNameException extends Exception {
	private static final long serialVersionUID = -1233050514318350554L;
	public InvalidNameException() {
		super("Name lesser than 3 Character");
	}
	
}
