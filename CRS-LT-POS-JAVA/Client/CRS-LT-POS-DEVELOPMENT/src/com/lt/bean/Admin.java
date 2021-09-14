package com.lt.bean;

public class Admin {

	private int AdminId;
	private String AdminName;
	private Long ContactNo;
	private String EmailId;
	
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public Long getContactNo() {
		return ContactNo;
	}
	public void setContactNo(Long contactNo) {
		ContactNo = contactNo;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", AdminName=" + AdminName + ", ContactNo=" + ContactNo + ", EmailId="
				+ EmailId + "]";
	}
	
	
	

}
