/* File name: IntegersDivisible.java
 * ---------------------------------
 * This program displays integers between 1 and 100 that are divisible by 
 * either 6 or 7.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/30
 * 
 */

package com.chapter4;

import acm.program.ConsoleProgram;

public class IntegersDivisible extends ConsoleProgram{
	
	public void run(){
		
		showMessage();
		 doTheMath();
		
	}
	
	/* Method name: doTheMath
	 * ----------------------
	 * This method displays numbers up to a hundred that are either
	 * divisible by 6 or by 7. The for loop checks whether the remainder after
	 * being compared with the modulus operator is equal to zero. If it is equal 
	 * to zero then it is divisible. If not, then not.
	 * 
	 */
	private void doTheMath() {
		for(int i = 1; i <= 100; i++){
			if(i % 6 == 0 || i % 7 == 0){
				if(i % 6 == 0)
					println(i + " is divisible by 6.");
				else
					println(i + " is divisible by 7.");
			}
		}
	}

	/* Method name: showMessage
	 * ------------------------
	 * This method displays a simple message to the screen saying what the 
	 * program does.
	 * 
	 */
	private void showMessage() {
		println("This program displays numbers that are divisible by either 6 or 7.");
		println("The numbers are: ");
		println("");	
	}

}
