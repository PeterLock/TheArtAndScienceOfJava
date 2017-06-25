/* File: DigitSum.java
 * -------------------
 * This program sums the digits in a positive integer.
 * The program depends on the fact that the last digit of
 * a integer n is given by n % 10 and the number consisting 
 * of all but the last digit is given y the expression n / 10.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/29
 */

package com.chapter4;

import acm.program.ConsoleProgram;

public class Digitsum extends ConsoleProgram {
	
	public void run(){
		println("This program sums the digits in an integer.");
		int n = readInt("Enter a positive integer: ");
		int dsum = 0;
		while ( n > 0 ){
			dsum += n % 10;
			n /= 10;
		}
		println("The sum of the digits is " + dsum);
	}

}
