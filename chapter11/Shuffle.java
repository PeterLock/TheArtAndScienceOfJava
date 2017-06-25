/*
 * File name: Shuffle.java
 * -----------------------
 * Many algorithmic problems are related to sorting in their solutions. For
 * example, we can shuffle an array by 'sorting' it accordingly to a random
 * key value. One way to do this is to begin with a selection sort algorithm
 * and then replace the step that finds the position of the smallest value with
 * one that selects a random key value.
 * 
 * Programmer: Peter Lock
 * Date: 23-2-2016
 */

package com.chapter11;

import acm.util.RandomGenerator;

public class Shuffle {
	
	/* Runs the program */
	public static void main(String[] args){
		
		int[] array = new int[50];	
		populateArray(array);
	
		System.out.println("This program shuffles an array of integers between 1 and 50 using a random sort.");
		linebreak();
		System.out.println("The array contains: ");
		linebreak();
		printArray(array);
		
		shuffleIntegerArray(array);
		linebreak();linebreak();
		System.out.println("After shuffling the array contains: ");
		linebreak();
		printArray(array);
	}

	private static void linebreak() {
		System.out.println();
	}

	private static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if((i == 10) || (i == 20) || (i == 30) || (i == 40)) System.out.println();
		
		System.out.print(array[i] + ", ");
		}
	}

	private static void populateArray(int[] array) {
		for(int i = 0; i < array.length; i++) array[i] = i+1;
	}

	/* Method name: sortIntegerArray(String[] array)
	 * ---------------------------------------------
	 * Sorts the array in ascending order.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Leaves the array sorted in ascending order.
	 */
	private static void shuffleIntegerArray(int[] array){
		
		for( int lh = 0; lh < array.length; lh++){
			int rh = findSmallestElement(array, lh, array.length - 1);
			swapElements(array, lh, rh);
		}
	}
	
	/**
	 * Returns the index of the smallest element in the array between
	 * index positions p1 and p2, inclusive. 
	 *  
	 */
	private static int findSmallestElement(int[] array, int p1, int p2){
		
		int smallestIndex = rgen.nextInt(0, 49);

		return smallestIndex;
	}
	/**
	 * Exchange the elements in an array at index positions p1 and p2.
	 */
	private static void swapElements(int[] array, int p1, int p2){
		int temp = array[p1];
		array[p1] = array[p2];
		array[p2] = temp;
	}
	
	private static RandomGenerator rgen = new RandomGenerator();

}
