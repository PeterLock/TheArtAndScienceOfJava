/* File name: SignTest.java
 * ------------------------
 * This program reads in an integer and classifies it as negtive,
 * zero, or positive depending on its sign.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/28
 */

package com.chapter4;

import acm.program.ConsoleProgram;

public class SignTest extends ConsoleProgram {

	public void run(){
		println("This program classifies an integer by its sign.");
		int n = readInt("Enter n: ");
		if(n > 0){
			println("That number is positive.");
		} else if (n == 0){
			println("That number is zero.");
		}
			else{
				println("That number is negative.");
		}
	}
}
