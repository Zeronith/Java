package testing;

import java.util.Scanner;

public class Mad_Libs_Game {

	public static void main(String[] args) {
		
		// MAD LIBS GAME
		
		Scanner scanner = new Scanner(System.in);
		
		String adjective1;
		String noun1;
		String adjective2;
		String verb1;
		String adjective3;
		
		System.out.println("Enter adjective (Description) :");
		adjective1 = scanner.nextLine();
		System.out.println("Enter noun (animal or person)");
		noun1 = scanner.nextLine();
		System.out.println("Enter adjective (Description)");
		adjective2 = scanner.nextLine();
		System.out.println("Enter verb ending with -ing (Action)");
		verb1 = scanner.nextLine();
		System.out.println("Enter adjective (Description)");
		adjective3 = scanner.nextLine();
		
		
		System.out.println("\nToday i went to a " + adjective1 + " zoo. ");
		System.out.println("In a exibit , I saw a "+ noun1 + ".");
		System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
		System.out.println("I was "+ adjective3 + "!");
		
		scanner.close();
	}

}
