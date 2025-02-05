package testing;

// Class declaration is in User.java file

public class Overloaded_Constructor {

	public static void main(String[] args) {
		// Overloaded Constructor = Allow a class to have multiple constructors
		//							with different parameter lists.
		//							Enable objects to be initialized in various ways.

		User user0 = new User("Enguunbayar", "Enguunbayyr@gmail.com", 19);
		User user1 = new User("Enguunee", 19);
		User user2 = new User();
		
		
		System.out.println(user0.username);
		System.out.println(user0.email); 
		System.out.println(user0.age);
		
		
		System.out.println(user1.username);
		System.out.println(user1.email);
		System.out.println(user1.age);
		
		
		System.out.println(user2.username);
		System.out.println(user2.email);
		System.out.println(user2 .age);
		
	}

}
