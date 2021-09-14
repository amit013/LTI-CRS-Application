package com.lt.bean;

public class Catlog {

	public String CourseId;
	public String CourseName;
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	@Override
	public String toString() {
		return "Catlog [CourseId=" + CourseId + ", CourseName=" + CourseName + "]";
	}
	
	
}
