/* File: Countdown.java
 * --------------------
 * This program counts backwards from the value START
 * to zero, as in the count down preceding a rocket
 * launch, using a while loop.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/29
 */

package com.chapter4;

import acm.program.ConsoleProgram;

public class CountdownUsingWhileLoop extends ConsoleProgram {

	public void run(){
		int t=START;
		while(t !=0){
			print( t + ", " );
			t--;
		}	
		println("Liftoff!");
	}
	
	/* Specifies the value from which to start counting down */
	private static final int START=10;
	
}
