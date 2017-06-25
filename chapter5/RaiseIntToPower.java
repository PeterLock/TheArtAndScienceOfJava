/**
 * File name: RaiseIntToPower.java
 * -------------------------------
 * This program takes two integers, n and k, and returns n to the power
 * of k. The program then displays a table for all values of 2 to the 
 * power of k.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/13
 */

package com.chapter5;

import acm.program.ConsoleProgram;

public class RaiseIntToPower extends ConsoleProgram{
	
	public void run()
	{
		int x = readInt("Enter the first number: ");
		int y = readInt("Enter the second (power of) number: ");
		
		println(x + " to the power of " + y + " = " + Math.pow(x, y));
		
		println("");
		println("");
		
		println("Next a table of values of 2 (2e0-2e10)");
		
		getTable(y);
		
	}

	private void getTable(int y) {

		int z=0;
		
		println("");
		println("");
		for(int x=0; x<=10; x++){
			z = (int) Math.pow(2,x);
			println("2 to the power of " + x + " = " + z);
		}
	}
}
