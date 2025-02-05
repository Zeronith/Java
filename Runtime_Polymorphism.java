package testing;

import java.util.Scanner;

public class Runtime_Polymorphism {

	public static void main(String[] args) {
		/* Runtime Polymorphism = When the method that gets executed is decided at
		 * 						  runtime based on the actual type of the object
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		Animall animal;
		System.out.println("What animal do you want to choose ? 1.Dog 2.Cat");
		int choice = scanner.nextInt();
		
		if(choice == 1)
		{
			animal = new Dogg();
			animal.speak();
		}
		else if(choice == 2)
		{
			animal = new Catt();
			animal.speak();
		}
		scanner.close();
	}

}
