package testing;

import java.util.Scanner;

public class Banking_Program {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Banking Program
		

		
		// Declare variable
		
		double balance = 0 ;
		boolean isRunning = true ;
		int choice;
		
		while(isRunning)
		{
			// Display menu
			
			System.out.println("Banking Program");
			System.out.println("1. Show Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("----------------");
			
			
			// Get and process users choice
			
			System.out.println("Please enter your choice :");
			choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1 -> showBalance(balance);				
			case 2 -> balance += deposit();
			case 3 -> balance -= withdraw(balance);
			case 4 -> isRunning = false;
			default -> System.out.println("Invalid choice");
			}
			
		}
		
		scanner.close();

	}
	// showBalance()
	
	static void showBalance(double balance)
	{
		System.out.printf("Your balance : %.2f$\n", balance );
	}
	
	// Deposit
	
	static double deposit()
	{
		double amount ;
		System.out.println("Please enter the amount you want to deposit :");
		amount = scanner.nextDouble();
		
		if(amount < 0 )
		{
			System.out.println("Amount can't be negative");
			return 0;
		}
		else
		{
			return amount;
		}
		
	}
	
	// Withdraw
	static double withdraw(double balance)
	{
		System.out.println("Enter amount to withdraw :");
		double amount = scanner.nextDouble();
		if(amount > balance )
		{
			System.out.println("Invalid value");
		}
		else if (amount <= 0)
		{
			System.out.println("Impossible value");
		}
		else
		{
			System.out.println("You have successfully withdrawn value");
		}
		return amount;

	}
	
	// Exit message

}
