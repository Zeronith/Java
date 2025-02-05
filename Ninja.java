package testing;

// This file belongs to Tostring.java

public class Ninja {
	String name;
	boolean hasSharingan ;
	int age;
	
	Ninja(String name , boolean hasSharingan, int age)
	{
		this.name = name;
		this.hasSharingan = hasSharingan;
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return this.age + " " + this.name + " " + this.hasSharingan;
	}
}
