package com.lt.bean;
/**
 * 
 * @author G4-FullStackGroup
 * Student Class
 * 
 */

public class Student {

	private int StudentId;
	private String StudentName;
	private String StudentEmailId;
	private String StudentAddress;
	private String Branch;
	private Long StudentContactNo;
	private int IsApproved;
	

	/**
	 *Default Constructor
	 * @return values
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 *Parameterized Constructor
	 * @return values
	 */
	public Student(int studentId, String studentName, String studentEmailId, String studentAddress, String branch,
			Long studentContactNo) {

		StudentId = studentId;
		StudentName = studentName;
		StudentEmailId = studentEmailId;
		StudentAddress = studentAddress;
		Branch = branch;
		StudentContactNo = studentContactNo;
	}

	
	/**
	 *Parameterized Constructor
	 * @return values
	 */
	public Student(int studentId, String studentName) {
		super();
		StudentId = studentId;
		StudentName = studentName;
	}


	/**
	 * Method to get StudentId
	 * @return StudentId
	 */
	public int getStudentId() {
		return StudentId;
	}
	/**
	 * Method to set StudentId
	 * @param StudentId
	 */
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	/**
	 * Method to get StudentName
	 * @return StudentName
	 */
	public String getStudentName() {
		return StudentName;
	}
	/**
	 * Method to set StudentName
	 * @param StudentName
	 */
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	/**
	 * Method to get StudentContactNo
	 * @return StudentContactNo
	 */
	public Long getStudentContactNo() {
		return StudentContactNo;
	}
	/**
	 * Method to set StudentContactNo
	 * @param StudentContactNo
	 */
	public void setStudentContactNo(Long studentContactNo) {
		StudentContactNo = studentContactNo;
	}
	/**
	 * Method to get StudentEmailId
	 * @return StudentEmailId
	 */
	public String getStudentEmailId() {
		return StudentEmailId;
	}
	/**
	 * Method to set StudentEmailId
	 * @param StudentEmailId
	 */
	public void setStudentEmailId(String studentEmailId) {
		StudentEmailId = studentEmailId;
	}
	/**
	 * Method to get StudentAddress
	 * @return StudentAddress
	 */
	public String getStudentAddress() {
		return StudentAddress;
	}
	/**
	 * Method to set StudentAddress
	 * @param StudentAddress
	 */
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	/**
	 * Method to get Branch
	 * @return Branch
	 */
	public String getBranch() {
		return Branch;
	}
	/**
	 * Method to set Branch
	 * @param Branch
	 */
	public void setBranch(String branch) {
		Branch = branch;
	}
	/**
	 * Method to get IsApproved
	 * @return IsApproved
	 */
	public int getIsApproved() {
		return IsApproved;
	}
	/**
	 * Method to set IsApproved
	 * @param IsApproved
	 */
	public void setIsApproved(int isApproved) {
		IsApproved = isApproved;
	}

	
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentContactNo="
				+ StudentContactNo + ", StudentEmailId=" + StudentEmailId + ", StudentAddress=" + StudentAddress + "]";
	}


}
