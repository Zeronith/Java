package testing;

import java.util.Random;

import java.util.Scanner;

public class Number_Guessing_Game {
	public static void main (String[] args)
	{
		// NUMBER GUESSING GAME
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int guess;
		int attempts = 0;
		int target = random.nextInt(0, 101);
		
		do {
			System.out.println("Please enter your guess");
			
			guess = scanner.nextInt();
			
			if(guess > target )
			{
				System.out.println("Damnn ... That's pretty high");
			}
			else if(guess < target)
			{
				System.out.println("Damn ...  That's pretty low");
			}
			attempts ++;
			
		}while(target != guess);
		
		System.out.println("Congrulations , You guessed the number");
		System.out.printf("it took %d attemps to guess the number", attempts);
		scanner.close();
		
	}
}
