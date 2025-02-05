package testing;

import java.util.Scanner;

import java.util.Random;

public class Slot_Machine {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		double balance = 100.0;
		double bet = 0;
		boolean Play = true ;
		String [] result = {};
		result = new String[5];
		
		// Welcome message
		
		System.out.println("WELCOME TO JAVA SLOTS");
		
		// Symbols [] array
		
		String [] emojis = {"🌑", "🌓", "🌕", "🌛", "🌜"};
		
		// Current Balance and Bet
		
		while(Play)
		{
			System.out.println("Your current balance  :" + balance );
			System.out.println("Symbols :");
			for (String emoji : emojis)
			{
				System.out.print(emoji + " ");
			}
			System.out.println();
			System.out.println("Place your bet amount :");
			bet = scanner.nextDouble();
			if(balance < bet && balance != 0)
			{
				System.out.println("You can't place bet that higher than your balance !");
				return ;
			}
			
			// Slot
			
			for (int i = 0 ; i<emojis.length ; i++)
			{
				result[i] = emojis[random.nextInt(0, 5)];
			}
			
			System.out.println("****************");
			for(String emoji : result)
			{
				
				System.out.print(emoji + " ");
				
			}
			System.out.println();
			System.out.println("****************");
			
			int maximum_duplicate = 0;
			int duplicate = 0;
			for(int i = 0; i < result.length; i++)
			{
				for(int j = i+1 ; j < result.length; j++)
				{
					if(result[i].equals(result[j])) ;
					{
						duplicate++;
					}
				}
				if(maximum_duplicate < duplicate)
				{
					maximum_duplicate = duplicate;
				}
			}
			
			// Result
			
			if(maximum_duplicate >= 2)
			{
				balance += bet*2;
				System.out.println("You have won and doubled your bet " + bet*2 + ", Your balance : " + balance);
			}
			else
			{
				balance -= bet;
				System.out.println("You have lost " + bet + ", Your balance : " + balance);
			}
			
			// Play again ?
			System.out.println("Wanna play again ? (True or False)");
			Play = scanner.nextBoolean();
			if(Play == false)
			{
				scanner.close();
			}
			
		}
		scanner.close();
		
		
	}
}
