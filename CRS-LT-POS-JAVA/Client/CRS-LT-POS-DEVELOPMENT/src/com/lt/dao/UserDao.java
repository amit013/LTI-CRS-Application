package com.lt.dao;

import java.util.ArrayList;
import java.util.List;

import com.lt.bean.Student;
import com.lt.bean.User;

public class UserDao
{		
	public List<User> userList= new ArrayList<User>();
	public List<User> getUserCredential()
	{
	
	  userList.add(new User("Amitt","am@123","Admin")); 
	  userList.add(new User("Swapnaa","sw345","Professor")); 
	  userList.add(new User("Radhika","rad123","Student")); 
	  userList.add(new User("Tusharr","Bihar123","Professor")); 
	  userList.add(new User("Vishwa","vish123","Student"));
	  
	  return userList;
	}
	
	public boolean signupUser(String username,String password, String role)
	{
		String r="Student";
		getUserCredential();
		userList.add(new User(username,password,r));
		return true;
	}
    
}
