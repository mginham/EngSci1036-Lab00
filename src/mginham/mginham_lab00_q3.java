package mginham;

import java.util.Scanner;

public class mginham_lab00_q3 {

	public static void main(String[] args) {
		// declaring variables
		double x1, y1, x2, y2, side1, side2, distance, perimeter;
		
		Scanner input = new Scanner(System.in);
		
		// user inputs values for coordinates
		System.out.println("Please input x1:");
			x1 = input.nextInt();
		System.out.println("Please input y1:");
			y1 = input.nextInt();
		System.out.println("Please input x2:");
			x2 = input.nextInt();
		System.out.println("Please input y2:");
			y2 = input.nextInt();
		
		// calculating the sides of the triangle required to perform the Pythagorean Theorem
		side1 = x2 - x1;
		side2 = y2 - y1;
		
		// calculating the hypotenuse using Pythagorean Theorem
		distance = Math.sqrt(side1*side1 + Math.pow(side2,2.0));
		
		// calculating the perimeter of the right triangle
		perimeter = side1 + side2 + distance;
		
		// relaying the calculation of the hypotenuse to the user
		System.out.println("The distance between points(" + Double.toString(x1) + "," + Double.toString(y1) + ") and (" +
				Double.toString(x2) + "," + Double.toString(y2) + ") is " + Double.toString(distance));

		// relaying the calculation of the perimeter to the user
		System.out.println("The perimeter of the right triangle with sides equal to " + Double.toString(side1) + 
				", " + Double.toString(side2) + " and " + Double.toString(distance) + " is " + Double.toString(perimeter));

	} // end main

} // end class
