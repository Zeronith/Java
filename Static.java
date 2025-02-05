package testing;

public class Static {
	public static void main(String [] args)
	{
		// Static = Makes a variable or method belong to the class
		//			rather than to any specific object .
		//			Commonly used for utility methods or shared resources
		
		Friend friend1 = new Friend("Enguunbayar");
		Friend friend2 = new Friend("Batzolboo");
		Friend friend3 = new Friend("Yondonzamts");
		
		System.out.println(Friend.numOfFriends); // Static Variable
		Friend.showFriend(); // Static Method
		
		Math.round(3.99); // We are actually calling static method in here
		// Because we are not creating object to call function
		// We are just calling round function by class name
	}
	
}
