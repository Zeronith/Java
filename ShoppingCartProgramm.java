package testing;

import java.util.Scanner;

public class ShoppingCartProgramm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String item; // Item can be one of following item : Pizza , Hamburger, Chips
		double price = 0 ;
		int quantity ;
		char currency = '$';
		double total;
		
		System.out.println("What item would you like to buy ?");
		item  = scanner.next();
		System.out.println("How many would you like to buy that item ?");
		quantity = scanner.nextInt();
		
		
		// Equals function is used for comparing strings 
		if (item.equals("Pizza"))
		{
			price = 5.5;
		}
		else if (item.equals("Hamburger"))
		{
			price = 3.3;
		}
		else if (item.equals("Chips"))
		{
			price = 2.2;
		}
		else 
		{
			System.out.println("That item is not on menu .");
			scanner.close(); // Exits program if the item isn't in menu
		}
		
		total = price * quantity ;
		
		System.out.println("You have bought " + item + " " + quantity + "/s");		
		System.out.println("Your total : " + total + currency );
		
		scanner.close();
		
	}

}
