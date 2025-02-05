package testing;

public class Wrapper_Class {
	public static void main(String[] args)
	{
		/* Wrapper classes = Allow primitive values (int , char, double, boolean)
		 * 					 to be used as object. 
		 * 				     Generally , don't wrap primitives unless you need object.
		 * 					 Allows use of Collections Framework and static Utility Methods
		 */
		
		// int a = 153   <==>  Integer a = new Integer(153)  -> OLD WAY 
		// int a = 153   <==>  Integer a = 153 -> MODERN WAY 
		
		
		// AUTOBOXING -> Primitive to Object
		Integer a = 123;
		Double b = 3.14;
		Character c = '$';
		Boolean d  = true;
		String e = "Pizza";
		
		// Converting primitives to string
		String a1 = Integer.toString(123);
		String b1 = Double.toString(3.14);
		String c1 = Character.toString('@');
		String d1 = Boolean.toString(true);
		
		System.out.println("Answer : " + a1+b1+c1+d1);
		
		
		// Converting string to primitives
		int a2 = Integer.parseInt("123");
		double b2 = Double.parseDouble("3.14");
		char c2 = "Pizza".charAt(0);
		boolean d2 = Boolean.parseBoolean("true");
		
		System.out.println("Answer : " + a2 + ", " + b2 + ", " + c2 +", " + d2);
		
		
		// Few usefull method
		
		char letter = 'b';
		System.out.println(Character.isAlphabetic(letter));
		System.out.println(Character.isUpperCase(letter));
		
		
		// UNBOXING -> Object to Primitive
		int x = a;
		double y = b;
		char z = c;
	}
	
}
