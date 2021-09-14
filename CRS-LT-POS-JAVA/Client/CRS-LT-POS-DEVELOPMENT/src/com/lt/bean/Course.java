package com.lt.bean;

public class Course {

	private String CourseId;
	private String CourseName;
	
	public Course() {}
	
	public Course(String courseId, String courseName) {
		super();
		CourseId = courseId;
		CourseName = courseName;
	}
	
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
		return "Course [CourseId=" + CourseId + ", CourseName=" + CourseName + "]";
	}
	
	
}
