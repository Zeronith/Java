package testing;

import java.util.Scanner;

public class For {
	public static void main (String[] args) throws InterruptedException
	{
		// for loop = execute some code a CERTAIN amount of times
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many seconds to countdown from :");
		int start = scanner.nextInt();
		
		for (int i = start ; i > 0 ; i--)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		
		scanner.close();
		
	}
}
