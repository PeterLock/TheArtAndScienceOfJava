/* Filename: AnOldNurseryRhyme.java
 * --------------------------------
 * This programs calculates and displays the results to an old nursery rhyme.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/26
 */
package com.chapter3;

import acm.program.ConsoleProgram;

/* Class name: AnOldNurseryRhyme
 * -----------------------------
 * This class uses java to calculate the answer to an old children's nursery rhyme.
 */
public class AnOldNurseryRhyme extends ConsoleProgram{
	
	private int total=0;
	
	public void run(){
		
		showNurseryRhyme();
		showMessage();
		
		total += getWives(total);
		
		total += getSacks(total);
		
		total += getCats(total);
		
		total += getKits(total);
		
		println("");
		println("So after adding the wives (7), the sacks (49), the cats (49), "
				+ "and the kits (49) we have a total of: " + total);
	}
	/* Method name: getKits
	 * -------------------------
	 * This method prints a message to the screen and returns a value to the calling method
	 * Precondition: Must receive a cumulative total from the invoking method.
	 * Postcondition: Returns a new value to be added to the cumulative total.
	 */
	private int getKits(int total) {
		
		int newTotal = total + 49;
		
		println("The next line states: Each cat had seven kits, multiply seven "
				+ "by seven and add this to our total which is now: " + newTotal);
		return 49;
	}
	/* Method name: getCats
	 * -------------------------
	 * This method prints a message to the screen and returns a value to the calling method
	 * Precondition: Must receive a cumulative total from the invoking method.
	 * Postcondition: Returns a new value to be added to the cumulative total.
	 */
	private int getCats(int total) {
		
		int newTotal = total + 49;
		
		println("The next line states: Each sack had seven cats, multiply seven "
				+ "by seven and add this to our total which is now: " + newTotal);
		return 49;
	}
	/* Method name: getSacks
	 * -------------------------
	 * This method prints a message to the screen and returns a value to the calling method
	 * Precondition: Must receive a cumulative total from the invoking method.
	 * Postcondition: Returns a new value to be added to the cumulative total.
	 */
	private int getSacks(int total) {
		
		int newTotal = 7 + 49;
		
		println("The next line states: Each wife had seven sacks, multiply seven "
				+ "by seven and add this to our total which is now: " + newTotal);
		
		return 49;
	}
	/* Method name: showNurseryRhyme
	 * -----------------------------
	 * This method prints the nursery rhyme to the screen which will is needed for the 
	 * user to understand before continuing.
	 * Precondition: none.
	 * Postcondition: none.
	 */
	private void showNurseryRhyme() {
		println("A nursery rhyme:");
		println("");
		println("As I was going to St. Ives,");
		println("I met a man with seven wives,");
		println("Each wife has seven sacks,");
		println("Each sack had seven cats, ");
		println("Each cat had seven kits: ");
		println("Kits, cats, sacks, and wives,");
		println("How many were going to St. Ives?");
	}
	/* Method name: getWives
	 * -------------------------
	 * This method prints a message to the screen and returns a value to the calling method
	 * Precondition: Must receive a cumulative total from the invoking method.
	 * Postcondition: Returns a new value to be added to the cumulative total.
	 */
	private int getWives( int total) {
		println("The first line states: I met a man with seven wives, so our starting total is: 7");
		
		
		return 7;
	}
	/* Method name: showMessage
	 * ------------------------
	 * This method prints a description of the program to the screen.
	 * Precondition: none.
	 * Postcondition: none.
	 * 
	 */
	private void showMessage() {
		println("");
		println("This program calculates how many representatives of the assembled multitude were coming from St. Ives.");
		println("");
	}

}
