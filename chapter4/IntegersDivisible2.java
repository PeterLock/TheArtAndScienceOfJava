/* File name: IntegersDivisible2.java
 * ---------------------------------
 * This program displays integers between 1 and 100 that are divisible by 
 * 6, not 7.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/30
 * 
 */
package com.chapter4;

import acm.program.ConsoleProgram;

public class IntegersDivisible2 extends ConsoleProgram{
	
	public void run(){
		
		showMessage();
		 doTheMath();
		
	}
	
	/* Method name: doTheMath()
	 * ----------------------
	 * This method displays numbers up to a hundred that are either
	 * divisible by 6, not 7. The for loop checks whether the remainder after
	 * being compared with the modulus operator is equal to zero. If it is equal 
	 * to zero then it is divisible. If not, then not.
	 * 
	 */
	private void doTheMath() {
		for(int i = 1; i <= 100; i++){
			if(i % 6 == 0 && !(i % 7 == 0)){
				if(i % 6 == 0)
					println(i + " is divisible by 6.");
			}
		}
	}

	/* Method name: showMessage()
	 * ------------------------
	 * This method displays a simple message to the screen saying what the 
	 * program does.
	 * 
	 */
	private void showMessage() {
		println("This program displays numbers that are divisible by 6, and not divisible by 7.");
		println("The numbers are: ");
		println("");	
	}

}
