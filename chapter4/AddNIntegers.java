/* File name: AddNIntegers.java
 * ----------------------------
 * This program adds a predefined number of integers and
 * then prints the sum at the end. To change the number
 * of integers, change the definition of NVALUES.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/28
 */

package com.chapter4;

import acm.program.ConsoleProgram;

public class AddNIntegers  extends ConsoleProgram{
	
	/* runs the program*/
	public void run(){
		println("This program adds " + NVALUES + " integers.");
		int total = 0;
		for( int i = 0; i < NVALUES; i++){
			int value = readInt(" ? ");
			total += value;
		}
		println("The total is " + total + ".");
	}

	/* Specifies the number of values */
	private static final int NVALUES = 10;
}
