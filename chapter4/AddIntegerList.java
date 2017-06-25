/* File: AddIntegerList.java
 * -------------------------
 * This program reads integers one per line until the
 * user enters a special value to signal the end of the 
 * input. At that point, the program prints out the sum
 * of the numbers entered so far.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/28
 */

package com.chapter4;

import acm.program.ConsoleProgram;

public class AddIntegerList extends ConsoleProgram{
	
	public void run(){
		println(" This program adds a list of integers.");
		println("Enter value,one per line, using " + SENTINEL);
		println(" to signal the end of the list.");
		int total=0;
		int value = readInt(" ? ");

		while(value != SENTINEL){
			total += value;
			value =readInt(" ? ");
		}
		println("The total is " + total + ".");
	}
	
	/* Specifies the value of the sentinel*/
	private final static int SENTINEL=0;

}
