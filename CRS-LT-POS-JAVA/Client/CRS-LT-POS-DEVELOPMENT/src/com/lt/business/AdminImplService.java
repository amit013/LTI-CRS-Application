package com.lt.business;

import com.lt.bean.Course;

public class AdminImplService implements AdminInterface{

	CourseInterface course1 = new CourseImplService();
	Course course=new Course();
	@Override
	public String login() {
		// TODO Auto-generated method stub
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
