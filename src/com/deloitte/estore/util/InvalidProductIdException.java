package com.deloitte.estore.util;

public class InvalidProductIdException extends Exception {

	private static final long serialVersionUID = 6013474937039351714L;

	public InvalidProductIdException() {
		super("ProductId length should be 5");
	}

}
