package com.example.login;

public class LoginScreen {

	private String username;
	private String password;

	public LoginScreen(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public LoginScreen() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isUsernameNotEmpty(String username) {
		System.out.println("Checking username: " + username);
		return this.username != null && !this.username.trim().isEmpty();
	}

	public boolean isPasswordCorrect(String password) {
		System.out.println("Checking password: " + password);
		return this.password != null && !this.password.trim().isEmpty();

	}

	@Override
	public String toString() {
		return "Full Login Screen:\n  -> Username: " + username + "\n  -> Password: " + password + " ";
	}

}
