package com.lt.bean;

public class Student {
	
	private int StudentId;
	private String StudentName;
	private Long StudentContactNo;
	private String StudentEmailId;
	private String StudentAddress;
	
	public Student(int studentId, String studentName, Long studentContactNo, String studentEmailId,
			String studentAddress) 
	{
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentContactNo = studentContactNo;
		StudentEmailId = studentEmailId;
		StudentAddress = studentAddress;
	}
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Long getStudentContactNo() {
		return StudentContactNo;
	}
	public void setStudentContactNo(Long studentContactNo) {
		StudentContactNo = studentContactNo;
	}
	public String getStudentEmailId() {
		return StudentEmailId;
	}
	public void setStudentEmailId(String studentEmailId) {
		StudentEmailId = studentEmailId;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentContactNo="
				+ StudentContactNo + ", StudentEmailId=" + StudentEmailId + ", StudentAddress=" + StudentAddress + "]";
	}
	
	
}
