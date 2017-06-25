/**
 * File name: DigitSum.java
 * ------------------------
 * Returns the number of digits in the integer n, which we can assume is positive
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/14
 */

package com.chapter5;
import acm.program.ConsoleProgram;

public class DigitSum extends ConsoleProgram{
	
	public void run(){
		
		println("This program returns the number of digits in the integer n.");
		int x = readInt("Enter a number: ");
		
		int answer = getNumberOfDigits(x);
		
		println("");
		println("The number entered contained " + answer + " digits.");
		
	}
	/**
	 * Method name: getNumberOfDigits
	 * ------------------------------
	 * @param x Assigns the parameter x to number.
	 * @return Returns the number of digits in the number entered.
	 */
	private int getNumberOfDigits(int x) {
		
		int number=x;
		int count=0;
		
		while(number > 0){
			count++;
			number /=10;
		}
		
		return count;
	}

}
