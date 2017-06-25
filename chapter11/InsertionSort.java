/* File name: InsertionSort.java
 * -----------------------------
 * This program sorts an array of data using an Insertion sort algorithm. The array will be
 * sorted in ascending order. The array is populated using random numbers between 1 and 15.
 * 
 * Programmer: Peter Lock
 * Date: 24-02-2016
 */
package com.chapter11;

import acm.util.RandomGenerator;

public class InsertionSort {
	/* Runs the program */
	public static void main(String[] args){
		
		int[] array = new int[15];
		
		System.out.println("This program sorts an array using the Insertion sort algorithm.");
		System.out.println();
		System.out.print("The array has been initialized to: ");
		populateArray(array);
		printArray(array);
		
		System.out.println();
		System.out.println();
		System.out.println("Beginning sort ..");
		System.out.println();
		sortArray(array);
		printArray(array);
		System.out.println();
		System.out.println();
		System.out.println("Insertion sort finsihed.");
	}
	/* Method name: sortArray(int[] array)
	 * -----------------------------------
	 * This method performs the insertion sort on a given array.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Leaves the array sorted in ascending order.
	 */
	private static void sortArray(int[] array) {
	     int key; // the item to be inserted
	     int i;  

	     for (int j=1; j < array.length; j++){
	           key = array[ j ];
	           for(i = j - 1; (i >= 0) && (array[ i ] > key); i--) // Smaller values are moving up
	          {
	                 array[ i+1 ] = array[ i ];
	          }
	         array[ i+1 ] = key; // Put the key in its proper location
	     }		
	}
	
	/* Method name: printArray(int[] array)
	 * ------------------------------------
	 * This method sends the arrays contents to the console as output.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Sends the arrays contents to the console.
	 */
	private static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) System.out.print(array[i] + " ");
	}
	/* Method name: populateArray(int[] array)
	 * ---------------------------------------
	 * This method populates the array with random numbers between 1 and 15.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Leaves the array populated with random numbers between 1 and 15.
	 */
	private static void populateArray(int[] array) {
		for(int i=0; i<array.length; i++) array[i] = rgen.nextInt(1, 15);
	}
	
	static RandomGenerator rgen = new RandomGenerator();

}
