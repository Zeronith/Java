package testing;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		// Group 1
		
		String[] fruits = {"apple", "orange", "banana", "coconut"};
		
		int numOfFruits = fruits.length;
		
		System.out.printf("There are total %d element \n",numOfFruits);
		
		for (int i=0 ; i<fruits.length; i++)
		{
			System.out.printf("%d indexed value is %s\n", i, fruits[i]);
		}
		
		// Group 2
		
		// Enhanced For Loop
		
		for(String fruit : fruits ) // Similar to python
		{
			System.out.println(fruit);
		}
		
		
		// Group 3
		
		Arrays.sort(fruits); // Sorts alphabetically // Actually its ASCII
		
		for(String fruit : fruits) 
		{
			System.out.println(fruit);
		}
		
	}
}
