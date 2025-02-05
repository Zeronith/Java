package testing;

import java.util.Scanner;

public class Input_In_Array {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter how many string u want to input :");
		int size = scanner.nextInt();
		
		String [] foods = new String[size];
		
		for(int i=0 ; i<size ; i++)
		{
			System.out.println("Index is "+ i);
			foods[i]=scanner.next();
		}
	
		for(String food : foods)
		{
			System.out.println(food);
		}
		
		scanner.close();
	
	}
	
		
}
