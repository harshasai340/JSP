package com.deloitte.estore.util;

public class InvalidPriceException extends Exception {
	private static final long serialVersionUID = -4312695925557370890L;
	public InvalidPriceException() {
		super("Price should be greater than 0.0");
	}
	
}
