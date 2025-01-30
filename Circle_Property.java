package testing;

import java.util.Scanner;

public class Circle_Property {

	public static void main(String[] args) {
		// circumference = 2 * pi * radius;
		// area = pi * radius^2
		// volume = (4/3) * pi * radius^3
		
		double radius ;
		double circumference ;
		double area ;
		double volume ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter radius :");
		radius = scanner.nextDouble();
		
		circumference = java.lang.Math.PI*radius*2;
		area = java.lang.Math.PI*java.lang.Math.pow(radius, 2);
		volume = (4.0/3.0) * java.lang.Math.PI * java.lang.Math.pow(radius, 3);
		
		System.out.printf("Circumference %.1f:\n" , circumference);
		System.out.printf("Area : %.1f\n" , area);
		System.out.printf("Volume : %.1f\n" , volume);
		
		
		scanner.close();
	}

}
