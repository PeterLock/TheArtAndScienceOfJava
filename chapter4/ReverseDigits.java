/* File name: ReverseDigits.java
 * -----------------------------
 * This program prompt the user to enter a number then prints the number
 * to the screen in reverse.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/30
 * 
 */
package com.chapter4;

import acm.program.ConsoleProgram;

public class ReverseDigits extends ConsoleProgram {
	public void run(){
		int original = readInt("Enter a positive integer: ");
		
		int reverseNumber = 0;
		
		int remainder;
		
		while(original !=0){
			remainder = original % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			original = original / 10;
		}
		
		System.out.println(reverseNumber);
	}
}

