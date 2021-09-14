package com.lt.bean;

import java.util.Date;

public class SemesterRegistration {

	private int SemesterNo;
	private Date SemesterStartdate;
	private Date SemesterEndDate;
	public int getSemesterNo() {
		return SemesterNo;
	}
	public void setSemesterNo(int semesterNo) {
		SemesterNo = semesterNo;
	}
	public Date getSemesterStartdate() {
		return SemesterStartdate;
	}
	public void setSemesterStartdate(Date semesterStartdate) {
		SemesterStartdate = semesterStartdate;
	}
	public Date getSemesterEndDate() {
		return SemesterEndDate;
	}
	public void setSemesterEndDate(Date semesterEndDate) {
		SemesterEndDate = semesterEndDate;
	}
	@Override
	public String toString() {
		return "SemesterRegistration [SemesterNo=" + SemesterNo + ", SemesterStartdate=" + SemesterStartdate
				+ ", SemesterEndDate=" + SemesterEndDate + "]";
	}
	
	
}
