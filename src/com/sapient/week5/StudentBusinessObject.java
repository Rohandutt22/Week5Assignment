package com.sapient.week5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class StudentBusinessObject {
	
   public ArrayList<Student> a;
   public StudentBusinessObject()
   {
	   a= new ArrayList();
   }
   public void readStudent()
   {
	   Scanner sc=new Scanner(System.in);
	   Student s=new Student();
	   System.out.println("enter the student name");
	   s.setName(sc.nextLine());
	   System.out.println("enter the student id");
	   s.setId(sc.nextInt());
	   System.out.println("enter the student city");
	   s.setCity(sc.nextLine());
	   
   }
   public void displayStudent(Student s)
   {
	   System.out.println("Name : "+ s.getName()+" id : "+s.getId()+" city : "+s.getCity());
   }
   public void displayStudents(String city)
   {
	   for(Student s: a)
	   {
		   if(s.getCity()==city)
			   displayStudent(s);
	   }
   }
   public void displayStudentsCityWise() {
	   Collections.sort(a,new StudentComparator());
	   for(Student s: a)
	   {
		   
			   displayStudent(s);
	   }
   }
   public void displayStudentsNameWise() {
	   Collections.sort(a,new StudentComparatorNameWise());
	   for(Student s: a)
	   {
		   
			   displayStudent(s);
	   }
   }
   public void displayStudent(int id)
   {
	   try {
		   for(Student s: a)
		   {
			if(s.getId()==id)   
				   {
				displayStudent(s);
				   
				   }
		   }
		   throw( new Exception("element with given id not found"));
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	  
	   
   }
}
