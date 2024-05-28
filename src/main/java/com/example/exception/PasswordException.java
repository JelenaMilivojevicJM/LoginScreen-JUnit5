package com.example.exception;

public class PasswordException extends Exception{
	private static final long serialVersionUID = -7751289369616334055L;
	private String message;

	public PasswordException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
