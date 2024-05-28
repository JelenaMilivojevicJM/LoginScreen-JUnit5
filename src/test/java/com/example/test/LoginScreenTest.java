package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.login.LoginScreen;
import com.example.read.ReadProperties;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class LoginScreenTest {
	private LoginScreen loginScreen;
	private ReadProperties readProperties;
	private Properties properties;

	@BeforeEach
	void setUp() throws IOException {
		properties = new Properties();
		readProperties = new ReadProperties();
		readProperties.read();
		loginScreen = new LoginScreen();
	}

	@Test
	@DisplayName("Read Property From test.properties File")
	public void ReadPropertyFromFile() throws IOException {
		InputStream inputStream = getClass().getResourceAsStream("/test.properties");

		properties.load(inputStream);

		String username = properties.getProperty("username");
		assertNotNull(username);

		String password = properties.getProperty("password");
		assertNotNull(password);
	}

	@Test
	@DisplayName("Valid Username")
	void testIsUsernameNotEmpty_ValidUsername() {
		loginScreen.setUsername(readProperties.getUsernameProperty());
		String validUsername = loginScreen.getUsername();
		boolean result = loginScreen.isUsernameNotEmpty(validUsername);
		assertTrue(result);
	}

	@Test
	@DisplayName("Invalid (NULL) Username")
	void testIsUsernameNotEmpty_NullUsername() {
		String nullUsername = null;
		boolean result = loginScreen.isUsernameNotEmpty(nullUsername);
		assertFalse(result);
	}

	@Test
	@DisplayName("When Username is Empty")
	void testIsUsernameNotEmpty_EmptyUsername() {
		String emptyUsername = "";
		boolean result = loginScreen.isUsernameNotEmpty(emptyUsername);
		assertFalse(result);
	}

	@Test
	@DisplayName("Valid Password")
	void testValidPassword() {
		String validPassword = "mySecretPassword123";
		loginScreen.setPassword(readProperties.getUsernameProperty());
		assertTrue(loginScreen.isPasswordCorrect(validPassword));
	}

	@Test
	@DisplayName("Empty Password")
	void testEmptyPassword() {
		String emptyPassword = "";
		assertFalse(loginScreen.isPasswordCorrect(emptyPassword));
	}

	@Test
	@DisplayName("Null Password")
	void testNullPassword() {
		String nullPassword = null;
		assertFalse(loginScreen.isPasswordCorrect(nullPassword));
	}

	@Test
	@DisplayName("Whitespace-Only Password")
	void testWhitespacePassword() {
		String whitespacePassword = "   ";
		assertFalse(loginScreen.isPasswordCorrect(whitespacePassword));
	}

}