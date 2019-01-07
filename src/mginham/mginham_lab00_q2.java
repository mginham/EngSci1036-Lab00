package mginham;

public class mginham_lab00_q2 {

	public static void main(String[] args) {
		// declaring & initializing variables
		double x1 = 1, y1 = 2, x2 = 4, y2 = 7, side1 = 0, side2 = 0, distance = 0;
		
		// calculating the sides of the triangle required to perform the Pythagorean Theorem
		side1 = x2 - x1;
		side2 = y2 - y1;
		
		// calculating the hypotenuse using Pythagorean Theorem
		distance = Math.sqrt(side1*side1 + Math.pow(side2,2.0));
		
		// relaying the calculation to the user
		System.out.println("The distance between points(" + Double.toString(x1) + "," + Double.toString(y1) + ") and ("
				+ Double.toString(x2) + "," + Double.toString(y2) + ") is " + Double.toString(distance));

	} // end main

} // end class
