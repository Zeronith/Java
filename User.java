package testing;

//This file is part of Overloaded_Constructor.java

public class User {
	String username;
	String email;
	int age;
	
	User(String username , String email , int age)
	{
		this.username = username;
		this.email = email;
		this.age = age;
	}
	User(String username, int age)
	{
		this.username=username;
		this.email="Not Provided";
		this.age = age;
	}
	User()
	{
		this.username="Not Provided";
		this.email="Not Provided";
		this.age = 0;
	}
}
