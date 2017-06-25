/* File: AverageList.java
 * -------------------------
 * This program reads integers one per line until the
 * user enters -1 to signal the end of the 
 * input. At that point, the program prints out the sum
 * of the numbers entered so far.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/28
 */
package com.chapter4;

import acm.program.ConsoleProgram;

public class AverageList extends ConsoleProgram{
	
	public void run(){
		
		showMessage();
		
		doTheMath();
		
}		
	/* Method name: doTheMath()
	 * ----------------------
	 * This method performs the calculations to find the average of a data set
	 * 
	 */
	
	private void doTheMath() {
		double userInput = 0;
		
		double total = 0;
		int counter =0;

		userInput = readInt( "?: ");
		
		if(userInput == -1){
			println("Average = 0");
		}
		else{
			while(userInput!= SENTINEL){
				counter++;
				total = total + userInput;
				userInput = readInt( "?: ");
			}			
			double average =  total/counter;
			println("The total is " + average + ".");
		}	
	}

	/* Method name: showMessage()
	 * --------------------------
	 * This method prints an explanation of the program to the screen
	 */
	
	private void showMessage() {
		println("This program finds the average from a group of scores.");
		println("Enter score, one per line, using " + SENTINEL);
		println(" to signal the end of the list.");
	}

	/* Specifies the value of the sentinel*/
	private final static int SENTINEL=-1;

}
