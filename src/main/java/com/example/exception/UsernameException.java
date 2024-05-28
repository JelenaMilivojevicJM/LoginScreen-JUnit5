package com.example.exception;

public class UsernameException extends Exception {
	private static final long serialVersionUID = -7751289369616334055L;
	private String message;

	public UsernameException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
}