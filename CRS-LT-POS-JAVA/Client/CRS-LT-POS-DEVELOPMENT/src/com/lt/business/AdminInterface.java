package com.lt.business;

import com.lt.bean.Course;

public interface AdminInterface {

	public String login();
	public String addProfessor();
	public String approveStudent();
	public String editCourse(Course courses);
	public String generateGradeCard();
}
