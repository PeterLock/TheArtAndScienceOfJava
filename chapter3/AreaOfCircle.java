/* File: AreaOfCircle
 * ------------------
 * This program calculates the area of a circle after the user inputs
 * the radius.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/25
 * 
 * ------FORMULA REMINDER------
 * PI = 3.14159
 * 
 * area = radius * radius * PI
 */

package com.chapter3;

import java.text.DecimalFormat;

import acm.program.ConsoleProgram;


/* Class name: AreaOfCircle
 * 
 * This class prompts the user to enter the radius of a circle, then calculates
 * and displays the answer to the screen
 */
public class AreaOfCircle extends ConsoleProgram {
	
	public void run(){
				
		double radius=getRadius();
		
		calculateArea(radius);
	}

	/* Method name: calculateArea
	 * --------------------------
	 * This method performs the calculation after being passed the radius
	 * from a calling function
	 * precondition: receives the radius from the invoking method
	 * postcondition: returns the answer to the calling method
	 */
	private void calculateArea(double radius) {
		double answer = radius * radius * PI;
		displayAnswer(answer);
	}

	/* Method name: displayAnswer
	 * --------------------------
	 * This method displays the answer to the screen after rounding it to 2
	 * decimal places.
	 * precondition: receives the answer from the invoking method
	 * postcondition: Displays the answer to the screen rounded to 2 decimal 
	 * places
	 */
	private void displayAnswer(double answer) {
		
		DecimalFormat df = new DecimalFormat("####0.00");
		
		println("The area of the circle is: " + df.format(answer));
	}

	/* Method name: getRadius
	 * ----------------------
	 * Prompts the user to enter a radius
	 * precondition: none
	 * postcondition: After receiving the radius passes this number to the calling
	 * method
	 */
	private double getRadius() {

		double userInput;
		
		println("This program calculates the area of a circle.");
		userInput = readDouble("Enter the circles radius: ");
		
		return userInput;
	}
	
	final static double PI=3.14159;
}
