/**
 * File name: AskYesNoQuestion
 * ---------------------------
 * This program asks the user to enter 'yes' or 'no' only to determine whether to 
 * continue. If the user enters something else a message to that effect is displayed.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/14
 */

package com.chapter5;
import acm.program.ConsoleProgram;

public class AskYesNoQuestion extends ConsoleProgram{

	public void run(){
		
		/**
		 * Initialized to true - continues until the correct choice is made
		 * then exits the loop and continues the program.
		 */
		while(askYesQuestion()){
			println("Please answer yes or no.");
		}	
	}

	/**
	 * Method name: askYesQuestion
	 * ---------------------------
	 * @return Returns false if the users answer was either yes or no. Returns
	 * true if the answer is anything else.
	 */
	private boolean askYesQuestion() {
		
		String answer = readLine("Would you like instructions?");
		if(answer.equals("yes")) {
			println("You answered " + answer);
			return false;
		}
		
		if(answer.equals("no")) {
			println("You answered " + answer);
			return false;
		}
		return true;
	}


}
