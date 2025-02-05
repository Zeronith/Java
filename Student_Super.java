package testing;

public class Student_Super extends Person{

	double gpa;
	
	Student_Super(String first, String last, double gpa)
	{
		super(first, last); // calls parent class constructor
		this.gpa = gpa;
	}
	void show_gpa ()
	{
		System.out.println("GPA : " + gpa);
		
	}
}
