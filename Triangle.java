package testing;

public class Triangle extends Shape {
	
	double side1;
	double side2;
	double side3;

	Triangle(double side1 , double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	@Override
	double perimeter()
	{
		return side1+side2+side3;
	}
	@Override
	double area()
	{ 
		return 0; // Its annoying to write just use Heron's Formula
	}
	@Override
	void display()
	{
		System.out.println("This is triangle");
	}
}
