package com.deloitte.estore.util;

public class DuplicateProductException extends Exception {

	private static final long serialVersionUID = 5732860946252669179L;

	public DuplicateProductException() {
		super("Item already present in Database");
	}

}
