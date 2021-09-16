package com.lt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lt.bean.Course;

public class CourseDAO 
{
	List<Course> course = new ArrayList<Course>();
	public List<Course> getCourse() 
	{

		course.add( new Course("101", "physics"));
		course.add( new Course("102", "Chemistry"));
		course.add( new Course("103", "MAths"));
		course.add( new Course("104", "Biology"));
		course.add( new Course("105", "English"));
		course.add( new Course("106", "Social"));
		course.add( new Course("107", "Java"));
		course.add( new Course("108", "Python"));

		return course;
	}

	/*
	 * public String addCourse() { Scanner in = new Scanner(System.in);
	 * System.out.println("Enter course Id: "); String courseId = in.next();
	 * System.out.println("Enter course Name: "); String courseName = in.next();
	 * //course.add(new Course(courseId, courseName));
	 * 
	 * return "updated successfully"; }
	 */

}
