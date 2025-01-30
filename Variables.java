package testing;

public class Variables {

 	public static void main (String[] args)
 	{
 		/* Variable has 2 types :
 		 * Primitive = Simple value stored directly in memory (Stack)
 		 * Reference = memory address (stack) that points to the (Heap)
 		 * 
 		 * Primitive vs Reference
 		 * ----------------------
 		 * integer      String
 		 * double       Array
 		 * char			Object
 		 * boolean 
 		 */
 		
 		
 		// Integer
 		int age = 20;
 		int year = 2025;
 		int quantity = 1 ;
 		System.out.println("This year is " + year + ". I'm " + age + " year old");
 		
 		// Double
 		double gpa = 3.9;
 		double temperature = -23.3;
 		System.out.println("Hello my gpa is : "+ gpa + ". Outside is very cold . Its " + temperature );
 		
 		// Char
 		char grade = 'A';
 		System.out.println("My grade is : "+grade);
 		
 		// Boolean
 		boolean isStudent = true;
 		System.out.println(isStudent);
 		
 		// String 
 		String name = "Enguunbayar";
 		String food = "Tsuivan";
 		System.out.println("Hello "+name + "Your favourite food is "+food);
 	}
}
