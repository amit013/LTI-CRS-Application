package com.lt.bean;

/**
 * 
 * @author G4-FullStackGroup
 * User Class
 * 
 */
public class User {


	private String Username;
	private String Password;
	private int RoleId;


	/**
	 *Parametrised Constructor
	 * @return values
	 */
	public User(String username, String password, int roleId) {
		super();
		Username = username;
		Password = password;
		RoleId = roleId;
	}


	/**
	 * Method to get Username
	 * @return Username
	 */
	public String getUsername() {
		return Username;
	}
	/**
	 * Method to set User name
	 * @param Username
	 */
	public void setUsername(String username) {
		Username = username;
	}
	/**
	 * Method to get Password
	 * @return Password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * Method to set Password
	 * @param Password
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * Method to get RoleId
	 * @return RoleId
	 */
	public int getRoleId() {
		return RoleId;
	}
	/**
	 * Method to set RoleId
	 * @param RoleId
	 */
	public void setRoleId(int roleId) {
		RoleId = roleId;
	}

}	
