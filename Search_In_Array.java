package testing;

import java.util.Scanner;

public class Search_In_Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many input do u want :");
		int size = scanner.nextInt(); // Entering size of array
		
		int [] A = new int[size];
		
		for (int i=0 ; i<size ; i++)
		{
			System.out.printf("Index : %d\n", i);
			A[i] = scanner.nextInt(); // Entering element of array
		}
		
		System.out.println("What is your target number");
		int searchNumber = scanner.nextInt(); // Entering searchNumber
		
		for(int a = 0 ; a < A.length ; a++)
		{
			if(A[a] == searchNumber)
			{
				System.out.println("Found your target number at :" + a);
				break;
			}
		}
		System.out.println("Your target number isnt in array");
		
		scanner.close();
		
	}

}
