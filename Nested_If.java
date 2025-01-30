package testing;

public class Nested_If {

	public static void main(String[] args) { 
		boolean isStudent= true;
		boolean isSenior=false;
		double price = 9.99;
		if(isStudent) 
		{
			if (isSenior)
			{
				System.out.println("You get student and senior discount 30 %");
				price*=0.7; 
			}
			else 
			{
				System.out.println("You get student discount 10%");
				price*=0.9;
			}
			
		}
		else 
		{
			if(isSenior)
			{
				System.out.println("You get senior discount 20%");
				price*=0.8;
			}
			else
			{
				System.out.println("You are not student and senior ");
				price*=1;
			}
			
		}
		System.out.printf("The price of student is %.2f", price);
	}
}
