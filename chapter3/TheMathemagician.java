/* File: TheMathemagician.java
 * ---------------------------
 * This programs takes Norton Juster's chirldrens story The Phantom Tollbooth
 * enters evaluates Milos problem using javas precedence rules.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/26
 * 
 */

package com.chapter3;

import acm.program.ConsoleProgram;

/* Class name: TheMathematician
 * ----------------------------
 * This class returns the answer to Milos calculations in the children's book
 * THE MATHEMAGICIAN using Javas precedence rules.
 */
public class TheMathemagician extends ConsoleProgram{
	
	public void run(){
		
		showMessage();
		
	}

	/* Method name: showMessage
	 * ------------------------
	 * This method sends a message to the screen with an explanation.
	 * precondition: none
	 * postcondition: displays the answer to the screen.
	 */
	private void showMessage() {
		
		double answer = getAnswer();
		
		println("In Norton Justers childrens story THE MATHEMATICIAN the expresson: ");
		println("4 + 9 - 2 x 16 + 1 / 3 x 6 - 67 + 8 x 2 - 3 + 26 - 1 / 34 + 3 / 7 + 2 - 5 = 0");
				
		println("In Java it equals: " + answer);
	}

	/* Method name: getAnswer
	 * ----------------------
	 * This method calculates the equation using Javas precedence rules
	 * precondition: is invoked by a calling method
	 * postcondition: returns the answer to the equation to the calling function
	 * 
	 */
	private double getAnswer() {
		
		double answer = 0;
		
		answer = 4 + 9 - 2 * 16 + 1 / 3 * 6 - 67 + 8 * 2
				- 3 + 26 - 1 / 34 + 3 / 7 + 2 - 5;
		
		return answer;
	}

}
