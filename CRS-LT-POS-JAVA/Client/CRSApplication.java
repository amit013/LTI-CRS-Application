package com.lt.client;

import java.util.Scanner;

import com.lt.bean.Course;
import com.lt.bean.Student;
import com.lt.business.AdminImplService;
import com.lt.business.AdminInterface;
import com.lt.business.CourseImplService;
import com.lt.business.CourseInterface;
import com.lt.business.GradeCardImplService;
import com.lt.business.GradeCardInterface;
import com.lt.business.SemesterRegistrationImplService;
import com.lt.business.SemesterRegistrationInterface;
import com.lt.business.StudentImplService;
import com.lt.business.StudentInterface;
import com.lt.business.UserImplService;
import com.lt.business.UserInterface;

public class CRSApplication {

	public static void main(String[] args)
	{
		StudentInterface sI= new StudentImplService();
		UserInterface uI= new UserImplService();
		GradeCardInterface gI= new GradeCardImplService();
		
		//CourseInterface cI=new CourseImplService();
		/*
		 * Course course1= new Course();
		 * 
		 * CourseInterface course=new CourseImplService();
		 * System.out.println(course.createCourse());
		 * System.out.println(course.listCourse());
		 * System.out.println(course.deleteCourse("A002"));
		 * System.out.println(course.updateCourse(new Course("A003","Biology")));
		 * System.out.println(course.listCourse());
		 * 
		 * AdminInterface admin= new AdminImplService(); admin.editCourse(new
		 * Course("A003","Biology")); System.out.println(course.listCourse());
		 */

		int flag=0;
		System.out.println("Welcome to Course Registration System");
		System.out.println("**************************************");
		System.out.println("Select the Role");
		System.out.println("1. Admin"+"\n"+ "2. Student"+"\n"+"3. Professor");
		Scanner in = new Scanner(System.in);
		int roleSelection = in.nextInt(); 

		switch(roleSelection)
		{
			case 1: System.out.println("Welcome Admin"+"\n");
					break;
	
			case 2: System.out.println("Welcome Student"+"\n");
					break;
	
			case 3: System.out.println("Welcome Professor"+"\n");
					break;

		}

		while(flag!=1)
		{
			System.out.println("\n"+"Select the below option to proceed further");
			System.out.println("1. Login"+"\n"+ "2. Student Signup"+"\n"+"3. Update Password"+"\n"+"4. Exit"+"\n");
			Scanner in1 = new Scanner(System.in);
			int selection = in1.nextInt(); 


			switch(selection)
			{ 
			case 1: System.out.println("Login"+"\n");
					if(sI.login()==true)
					{
						System.out.println("Welcome to Course Registration System");
						System.out.println("**************************************");
						System.out.println("Select the option");
						System.out.println("1. Course Selection"+"\n"+ "2. Semester Registration"+"\n"+"3. View Grade"+"\n"+"3. Pay Fee"+"\n");
						Scanner in4 = new Scanner(System.in);
						int option = in4.nextInt(); 
						switch(option)
						{
						case 1: System.out.println("CourseSelection"+"\n");
								sI.courseSelection();
								break;
								
						case 2: System.out.println("Semester Registration"+ "\n");
								SemesterRegistrationInterface sreg= new SemesterRegistrationImplService();
						        sreg.semesterMenu(); 
								break;
							 
						case 3: System.out.println("ViewGrade"+"\n");
								gI.viewGradeCard();
								break;
		
						case 4: System.out.println("PayFee"+"\n");
								break;
						}
					}
					break;
			
			case 2: System.out.println("Signup as Student"+"\n"); 
					new StudentMenu();
					break;

			case 3: System.out.println("Update Password"+"\n"); 
					uI.updatePassword();
					break;

			case 4: System.out.println("Exit"); 
					flag=1;
					break;

			}
		}

	}
}


