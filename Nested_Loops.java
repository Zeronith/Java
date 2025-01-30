package testing;

import java.util.Scanner;

public class Nested_Loops {

	public static void main(String[] args) {
		// nested loops = A loop inside another loop 
		// 				  Used often with matrices or DS&A
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the number of rows :");
		int rows = scanner.nextInt();
		
		System.out.println("Enter the number of columns :");
		int columns = scanner.nextInt();
		
		System.out.println("Enter the char to use :");
		char sign = scanner.next().charAt(0);
		
		
				
				
				
		for (int i = 0 ; i<rows ; i++)
		{
			for (int j = 0 ; j<columns ; j++)
			{
				System.out.print(sign);
			}
			System.out.print("\n");
		}
		
		
		scanner.close();
	}

}
