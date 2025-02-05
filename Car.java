package testing;


// This file is part of Object_Oriented_Programming.java
public class Car {
	
	String make = "Ford";
	String model = "Mustang";
	int year = 2025;
	double price = 50899.99;
	boolean isRunning = false;
	
	void start()
	{
		System.out.println("Starting the car");
		isRunning = true;
	}
	void stop()
	{
		System.out.println("Stopping the car");
		isRunning = false;
	}
}
