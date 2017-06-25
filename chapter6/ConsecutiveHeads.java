/**
 * File name: ConsecutiveHeads.java
 * --------------------------------
 * This program simulates flipping a coin repeatedly and continues until
 * three consecutive heads are tossed. At that point, the program will 
 * display the total number of coin flips that were made.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/25
 */

package com.chapter6;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class ConsecutiveHeads extends ConsoleProgram{
	
	public void run(){
				
		println("This program flips a coin repeatedly until three consecutive heads are tossed.");
		println("At that point the proram will display the total number of coin flips made.");
		
		int count = doToss();
		
		println("It took " + count + " flips to get 3 consecutive heads.");
		
	}

	/**
	 * Method name: doToss
	 * --------------------
	 * This method continues choosing random numbers until the constant HEADS has 
	 * been selected 3 times consecutively.
	 * @return Returns the total number of tosses made
	 */
	private int doToss() {
		
		int flag=0;
		int count =0;
		
		
		while(flag <3){
			if(rgen.nextInt(1, 2)== HEAD){
				flag++;
				count++;
				println("Heads");
			} else{
				println("Tails");
				flag=0;
				count++;
			}
		}
		
		return count;
	}

	private RandomGenerator rgen = new RandomGenerator();
	private final static int HEAD=1;
	private final static int TAILS=2;

}
