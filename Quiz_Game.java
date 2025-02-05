package testing;

import java.util.Scanner;

public class Quiz_Game {

	public static void main(String[] args) {
		// Quiz Game
	
		// QUESTIONS array []
		
		String [] questions = {"What is the main functions of a router ?",
							  "Which part of computer is considered the brain ?",
							  "What year was Facebook launched ?",
							  "Who is knowns as father of computers ?",
							  "What was the first programming languege ?"
							  };
		// OPTIONS array [][]
		
		String [][] options = {{"1. Storing files", "2. Encrypting Data", "3. Directing internet traffic", "4. Managing passwords"},
							   {"1. CPU",           "2. HARD DRIVE",      "3. RAM",                        "4. GPU"},
							   {"1. 2000",          "2. 2004",            "3. 2006",                       "4. 2008"},
							   {"1. Steve Jobs",    "2. Me",              "3. Alan Turing",                "4. Charles Babbage"},
							   {"1. Cobol" ,        "2. C" ,              "3. Fortran",                    "4. Assembly"}};
		
		// CORRECT array[]

		int [] answers = {3, 1, 2, 4, 3};
		
		// DECLARE VARIABLE
		
		int score = 0;
		int guess;
		
		Scanner scanner = new Scanner(System.in);
		
		// WELCOME MESSAGE
		
		System.out.println("--------------------------------");
		System.out.println("WELCOME TO THE JAVA QUIZ GAME !");
		System.out.println("--------------------------------");
		
		
		
		for(int i=0 ; i<answers.length; i++)
		{
			// QUESTION 
			
			System.out.printf("QUESTION %d\n", i+1);
			System.out.println(questions[i]);
			
			// OPTIONS
			
			System.out.printf("ANSWERS : \n");
			for(String option : options[i])
			{
				System.out.println(option);
			}
			
			//	GET GUESS FROM USER
			
			System.out.print("Please enter your guess : ");
			guess = scanner.nextInt();
			
			//	CHECK OUR GUESS
			
			if(guess == answers[i])
			{
				System.out.println("************************");
				System.out.println("Your answer is correct !");
				System.out.println("************************");
				score++;
			}
			else
			{
				System.out.println("**************************");
				System.out.println("Your answer is incorrect !");
				System.out.println("**************************");
			}
						
		}
		
		System.out.printf("Your final score is %d out of %d" , score, answers.length);
		
		
		
		
		scanner.close();
	}

}
