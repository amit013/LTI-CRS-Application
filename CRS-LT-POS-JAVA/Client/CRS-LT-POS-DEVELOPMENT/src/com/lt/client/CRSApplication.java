package com.lt.client;

import com.lt.bean.Course;
import com.lt.bean.Student;
import com.lt.business.AdminImplService;
import com.lt.business.AdminInterface;
import com.lt.business.CourseImplService;
import com.lt.business.CourseInterface;

public class CRSApplication {
	
	public static void main(String[] args) {
		
		Course course1= new Course();
		
		CourseInterface course=new CourseImplService();
		System.out.println(course.createCourse());
		System.out.println(course.listCourse());
		/*System.out.println(course.deleteCourse("A002"));
		System.out.println(course.updateCourse(new Course("A003","Biology")));
		System.out.println(course.listCourse());
		*/
		AdminInterface admin= new AdminImplService();
		admin.editCourse(new Course("A003","Biology"));
		System.out.println(course.listCourse());
	}

}
