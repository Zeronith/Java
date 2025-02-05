package testing;

import java.util.Scanner;

import java.util.Random;
public class Rock_Paper_Scissors {

	public static void main(String[] args) {
		// ROCK PAPER SCISSORS
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int player_answer;
		int comp_answer;
		boolean PlayAgain = true ;
		
		// Rock Paper Scissors array[]
		
		String [] answers = {"Rock","Paper","Scissor"};
		
		while(PlayAgain)
		{
			// Computer choice
			
			comp_answer = random.nextInt(1, 4);
			
			// Welcome Message 
			
			System.out.println("WELCOME TO ROCK PAPER SCISSOR :");
			
			// Player choice
			
			System.out.println("1. ROCK 2. PAPER 3. SCISSORS");
			player_answer = scanner.nextInt();
			
			// Checking answers
			
			if(comp_answer == 1 && player_answer == 2  || comp_answer == 2 && player_answer == 3 || comp_answer == 3 && player_answer == 1 )
			{
				System.out.println("Player Won");
				System.out.println("Your answer : " + answers[player_answer-1] );
				System.out.println("Computer answer : " + answers[comp_answer-1]);
			}
			else if(comp_answer == player_answer)
			{
				System.out.println("Tie");
				System.out.println("Your answer : " + answers[player_answer-1] );
				System.out.println("Computer answer : " + answers[comp_answer-1]);
			}
			else
			{
				System.out.println("Computer Won");
				System.out.println("Your answer : " + answers[player_answer-1] );
				System.out.println("Computer answer : " + answers[comp_answer-1]);
			}
			
			// Ask wanna play again or not
			System.out.println("Do you want to play again ? ");
			System.out.println("True or False ");
			PlayAgain = scanner.nextBoolean();
			
		}
		
		scanner.close();
	}

}
