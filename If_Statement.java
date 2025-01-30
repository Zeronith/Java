package testing;

import java.util.Scanner;

public class If_Statement {

	public static void main(String[] args) {
		
		// if statement = performs a block of code if it's condition is true
		
		String name ;
		int age ;
		boolean isStudent ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		name = scanner.nextLine();
		
		System.out.println("Enter your age :");
		age = scanner.nextInt();
		
		System.out.println("Are you student (True/False)");
		isStudent = scanner.nextBoolean();
		
		
		//Group 1
		if(name.isEmpty())
		{
			System.out.println("You didnt enter your name 😥");
		}
		else
		{
			System.out.println("Hello " + name);
		}
		
		
		
		//Group 2
		if (age >= 18 )
		{
			System.out.println("You are adult");
		}
		else if (age < 0)
		{
			System.out.println("You havent been born yet");
		}
		else if (age == 0)
		{
			System.out.println("You are a baby");
		}
		else 
		{
			System.out.println("You are child ");
		}
		
		
		//Group 3
		if(isStudent) 
		{
			System.out.println("You are a student ");
		}
		else
		{
			System.out.println("You are NOT student");
		}
		
		
		
		scanner.close();
	}

}
