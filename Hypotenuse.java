package testing;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		// Hypotenuse c = sqrt(a^2 + b^2)
		Scanner scanner = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("Enter a :");
		a = scanner.nextInt();
		
		System.out.println("Enter b :");
		b = scanner.nextInt();
		
		c = java.lang.Math.sqrt(java.lang.Math.pow(a, 2)+java.lang.Math.pow(b, 2));
		System.out.println("Hypotenuse : " + c);
				
				
		scanner.close();
	}

}
