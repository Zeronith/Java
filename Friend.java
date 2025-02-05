package testing;

public class Friend {
	
	String name;
	static int numOfFriends = 0;
	
	Friend(String name)
	{
		this.name = name;
		numOfFriends++;
	}

	static void showFriend()
	{
		System.out.println("Total friends u have : " + numOfFriends);
	}
}

