package com.lt.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.lt.bean.Course;
import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.client.CRSApplication;
import com.lt.client.StudentMenu;
import com.lt.dao.CourseDAO;
import com.lt.dao.StudentDao;
import com.lt.dao.UserDao;

public class StudentImplService implements StudentInterface{

	StudentDao sDao= new StudentDao();
	UserDao uDao= new UserDao();
	GradeCardInterface gradeCard = new GradeCardImplService();
	CourseDAO courseDAO= new CourseDAO();
	List<String> course = new ArrayList<String>();
	Course cc=new Course();
	List<Course> course1 = new ArrayList<Course>(); //emptylist
	
	@Override
	public boolean login() 
	{
		  System.out.println("Enter Username"); 
		  Scanner in = new Scanner(System.in);
		  String username = in.nextLine();
		  
		  System.out.println("Enter password"); 
		  Scanner inn = new Scanner(System.in);
		  String password = inn.nextLine();
		  
		  Iterator<User> iter = uDao.userList.iterator();
			while(iter.hasNext())
			{
			    User u = iter.next();
			    if((u.getUsername().equalsIgnoreCase(username)) && (u.getPassword().equalsIgnoreCase(password)))
			    {
			    	System.out.println("Login Successfull"+"\n"); 
			    	return true;
			    }
				else
				{
					System.out.println("username or password is wrong, please correct again"+"\n");
					return false;
				}
			}		  
			return false; 
		
	}

	@Override
	public String viewGradeCard() 
	{	
		gradeCard.viewGradeCard();
		return null;
	}

	@Override
	public String courseSelection() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Select the below options to complete course registeration "); 
		System.out.println("1. Add course"+" \n"+ "2. Drop course"+"\n"+"3. Exit");
		int option = in.nextInt();
		
		switch(option)
		{
			
			case 1:	System.out.println("Add course");
				    if(addCourse()==true)
					{
						System.out.println("Course added and registered sucessfully");
					}
				    break;
				    
			case 2: System.out.println("Drop course");
					if(dropCourse()==true)
					{
						System.out.println("Course has been deleted from your list");
					}
					break;
					
			case 3:  System.out.println("Exit");
					break;
					
		}
		return null;
	}

	@Override
	public String payFee() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean signup(String username,String password, long contact, String email, String address)
	{	
		System.out.println(sDao.studentList);
		Iterator<User> iter = uDao.userList.iterator();
		while(iter.hasNext())
		{
		    User u = iter.next();
		    if(u.getUsername().equalsIgnoreCase(username))
		    {
		    	System.out.println("Username already exist"+"\n"); 
		    	return false;
		    }
		    else
		    {
		    	sDao.signup(username, password, contact, email, address);
		    	uDao.signupUser(username, password,null);
		    	System.out.println("UserProfile is created, Please login"+ "\n");
		    	System.out.println(sDao.studentList);
		    	System.out.println(uDao.userList);
		    	return true;
		    }
		} 
		
		return true;
		
	}
	
	@Override
	public boolean addCourse() 
	{
		
		  
		  System.out.println("Please select the courseID fromt the below list");
		  
		  for (Course c : courseDAO.getCourse()) 
		  {
			  System.out.println(c.getCourseId()+" " + c.getCourseName());  //display the course list
		  }
		  for(int i=0; i<6; i++)
		  {
			  Scanner in = new Scanner(System.in);
			  System.out.println("Enter course Id: "); 
			  String courseId = in.next();
			  System.out.println("Enter course Name: "); 
			  String courseName = in.next();
			  course1.add(new Course(courseId,courseName));
		  }
		  
		  return true;
		
		
	}

	@Override
	public boolean dropCourse() 
	{
		System.out.println("Please select the courseID fromt the below list");
		  
		  for (Course c : course1) 
		  {
			  System.out.println(c.getCourseId()+" " + c.getCourseName());  //display the course list
		  }
		  
			  Scanner in = new Scanner(System.in);
			  System.out.println("Select the courseID to be deleted "); 
			  String courseId = in.next();
			  System.out.println("Enter course Name: "); 
			  String courseName = in.next();
			  
			  for (Course c : course1) 
			  {
				  if(c.getCourseId()==courseId || c.getCourseName()==courseName)
				  {
					  course1.remove(c);
					  System.out.println("Course has been removed");
					  System.out.println(course1);
				  }
				  else
					 continue;	  
				  
			  }
			  
		return true;
		
	}




}
