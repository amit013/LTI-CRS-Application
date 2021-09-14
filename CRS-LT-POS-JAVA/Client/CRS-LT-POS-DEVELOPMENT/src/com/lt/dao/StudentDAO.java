package com.lt.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lt.bean.Student;

public class StudentDAO {


	List<Student> getStudent() {
		List<Student> student = new ArrayList<Student>();

		student.add(new Student(101,"Aishwarya",9273299323L,"abc@gmail.com","Bangalore"));
		student.add(new Student(102,"Radhika",9283302933L,"dcf@gmail.com","Bangalore"));
		student.add(new Student(103,"Amit",282302933L,"dvhg@gmail.com","Mumbai"));
		student.add(new Student(104,"Swapna",90982389802L,"ccc@gmail.com","Chennai"));
		student.add(new Student(105,"Tushar",2309283284L,"tt@gmail.com","Bihar"));
		student.add(new Student(106,"Vishwa",238928335L,"vvv@gmail.com","Hyderabad"));

		return student;
	}

	/*public void signup(Student s){
			student.add(s);
		}*/
}
