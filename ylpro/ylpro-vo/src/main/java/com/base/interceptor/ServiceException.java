package com.base.interceptor;

public class ServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException(String err){
		super(err);
	}
}
