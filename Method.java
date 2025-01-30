package testing;

import java.util.Scanner;

public class Method {
	public static void main (String[] args)
	{
		// method = a block of reusable code that is executed when called()
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = scanner.nextLine();
		
		HappyBirthday(2, name);
		
		System.out.println(square(4));
		scanner.close();
		
	}
	static void HappyBirthday(int number, String name)
	{
		for(int i = 0 ; i < number ; i++)
		{
			System.out.printf("Happy Birthday to %s\n", name);
		}
	}
	static double square (double number)
	{
		return number *number;
	}
	static String GetFullName(String firstName , String lastName)
	{
		return firstName + " " + lastName ;
	}
	
	
}
