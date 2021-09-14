package com.lt.business;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lt.dao.CourseDAO;

//implementation of Student service
public class StudentImplService implements StudentInterface{

	GradeCardInterface gradeCard = new GradeCardImplService();
	CourseDAO courseDAO= new CourseDAO();
	List<String> course = new ArrayList<String>();

	@Override
	public void studentMenu() {
		System.out.println("1. Add Course"+"\n"+"2. Drop Course"+"\n"+"3. View GradeCard"+"\n"+"4. CourseRegistration"+"\n"+"5. PayFee"+"\n"+"6. Exit");
		Scanner in = new Scanner(System.in);
		int selection = in.nextInt();

		StudentInterface user = new StudentImplService();


		switch(selection)
		{
		case 1: System.out.println("Add Course:-");
		user.addCourse(course);                 
		break;

		case 2: System.out.println("Drop Course:-");
		user.dropCourse();
		break;

		case 3: System.out.println("View GradeCard:-");
		gradeCard.viewGradeCard();
		break;

		case 4: System.out.println("CourseRegistration:-");
		user.courseRegistration();
		break;

		case 5: System.out.println("PayFee:-");
		user.payFee();
		break;

		case 6: System.out.println("Exit");
		break;

		}
		
	}

	@Override
	public String viewGradeCard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void courseRegistration() {


		courseDAO.addCourse();
		//return "Courses Registered Successfully";
	}

	@Override
	public String payFee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addCourse(List<String> courses) {

		for (int i = 0; i < courses.size(); ++i) {
			course.add(courses.get(i));
		}

		return null;
	}

	@Override
	public String dropCourse() {
		// TODO Auto-generated method stub
		return null;
	}



}
