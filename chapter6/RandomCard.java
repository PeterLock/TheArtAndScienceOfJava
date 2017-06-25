/**
 * File name: RandomCard.java
 * --------------------------
 * This program prints a randomly chosen card from a deck of 52 to the 
 * screen.
 * Programmer: Peter Lock
 * Date: 2015/12/25
 */
package com.chapter6;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class RandomCard extends ConsoleProgram {
	
	public void run(){
		
		println("This program dsplays a randomly chosen card.");
		println(getCard());
		
	}

	/**
	 * Method name: getCard
	 * --------------------
	 * @return Returns the name of a randomly selected card to the 
	 * calling method
	 */
	private String getCard() {

		rnum = rgen.nextInt(1, 13);
		String card = "";
		
		switch(rnum){
			case 1: card = "Ace";
					break;
			case 2: card = "2";
					break;
			case 3: card = "3";
					break;
			case 4: card = "4";
					break;
			case 5: card = "5";
					break;
			case 6: card = "6";
					break;
			case 7: card = "7";
					break;
			case 8: card = "8";
					break;
			case 9: card = "9";
					break;
			case 10: card = "10";
					break;
			case 11: card = "Jack";
					break;
			case 12: card = "Queen";
					break;
			case 13: card = "King";		
					break;
		}
		return card;
	}
	
	private RandomGenerator rgen = new RandomGenerator();
	private int rnum = 0;

}
