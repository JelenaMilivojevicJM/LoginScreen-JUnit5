package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.exception.PasswordException;
import com.example.exception.UsernameException;
import com.example.read.ReadProperties;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class ReadPropertiesTest {

	private ReadProperties readProperties;
	private Properties properties;

	@BeforeEach
	public void setUp() {
		properties = new Properties();
		readProperties = new ReadProperties();
		try {
			readProperties.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
	void testValidUsername() {
		readProperties.getUsernameProperty();
		assertDoesNotThrow(() -> readProperties.checkUsername());
	}

	@Test
	@DisplayName("Empty Username")
	void testEmptyUsername4() {
		String epmptyUsername = "";
		String somePassword = readProperties.getPasswordProperty();
		readProperties.setFullLogin(epmptyUsername, somePassword);
		readProperties.setUsernameProperty(epmptyUsername);

		assertThrows(UsernameException.class, () -> readProperties.checkUsername());
	}

	@Test
	@DisplayName("Whitespace-Only Username")
	void testUsernameWhitespace() {
		String whitespaceUsername = " ";
		String somePassword = readProperties.getPasswordProperty();
		readProperties.setFullLogin(whitespaceUsername, somePassword);
		assertThrows(UsernameException.class, () -> readProperties.checkUsername());
	}

	@Test
	@DisplayName("Valid Password")
	void testValidPassword() {
		readProperties.getPasswordProperty();
		assertDoesNotThrow(() -> readProperties.checkPassword());
	}

	@Test
	@DisplayName("Empty Password")
	void testInvalidPassword() {
		String someUsername = readProperties.getUsernameProperty();
		String whitespacePassword = "";
		readProperties.setFullLogin(someUsername, whitespacePassword);
		assertThrows(PasswordException.class, () -> readProperties.checkPassword());
	}

	@Test
	@DisplayName("Password with Whitespace ")
	void testWhitespacePassword() {
		String someUsername = readProperties.getUsernameProperty();
		String whitespacePassword = " ";
		readProperties.setFullLogin(someUsername, whitespacePassword);
		assertThrows(PasswordException.class, () -> readProperties.checkPassword());
	}

}
