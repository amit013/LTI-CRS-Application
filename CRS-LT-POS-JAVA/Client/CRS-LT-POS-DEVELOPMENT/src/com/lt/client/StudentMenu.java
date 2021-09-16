package com.lt.client;

import java.util.Scanner;

import com.lt.business.StudentImplService;
import com.lt.business.StudentInterface;

public class StudentMenu 
{
	static
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = in.next();


		Scanner in1 = new Scanner (System.in);
		System.out.println("Enter Password");
		String password = in1.next();


		Scanner in2 = new Scanner (System.in);
		System.out.println("Enter Contact");
		long contact = in2.nextLong();   //check this datatype


		Scanner in3 = new Scanner (System.in);
		System.out.println("Enter emailID");
		String email = in3.next();
		
		
		Scanner in4 = new Scanner (System.in);
		System.out.println("Enter Address");
		String address = in4.next();
		
		StudentInterface ss=new StudentImplService();
		ss.signup(username,password,contact,email,address);
		 
	}
	
}
