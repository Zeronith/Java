package testing;

public class Interface {
	public static void main(String [] args)
	{
		/*	Interface = A blueprint for a class that specifies a set of abstract methods 
		 * 				that implemented classes MUST define .
		 * 				Supports multiple inheritance-like behaviour.
		 * 				(Is it possible to inheritate from multiple class)
		 */
	
		Rabbit rabbit = new Rabbit();
		
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		
		hawk.hunt();
	
		
		Fish fish = new Fish();
		
		fish.flee();
		fish.hunt();
	}
	
}
