package com.lt.bean;

public class User {

	
	private String Username;
	private String Password;
	private String Role;
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	@Override
	public String toString() {
		return "User [Username=" + Username + ", Password=" + Password + ", Role=" + Role + "]";
	}
	public User(String username, String password, String role) {
		super();
		Username = username;
		Password = password;
		Role = role;
	}
	
}
