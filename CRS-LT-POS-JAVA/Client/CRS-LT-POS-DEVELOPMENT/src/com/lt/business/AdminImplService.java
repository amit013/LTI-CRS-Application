package com.lt.business;

import java.util.Scanner;

import com.lt.bean.Course;

public class AdminImplService implements AdminInterface{

	CourseInterface course1 = new CourseImplService();
	Course course=new Course();
	@Override
	public String login() 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Admin username :"+"\n");    
	    String adminname = in.nextLine(); 
		System.out.println("Enter the Admin password:");    
	    String adminpassword = in.nextLine(); 

  // error message
		while (!userInput.contentEquals("admin") || !passInput.contentEquals("admin001")) {
			if (!userInput.contentEquals("admin")) {
				System.out.println("Sorry the username is not correct! Try again.");
				System.out.println("Enter the Admin username:");
				userInput = in.readLine();
				System.out.println("Enter the Admin password:");
				passInput = in.readLine();
			} else if (!passInput.contentEquals("admin001")) {
				System.out.println("Sorry the password is not correct! Try again.");
				System.out.println("Enter the Admin username:");
				userInput = in.readLine();
				System.out.println("Enter the Admin password:");
				passInput = in.readLine();
			}
		}

		System.out.println("Congrats! You have been successfully logged in as an admin!");
		boolean logout = false;
		while (!logout) {
			System.out.println("What would you like to do today?");
			System.out.println("Enter '1' to Manage Courses");
			System.out.println("Enter '2' to View Reports");
			System.out.println("Enter '3' to Exit");
			String option2 = in.readLine();
			if (option2.contentEquals("1")) {

				System.out.println("Course Management");
				System.out.println("Enter '1' to Create a New Course");
				System.out.println("Enter '2' to Delete a Course");
				System.out.println("Enter '3' to Edit a Course");
				System.out.println("Enter '4' to Display Information for a Given Course");
				System.out.println("Enter '5' to Register a Student");
				System.out.println("Enter '6' to Exit");
				String option3 = in.readLine();

				if (option3.contentEquals("1")) {
					admin.createCourse();
				} else if (option3.contentEquals("2")) {
					admin.deleteCourse();
				} else if (option3.contentEquals("3")) {
					admin.editCourse();
				} else if (option3.contentEquals("4")) {
					admin.displayACourse();
				} else if (option3.contentEquals("5")) {
					admin.registerStudent();
				} else {
					System.out.println("Thank you & come again! :D");
					logout = true;
					serialization();
		return "Logged in";
	}

	@Override
	public String addProfessor() {
		// TODO Auto-generated method stub
		return "professor Added";
	}

	@Override
	public String approveStudent() {
		// TODO Auto-generated method stub
		return "Approved Student";
	}

	@Override
	public String editCourse(Course courses) {
		if(course1!=null) {
		course1.updateCourse(courses);
		}
		return "CourseEdited";
	}

	@Override
	public String generateGradeCard() {
		// TODO Auto-generated method stub
		return "Grade Card generated";
	}

	

}
