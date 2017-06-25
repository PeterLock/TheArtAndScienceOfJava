/* File: Countdown.java
 * --------------------
 * This program counts backwards from the value START
 * to zero, as in the countdown preceding a rocket
 * launch.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/29
 */

package com.chapter4;

import acm.program.ConsoleProgram;

public class CountDown extends ConsoleProgram{
	
	public void run(){
		for(int t = START; t >=0; t--){
			println(t);
		}
		println("Liftoff!");
	}
	
	/* Specifies the value from which to start counting down */
	private static final int START=10;

}
