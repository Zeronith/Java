package testing;

public class Dwarf extends Human{
	
	@Override
	void move() // If u have same named method in child class . u will use that first 
	{
		System.out.println("Dwarf is running");
	}

}
