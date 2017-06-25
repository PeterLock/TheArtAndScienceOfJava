/* File name: SumOfTheFirstN_OddNumbers.java
 * -----------------------------------------
 * This program reads in a positive integer N and then calculates and displays
 * the sum of the first N odd integers. For example, if N is 4, the program
 * displays the value 16, which is 1 + 3 + 5 + 7.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/29
 * 
 */

package com.chapter4;

import acm.program.ConsoleProgram;

public class SumOfTheFirstN_OddNumbers extends ConsoleProgram {
	
	public void run(){
		
		showMessage();
		int x = getInteger();
		
		doTheMath(x);
		
		
	}

	/* Method name: doTheMath
	 * ----------------------
	 * This method calculates the sum of all odd numbers up to the number entered
	 * by the user.
	 * precondition: Receives the users number as a parameter.
	 * postcondition: Prints the sum to the screen.
	 * 
	 */
	private void doTheMath(int x) {
		
		int total = 0;
		for (int i = 0; i < x; i++) {
		    total += (2*i + 1); // Gives you the odd number 
		}
		println(total);
	}
	/* Method name: getInteger
	 * -----------------------
	 * This method prompts the user for a positive integer.
	 * precondition: none.
	 * postcondition: returns the users number to the calling method.
	 * 
	 */
	private int getInteger() {
		
		int userInput = readInt("Enter a positive integer: ");
		
		return userInput;
	}

	/* Method name: showMessage
	 * ------------------------
	 * This method displays a simple message to the screen telling the user
	 * what the program does.
	 * precondition: none
	 * postcondition: none
	 * 
	 */
	private void showMessage() {
		println("This program reads in a positive integer N and then calculates and displays ");
		println("the sum of the first N odd integers.");
	}

}
