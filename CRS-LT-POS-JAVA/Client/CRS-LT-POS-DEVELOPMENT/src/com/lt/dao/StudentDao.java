package com.lt.dao;

import java.util.ArrayList;
import java.util.List;

import com.lt.bean.Student;

public class StudentDao
{	
	public static List<Student> studentList= new ArrayList<Student>();
	static
	{
		studentList.add(new Student(101,"Aishwarya",9273299323l,"abc@gmail.com","Bangalore"));
		studentList.add(new Student(102,"Radhika",9283302933l,"dcf@gmail.com","Bangalore"));
		studentList.add(new Student(103,"Amit",282302933l,"dvhg@gmail.com","Mumbai"));
		studentList.add(new Student(104,"Swapna",90982389802l,"ccc@gmail.com","Chennai"));
		studentList.add(new Student(105,"Tushar",2309283284l,"tt@gmail.com","Bihar"));
		studentList.add(new Student(106,"Vishwa",238928335l,"vvv@gmail.com","Hyderabad"));
                  
	}
	public boolean signup(String username,String password, long contact, String email, String address)
	{
		int n=107;
		studentList.add(new Student(n,username,contact,email,address));
		n++;
		return true;
	}
}
