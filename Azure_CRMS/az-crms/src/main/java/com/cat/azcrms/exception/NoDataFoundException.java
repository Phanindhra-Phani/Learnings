package com.cat.azcrms.exception;

public class NoDataFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;

	public NoDataFoundException() {
		super();
	}

	public NoDataFoundException(String errorMessage) {
		
		super(errorMessage);
	}

}
