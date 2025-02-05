package testing;

public class Carrr {
	String model;
	int year;
	Engine engine;
	
	Carrr(String model , int year, String type)
	{
		this.model = model;
		this.year = year;
		this.engine = new Engine (type);
	}
	void start()
	{
		this.engine.start();
		System.out.println("The " + this.model + " is running");
	}
}
