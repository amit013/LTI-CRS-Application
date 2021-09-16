package com.lt.business;

import java.util.Scanner;


import com.lt.bean.User;
import com.lt.dao.UserDao;

public class UserImplService implements UserInterface{

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viewRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePassword() 
	{
		UserDao ud= new UserDao();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter username to be updated :"+"\n");    
	    String uname = in.nextLine(); 
	    System.out.print("Enter password to be updated :"+"\n");    
	    String pwrd = in.nextLine(); 
	    
	    for(User u1: ud.getUserCredential())
	    {
	    	if(u1.getUsername()==uname)
	    	{
	    		u1.setPassword(pwrd);
	    		System.out.println(u1.getUsername()+ " password has been updated");
			    
	    	}
	    }
	    System.out.println("Username not found, please enter the correct username");
		
	}

}
