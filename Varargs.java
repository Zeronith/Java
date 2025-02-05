package testing;

public class Varargs {
	public static void main(String[] args)
	{
		/*  Varargs = allow method to accept a varying number of arguments
		 *  makes methods more flexible , no need to overload method
		 *  java will pack the arguments into an array
		 *  
		 *  ... (ellipsis)
		 */
		
		System.out.println(add(1, 2, 3, 4, 5, 6, 7));
		System.out.println(add(1, 2, 3));
		System.out.println(avg(1, 2, 3, 4, 5, 6, 7));
		System.out.println(avg(1, 2, 3));
	}
	
	static int add(int... numbers ) 
	{
		int sum = 0;
		for (int number : numbers )
		{
			sum+=number;
		}
		return sum;
	}
	static double avg(double ... numbers)
	{
		int sum = 0;
		for (double number : numbers)
		{
			sum += number;
		}
		return sum/numbers.length;
	}
}
