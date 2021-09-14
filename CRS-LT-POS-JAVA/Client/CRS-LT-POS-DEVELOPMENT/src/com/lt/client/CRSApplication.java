package com.lt.client;

import java.util.Scanner;

import com.lt.bean.Course;
import com.lt.business.CourseImplService;
import com.lt.business.CourseInterface;
import com.lt.business.UserImplService;
import com.lt.business.UserInterface;

public class CRSApplication {


	public static void main(String[] args) {

		Course course1= new Course();
		CourseInterface course=new CourseImplService();

		System.out.println("*******************Welcome to Course Registration System*******************");
		System.out.println("\n");
		System.out.println("Select the below option to proceed further");
		System.out.println("1. Login"+"\n"+"2. Signup"+"\n"+"3. Update Password"+"\n"+"4. Exit");
		Scanner in = new Scanner(System.in);
		int selection = in.nextInt();

		UserInterface user = new UserImplService();


		switch(selection)
		{
		case 1: System.out.println("Login:-");
		user.login();                 
		break;

		case 2: System.out.println("Signup as Student:-");
		user.signup();
		break;

		case 3: System.out.println("Update Password:-");
		user.updatePassword();
		break;

		case 4: System.out.println("Exit");
		break;

		}

	}

} 
