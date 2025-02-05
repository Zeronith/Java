package testing;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// Exception = An event that interrupts the normal flow of a program
		// 			   (Dividing by zero, file not found , mismatch input type)
		//			   Surround any dangerous code with try{} block
		//try{}, catch{} , finally{} // finally is optional
		
		
		//System.out.println(1/0); // Error : java.lang.ArithmeticException:
		
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter a number : ");
			int number = scanner.nextInt();
			System.out.println(number);
		}
		catch(java.util.InputMismatchException e) // Possible error
		{
			System.out.println("I said enter number u idiot");
		}
		catch(java.lang.ArithmeticException e) // Possible error
		{
			System.out.println("You can't divide by zero"); // Action that replaces programm interuption
		}
		catch(java.lang.Exception e) // Takes all exception error , like " else " in if-else
		{
			System.out.println("You did something wrong");
		}
		finally
		{
			scanner.close();
			System.out.println("This one always executes regardless there is exception or not");
		}
	}
}
