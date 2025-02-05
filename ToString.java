package testing;

public class ToString {
	public static void main(String [] args)
	{
		/*ToString = Method inheritates from Object class.
		 *  		 Used to return a string representation of an object.
		 * 			 By default , it returns a hash code as unique identifier.
		 *			 It can be overridden to provide meaningful detail
		 */			 
		Ninja Itachi = new Ninja("Itachi", true, 15);
		
		// We have overridden toString method
		System.out.println(Itachi);
		
		
	}
}
