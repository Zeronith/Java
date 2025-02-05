package testing;

//This file is part of Constructor.java

public class Student {
	
	String name;
	int age;
	double gpa;
	boolean isEnrolled;
	
	Student(String name , int age, double gpa)
	{
		
		// " this " keyword refers object we are currently working with 
		
		this.name = name; 
		this.age = age;
		this.gpa = gpa;
		this.isEnrolled = true;
	}
	
	void study ()
	{
		System.out.println(this.name + " is studying ");
	}
}
