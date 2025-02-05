package testing;

public class Composition {
	public static void main(String [] args)
	{
		/* Composition = Represents a "a part-of" relationship between objects.
		 * 				 For example , an Engine is "part of" a Car.
		 * 				 Allows complex object to be constructed from smaller objects
		 */
		
		
		
		Carrr car = new Carrr("Corvette", 2025, "V8");
		
		car.start();
	}
}
