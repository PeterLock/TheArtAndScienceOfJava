/**
 * File name: RaiseRealToPower
 * ---------------------------
 * This program takes a floating-point value x and an integer k and returns
 * x to the power of k. It also correctly calculates the result when k is
 * negative, using the relationship:
 * 
 *  x-k = 1
 *        - 
 *  	  xk
 *  
 *  Programmer: Peter Lock
 *  Date: 2015/12/13
 *  
 */

package com.chapter5;

import acm.program.ConsoleProgram;

public class RaiseRealToPower extends ConsoleProgram {
	
	public void run(){
		
		println("This program takes a floating-point value x and an integer k and returns ");
		println("x to the power of k.");
		println("");	
		
		float x = (float)readDouble("Enter a floating point valule (x): ");
		int k = readInt("Enter an integer (k): ");
		
		solution(x, k);
		
	}
	/**
	 * Method name: solution
	 * ---------------------
	 * Returns x to the power of k. k can be either positive or negative.
	 */
	private void solution(float x, int k) {
		if(k<0){
			println("k (" + k + ") is a negative. The answer is: " + Math.pow(x, k));
		}
		else{
			println(x + " to the power of " + k + " = " + Math.pow(x, k));
		}
	}

}
