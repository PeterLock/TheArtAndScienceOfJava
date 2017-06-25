/**
 * File name: Fibonacci.java
 * -------------------------
 * Displays the nth Fibonacci number of a sequence.
 * Programmer: Peter Lock
 * Date: 2015/12/13
 */

package com.chapter5;

import acm.program.ConsoleProgram;

/**
 * Class name: Fibonacci
 * ---------------------
 * Prints the nth Fibonacci number to the screen.
 */
public class Fibonacci extends ConsoleProgram {
	
	public void run(){
		
		println("This program calculates the nth Fibonnaci number.");
		int x = readInt("Enter the nth number: ");
		println("");
		println("The " + x + "th Fibonacci number is " + fibonnaci(x));	
	}
	/**
	 * Method name: fibonnaci
	 * ----------------------
	 * Returns the nth Fibonacci number of a sequence. Receives the nth number
	 * from the calling function.
	 * precondition: Receives an integer as a parameter.
	 * postcondition: Returns the nth Fibonacci number to the calling method.
	 */
	private long fibonnaci(int x) {
		
		long f0=0, f1=1, f2=0;
		
		for(int y = 2; y <= x; y++){
			f2 = f1 + f0;
			f0 = f1;
			f1 = f2;
		}	
		return (f2);
	}

}
