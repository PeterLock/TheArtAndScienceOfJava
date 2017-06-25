/* File: ComputeTheAverage.java
 * ----------------------------
 * This program asks the user to enter 4 whole numbers and then computes
 * the average
 * Coder: Peter Lock
 * Date: 2015/11/261
 */

package com.chapter3;

import acm.program.ConsoleProgram;


/* Class name: ComputeTheAverage
 * -----------------------------
 * This class computes the average of four whole numbers entered by the user
 */
public class ComputeTheAverage extends ConsoleProgram{
	
	public void run(){
		
		
	double answer = showMessage();
	
	showAnswer(answer);
		
	}
	/* Method name: showAnswer
	 * -----------------------
	 * This method displays the answer to the screen.
	 * Precondition: receives the answer from the invoking method.
	 * Postcondition: Displays the answer to the screen.
	 */
	private void showAnswer(double answer) {
		println("The average is: " + answer);
	}
	/* Method name: showMessage
	 * ------------------------
	 * This method displays a message to the screen asking the user to enter
	 * four whole numbers.
	 * Precondition: none.
	 * Postcondition: Returns the answer to the invoking method.
	 * 
	 */
	private double showMessage() {

		println("This program displays the average of 4 whole numbers.");
		
		double answer = doCalculation();
		
		return answer;
	}
	/* Method name: doCalculations
	 * ---------------------------
	 * This method does all of the calculations to find the average.
	 * Precondition: none.
	 * Postcondition: returns the answer to the calling method.
	 * 
	 */
	private double doCalculation() {

		int num1 = readInt("Enter the first number: ");

		int num2 = readInt("Enter the second number: ");

		int num3 = readInt("Enter the third number: ");

		int num4 = readInt("Enter the fourth number: ");
		
		double answer = (double) (num1 + num2 + num3 + num4) / 4;
		
		
		return answer;
	}
	
}
