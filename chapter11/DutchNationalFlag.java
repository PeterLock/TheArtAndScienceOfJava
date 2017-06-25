/**
 * File name: DutchNationalFlag.java
 * ---------------------------------
 * One of the most famous algorithmic problems taught at this level is the 
 * Dutch National Flag problem, first proposed by Edsger Dijkstra. Suppose we
 * had an array with n elements, each of which is a character - 'R', 'W', or
 * 'B' - representing one of the colors of the Dutch flag in random order. 
 * This program rearranges the characters so that they appear in the same order
 * is the Dutch flag. The Dutch flag colors are arranged as: Reds, followed by
 * Whites, followed by Blues.
 * 
 * Programmer: Peter Lock
 * Date: 23-2-2016
 */

package com.chapter11;

import java.util.ArrayList;

import acm.util.RandomGenerator;

public class DutchNationalFlag {
	
	/*Runs the program */
	public static void main(String[] args){
		
		String[] array = new String[15];
		System.out.println("This program demonstrates the Dutch flag algorithmic problem:");
		linebreak();
		populateArray(array);
		
		System.out.println("Array initialized as:");
		printArray(array);
		linebreak();
		shuffleCharArray(array);
		
		linebreak();
		System.out.println("Array shuffled to: ");
		printArray(array);
		
		linebreak(); 
		linebreak();
		System.out.println("Array reordered to: ");
		
		swapArray(array);
		
	}
	/**Method name: swapArray(String [] array)
	 * ---------------------------------------
	 * Swaps the elements in the array until it finds the correct order.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Leaves the array populated in the correct order as the 
	 * Dutch national flag
	 * 
	 * @param array
	 */
	private static void swapArray(String[] array) {

		int redIndex=0, blueIndex=0, whiteIndex=0;
		
		//storing the result
		ArrayList<String> results = new ArrayList<String>();
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i].equals("R")){
				results.add(redIndex, array[i]);
				redIndex++;
				blueIndex++;
				whiteIndex++;
			} else if(array[i].equals("W")){
				results.add(whiteIndex, array[i]);
				whiteIndex++;
				blueIndex++;
			} else{
				results.add(blueIndex, array[i]);
				blueIndex++;
			}
		}
		System.out.println(results);

	}
	/* Method name: linebreak()
	 * ------------------------
	 * Prints a new line to the screen.
	 * Precondition: None
	 * Postcondition: Adds a line break to the console screen.
	 */
	private static void linebreak() {
		System.out.println();
	}
	/* Method name: printArray(String[] array)
	 * ---------------------------------------
	 * Prints the array to the screen
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Prints the array to the screen.
	 */
	private static void printArray(String[] array) {
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
	/* Method name: populateArray(String[] array)
	 * ------------------------------------------
	 * This method populates the array in its initial state.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Leaves the array populated.
	 */
	private static void populateArray(String[] array) {
		for(int i = 0; i < 5; i++) array[i] = "R";
		for(int x = 5; x < 10; x++) array[x] = "W";
		for(int y = 10; y < 15; y++) array[y] = "B";
	}
	
	/** Method name: sortIntegerArray(String[] array)
	 * ---------------------------------------------
	 * Sorts the array in ascending order.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Leaves the array sorted in ascending order.
	 */
	private static void shuffleCharArray(String[] array){
		
		for( int lh = 0; lh < array.length; lh++){
			int rh = findSmallestElement(array, lh, array.length - 1);
			swapElements(array, lh, rh);
		}
	}
	
	/**
	 * Returns the index of the smallest element in the array between
	 * index positions p1 and p2, inclusive.   
	 */
	private static int findSmallestElement(String[] array, int p1, int p2){
		
		int smallestIndex = rgen.nextInt(0, 14);

		return smallestIndex;
	}
	/**
	 * Exchange the elements in an array at index positions p1 and p2.
	 */
	private static void swapElements(String[] array, int p1, int p2){
		String temp = array[p1];
		array[p1] = array[p2];
		array[p2] = temp;
	}


	static RandomGenerator rgen = new RandomGenerator();

}
