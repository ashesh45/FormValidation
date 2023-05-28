package com.practice.entities;

public class LoginData {
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String userName;
	private String email;
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}

}
