package testing;

public class Polymorphism {
	public static void main(String [] args)
	{
		/* Polymorphism = "POLY" = "MANY"
		 * 				  "MORPH" = "SHAPE"	or "FORM"
		 *                
		 *                Object can identify as other object.
		 * 				  Object can be treated as object of a common superclass
		 */
		
		Carr car = new Carr();
		Bike bike = new Bike();
		Boat boat = new Boat();
		
		Vehicle [] vehicles = new Vehicle[3]; // Creating SUPER class array to contain SUB class object
		
		vehicles[0] = car;
		vehicles[1] = bike;
		vehicles[2] = boat;
		
		for(Vehicle vehicle : vehicles)
		{
			vehicle.go();
		}
		
	}
}
