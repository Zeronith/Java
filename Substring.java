package testing;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// Substring() = A method used to extract a portion of string
		//              string.substring(start, end)
			
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter your email : ");
		String email = scanner.nextLine();
		
		if(!email.contains("@") || email.contains(" "))
		{
			System.out.println("That's not even email bro");
			return ; 
		}
		
		String username = email.substring(0, email.indexOf("@"));
		String domain = email.substring(email.indexOf("@")+1);	
		
		System.out.println(username);
		System.out.println(domain);
		
		
		scanner.close();
	}
}
