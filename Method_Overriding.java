package testing;

public class Method_Overriding {
	public static void main (String [] args)
	{
		// Method Overriding = When a subclass provides its own 
		//					   implementation of a method that is already defined.
		//					   Allows for code reusability and give specific implementations
	
		Human human = new Human();
		Male_Human male_human = new Male_Human();
		Female_Human female_human = new Female_Human();
		Dwarf dwarf = new Dwarf();
		
		human.move();
		male_human.move();
		female_human.move();
		dwarf.move();
	}
}
