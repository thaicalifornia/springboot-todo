package com.thaicalifornia.rest.webservice.restfulwebservices.hello;

public class helloBean {

	private String message;

	public helloBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "helloBean [message=" + message + "]";
	}
	
}
