package testing;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// THIS IS EXERCISE . CALCULATE AREA OF RECTANGLE
		
		double width = 0;
		double height = 0;
		double area = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the width of rectangle");
		width = scanner.nextDouble();
		
		System.out.println("Enter the height of rectangle");
		height = scanner.nextDouble();
		
		area = width * height;
		
		System.out.println("Total area of rectangle is : " + area + "cm^2");
		
		scanner.close();

	}

}
