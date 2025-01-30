package testing;

import java.util.Scanner; // importing input class

public class User_Input {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = scanner.nextLine(); 		// reads string 

		System.out.println("Enter your age : ");
		int age = scanner.nextInt();			// reads integer
		
		System.out.println("Enter your gpa : ");
		double gpa = scanner.nextDouble(); 		// reads double
		
		System.out.println("Are you student ? (true/false) :"); // reads boolean
		boolean isStudent = scanner.nextBoolean();
		
		System.out.println("Hello "+ name);
		System.out.println("Your age is " + age);
		System.out.println("Your gpa is " + gpa);
		
		if(isStudent) 
		{
			System.out.println("You are successfully enrolled university ");
		}
		else 
		{
			System.out.println("You are not even student bro");
		}
		
		// COMMON ISSUE 
		
		System.out.println("What is your age ?");
		int nas = scanner.nextInt();
		scanner.nextLine(); // Our solution 
		
		System.out.println("What is your name :");
		String ner = scanner.nextLine();
		
		System.out.println("You are "+ nas + " years old");
		System.out.println("Your name is "+  ner);
		
		// Following issue is caused by \n . When we enter our age and hit the 
		// enter button \n goes into input buffer and it considered as string 
		// which we are inputting in ner .
		// to solve this we need to make sure \n doesn't go into input buffer
		// to do that just take that as input but doesn't assign it into anything
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close(); 
	}
}
