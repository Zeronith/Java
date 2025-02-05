package testing;

public class Abstraction {
	public static void main(String [] args)
	{
		/* Abstraction = Used to define abstract classes and methods.
		 * 				 Abstraction is the process of hiding implementation details
		 * 			     and showing only the essential features ;
		 * 				 Abstract classes CAN'T be instantiated directly
		 * 				 Can contain 'abstract' methods (which must be implemented by children)
		 * 				 Can contain 'concrete' methods (which are inherited)
		 */
		
		Circle circle = new Circle(5.0);
		Triangle triangle = new Triangle(1, 2, 3);
		Rectangle rectangle = new Rectangle(5 , 4);
		
		circle.display();
		triangle.display();
		rectangle.display();
		
		System.out.println(circle.area());
	}
}