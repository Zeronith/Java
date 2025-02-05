package testing;

public class Rectangle extends Shape{

	double width ;
	double height ;
	
	Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	double perimeter()
	{
		return (width+height)*2;
	}
	@Override
	double area()
	{
		return width*height;
	}
	void display()
	{
		System.out.println("This is rectangle");
	}
}
