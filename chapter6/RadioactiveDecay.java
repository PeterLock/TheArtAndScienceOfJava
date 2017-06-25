/**
 * File name: RadioactiveDecay.java
 * --------------------------------
 * This program simulates the decay of a sample that contains 10,000 atoms
 * of radioactive material, where each atom has a 50 percent probability of
 * decaying in any unit of time. The output of the program displays the number
 * of atoms remaining at the end of each year.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/25
 */
package com.chapter6;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class RadioactiveDecay extends ConsoleProgram{
	
	public void run(){
		
		int atomsRemaining = 10000;
		int year = 1;
		
		println("There are " + atomsRemaining + " atoms intially.");
		
		while(atomsRemaining !=0){
			for(int i=1; i<=atomsRemaining; i++){
				boolean decay = rgen.nextBoolean();
				if(decay) atomsRemaining--;
			}
			println("There are " + atomsRemaining + " at the end of year " + year + ".");
			year++;
		}
		
	}
	
	private RandomGenerator rgen = new RandomGenerator();

}
