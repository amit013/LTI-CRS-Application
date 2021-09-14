package com.lt.business;

import java.util.Scanner;
import com.lt.bean.Course;


public class CourseImplService implements CourseInterface {

	Course course[]= new Course[3];
	@Override
	public String createCourse() {
		course[0]=new Course();
		course[0].setCourseId("A001");
		course[0].setCourseName("Physics");
		
		course[1]=new Course();
		course[1].setCourseId("A002");
		course[1].setCourseName("Math");
		
		course[2]=new Course();
		course[2].setCourseId("A003");
		course[2].setCourseName("Chemistry");
		
		return "Course Added";
	}

	@Override
	public String listCourse() {
        for(Course  cs : course){
			
	   		System.out.println("details of Course--> " +cs.getCourseId() + "" +cs.getCourseName());
		}
		return "list course";
	}

	@Override
	public void updateCourse(Course courses) {
          //System.out.println(courses+"****");
          if(courses!=null) {
        for(Course cs1: course)
        {
        	 //System.out.println(cs+"&&&&");
            if(cs1.getCourseId()==courses.getCourseId())
            {
                cs1.setCourseName(courses.getCourseName());
            }
            //System.out.println(cs.getCourseId()+ "\n" + cs.getCourseName());

        }
          }
        //return "Course Updated";
	}

	@Override
	public String deleteCourse(String CourseId) {

        System.out.println("details deleted of course--> ");
        int index =0;
        Course course1[]=new Course[course.length-1];
        
        for(int i=0;i<course.length;i++) {
            if(course[i].getCourseId() == CourseId) {
                index = i;
            }
        }
        for (int i = 0; i < course.length-1; i++) {
            if(i<index)
                course1[i]=course[i];
            else
                course1[i]=course[i+1];
        }

        for(Course cs : course1){
            System.out.println("details of course--> " +cs.getCourseId() + " " +cs.getCourseName());
        }
        return "Course "+CourseId+ " Delete Successfully... ";

    }

}
