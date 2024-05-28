package com.example.application;

import java.io.IOException;

import com.example.exception.PasswordException;
import com.example.exception.UsernameException;
import com.example.read.ReadProperties;

public class Application {

	public static void main(String[] args) throws IOException, UsernameException, PasswordException {

		ReadProperties readProperties = new ReadProperties();

		readProperties.read();

		readProperties.checkUsername();
		readProperties.checkPassword();

		readProperties.getFullLoginInfo();

	}
}
