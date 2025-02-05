package testing;

public class Array_Of_Object {
	public static void main (String [] args)
	{
		// GROUP 1
	
		
		/*

		Car_of_Array_Of_Object Car1 = new Car_of_Array_Of_Object("Mustang", "Red");
		Car_of_Array_Of_Object Car2 = new Car_of_Array_Of_Object("Corvette", "Yellow");
		Car_of_Array_Of_Object Car3 = new Car_of_Array_Of_Object("Charger", "Blue");
		
		Car_of_Array_Of_Object [] cars = new Car_of_Array_Of_Object[3];
		
		cars[0] = Car1;
		cars[1] = Car2;
		cars[2] = Car3;
		
	 	for(Car_of_Array_Of_Object car : cars)
	 	{
	 		car.drive();
	 	}
	 	
	 	*/
		
		
		
		// Constructing object without giving unique identifier (Car1, Car2) etc called anonymous object
		
		Car_of_Array_Of_Object [] cars = { new Car_of_Array_Of_Object("Mustang", "Red"),
										   new Car_of_Array_Of_Object("Corvette", "Blue"),
										   new Car_of_Array_Of_Object("Charger", "Yellow")};
		
		for(Car_of_Array_Of_Object car : cars)
		{
			car.color = "Black";
		}
		
		for(Car_of_Array_Of_Object car : cars)
		{
			car.drive();
		}
		
	}
}
