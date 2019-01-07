package mginham;

import java.util.Scanner;

public class mginham_lab00_q1 {

	public static void main(String[] args) {
		// declaring variables
		int integer1 = 0;
		int integer2 = 0;
		int result;
		
		Scanner inputScanner = new Scanner(System.in);
		
		// promting the user for first integer value
		System.out.println("Enter an integer:");
		integer1 = inputScanner.nextInt();
		
		// prompting the user for second integer value
		System.out.println("Enter a second integer:");
		integer2 = inputScanner.nextInt();
		
		// calculating the result based on user input
		result = integer1 / integer2 * integer1 + integer2;
		
		// relaying the calculation to the user
		System.out.println("The result is: " + Integer.toString(result));
		
		inputScanner.close();

	} // end main

} // end class
