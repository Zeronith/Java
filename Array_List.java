package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_List {

	public static void main(String[] args) {
		// ArrayList = A resizable array that stores objects (autoboxing).
		// 			   Arrays are fixed in size, but ArrayLists can change
		
		
		// Group 1
		/*
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Lebron James");
		System.out.println(fruits);
		
		fruits.remove(0);
		System.out.println(fruits);
		
		fruits.set(0, "Pineapple");
		System.out.println(fruits);
		
		System.out.println(fruits.size());
		Collections.sort(fruits);
		
		System.out.println(fruits);
		
		
		for(String fruit : fruits )
		{
			System.out.println(fruit);
		}
		*/
		
		// Exercise 1
		// Create array and accept user input
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.nextLine(); // Cleaning the input buffer
		
		ArrayList <String> foods = new ArrayList<String>(); 
		for(int i=0 ; i<number ; i++)
		{
			String food = scanner.nextLine();
			foods.add(food);
			
			// or we can just do it like this
			// foods.add(scanner.nextLine());
		}
		System.out.println(foods);
		scanner.close();
	}

}
