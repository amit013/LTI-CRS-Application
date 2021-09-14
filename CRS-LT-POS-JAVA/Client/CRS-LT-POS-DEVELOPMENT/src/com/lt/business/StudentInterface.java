package com.lt.business;

import java.util.List;

public interface StudentInterface {

	public void studentMenu();
	public String addCourse(List<String> course);
	public String dropCourse();
	public String viewGradeCard();
	public void courseRegistration();
	public String payFee();

}
