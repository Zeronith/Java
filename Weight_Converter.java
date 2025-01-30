package testing;

import java.util.Scanner;

public class Weight_Converter {

	public static void main(String[] args) {
		
		// WEIGHT CONVERSION PROGRAM
	
		Scanner scanner = new Scanner(System.in);
		
		// Declare Variable
		
		double weight ;
		double newWeight ;
		int choice;
		
		// Welcome message 
		
		System.out.println("Weight Conversion Program");
		System.out.println("1 : Convert lbs to kgs");
		System.out.println("2 : Convert kgs to lbs");
		
		// Prompt for user choice 
		
		choice = scanner.nextInt();
		
		// Prompt for taking weight
		
		System.out.print("Please enter the weight :");
		weight = scanner.nextDouble();
		
		if(choice == 1) // Option 1 convert lbs to kgs
		{
			newWeight = weight * 0.45359237;
			System.out.printf("Your converted weight is %.3f kg", newWeight);
		}
		else if(choice == 2) // Option 2 convert kgs to lbs
		{
			newWeight = weight * 2.20462262;
			System.out.printf("Your convered weight is %.3f lbs", newWeight);
		}
		else // else print not a valid choice
		{
			System.out.println("There is not any choice like that");
		}
		
		scanner.close();
		
	}

}
