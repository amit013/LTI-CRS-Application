package com.lt.bean;

/**
 * 
 * @author G4-FullStackGroup
 * Grades Class
 * 
 */
public class Grades {

	private int StudentId;
	private String Grade;
	private String CourseId;
	
	/**
	 *Method to get StudentId
	 * @return studentID
	 */
	public int getStudentId() {
		return StudentId;
	}
	/**
	 *Method to set StudentId
	 */
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	
	/**
	 *Method to get grade
	 * @return grade
	 */
	public String getGrade() {
		return Grade;
	}
	
	/**
	 *Method to set grade
	 */
	public void setGrade(String grade) {
		Grade = grade;
	}
	
	/**
	 *Method to get courseId
	 * @return courseId
	 */
	public String getCourseId() {
		return CourseId;
	}
	
	/**
	 *Method to set courseId 
	 */
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	@Override
	public String toString() {
		return "Grades [StudentId=" + StudentId + ", Grade=" + Grade + ", CourseId=" + CourseId + "]";
	}
	
	
}
