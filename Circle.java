package testing;

public class Circle extends Shape{
	
	double radius ;
	
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	@Override
	double perimeter()
	{
		return 2*Math.PI*radius;
	}
	@Override
	double area()
	{
		return Math.pow(radius, 2)*Math.PI;
	}
	@Override
	void display()
	{
		System.out.println("This is Circle");
	}
}
