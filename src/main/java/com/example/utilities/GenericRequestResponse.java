package com.example.utilities;

public class GenericRequestResponse {

	private String message;
	
	public GenericRequestResponse(){}
	public GenericRequestResponse(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
