package testing;

public class Object_Oriented_Programming {

	// Class declaration is in Car.java file
	public static void main(String[] args) {
		
		// Object = an entity that holds data (attributes)
		// 			and can perform actions (methods)
		// 			It is a reference data type
	
		
		Car car = new Car();
		
		System.out.println(car.make);
		System.out.println(car.price);
		System.out.println(car.isRunning);
		System.out.println(car.model);
		
		
		car.start();
		
		System.out.println(car.isRunning);
		
		car.stop();
		
		System.out.println(car.isRunning);
		
	
		//Car car2; In java this one doesnt directly create object it creates reference
		//Car car2 = new Car(); This one is valid way to create object
	}
	
}
