package com.example.read;

import java.util.Properties;

import com.example.exception.PasswordException;
import com.example.exception.UsernameException;
import com.example.login.LoginScreen;

import java.io.IOException;
import java.io.InputStream;

public class ReadProperties {

	private Properties loginProperties = new Properties();
	private String usernameProperty;
	private String passwordProperty;
	private LoginScreen loginScreen;

	
	public void read() throws IOException {
		try (InputStream inputStream = getClass().getResourceAsStream("/login.properties");) {
			if (inputStream == null) {
				throw new IOException("Failed to load login.properties");
			}
			loginProperties.load(inputStream);
		}
		this.usernameProperty = loginProperties.getProperty("username");
		this.passwordProperty = loginProperties.getProperty("password");
		this.loginScreen = new LoginScreen(usernameProperty, passwordProperty);
	}

	public void checkUsername() throws UsernameException {
		if (!loginScreen.isUsernameNotEmpty(usernameProperty)) {
			throw new UsernameException("Username is not valid!");
		}
		System.out.println(" -> Username is valid!");
	}

	public void checkPassword() throws PasswordException {
		if (!loginScreen.isPasswordCorrect(passwordProperty)) {
			throw new PasswordException("Password is not valid!");
		}
		System.out.println(" -> Password is valid!");
	}

	public String getUsernameProperty() {
		return usernameProperty;
	}

	public String getPasswordProperty() {
		return passwordProperty;
	}

	public void getFullLoginInfo() {
		System.out.println(loginScreen.toString());
	}

	public void setUsernameProperty(String newUsername) {
		this.usernameProperty = newUsername;
	}

	public void setPasswordProperty(String newPassword) {
		this.passwordProperty = newPassword;
	}

	public void setFullLogin(String newUsername, String newPassword) {
		loginScreen.setUsername(newUsername);
		loginScreen.setPassword(newPassword);
	}

}
