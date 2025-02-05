package testing;

public abstract class Shape {

	abstract double perimeter(); // Abstract
	abstract double area() ;// Abstract
	
	void display() // Concrete 
	{
		System.out.println("This is a shape");
	}
}
