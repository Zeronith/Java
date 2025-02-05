package testing;

public class Car_of_Array_Of_Object {
	
	String model ;
	String color ;
	
	Car_of_Array_Of_Object(String model , String color)
	{
		this.model = model;
		this.color = color;
	}
	void drive ()
	{
		System.out.println("You drive the " + this.color + " " + this.model);
	}
}
