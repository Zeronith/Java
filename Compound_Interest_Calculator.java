package testing;

import java.util.Scanner;
public class Compound_Interest_Calculator {

	public static void main(String[] args) {
		
		// Compound Interest Calculator
		Scanner scanner = new Scanner(System.in);
		
		double principal;
		double rate ;
		int timesCompounded;
		int years;
		double amount ;
		
		System.out.println("Enter the principle :");
		principal = scanner.nextDouble();
		
		System.out.println("Enter the rate :");
		rate = scanner.nextDouble() / 100 ;
		
		System.out.println("Enter times compounded :");
		timesCompounded = scanner.nextInt();
		
		System.out.println("Enter the year :");
		years = scanner.nextInt();
		
		amount = principal * java.lang.Math.pow(1 + rate / timesCompounded, timesCompounded*years);
		
		System.out.printf("The amount after %f year is $ %.2f", years, amount);
		
		
		
		
		
		scanner.close();
		
		
	}

}
