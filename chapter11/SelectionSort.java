/**
 * File name: SelectionSort.java
 * -----------------------------
 * This program sorts an array of strings into lexicographic order.
 * 
 * Programmer: Peter Lock
 * Date: 18-2-2016
 *
 */

package com.chapter11;


public class SelectionSort {
	
	/* Runs the program */
	public static void main(String[] args){
		System.out.println("This program sorts an array of strings into lexicographic order.");
		System.out.println("Before sorting: ");
		String[] array = {"mango", "friend", "mangooooob", "bat", "cat", "car", "ant", "dog", "mangoooool"};
		
		printArray(array);
		
		System.out.println("After sorting: ");
		sortIntegerArray(array);
		
		printArray(array);	
		
	}
	/* Method name: printArray(String[] array)
	 * -----------------------
	 * Prints the array contents to the screen
	 * Precondition: Receives the array as a parameter.
	 * Postcondition: Prints the array to the screen.
	 */
	private static void printArray(String[] array) {
		System.out.println();
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
	}
	/* Method name: sortIntegerArray(String[] array)
	 * ---------------------------------------------
	 * Sorts the array in ascending order.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Leaves the array sorted in ascending order.
	 */
	private static void sortIntegerArray(String[] array){
		
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
	private static int findSmallestElement(String[] array, int p1, int p2){
		int smallestIndex = p1;
		for(int i = p1 + 1; i <= p2; i++){
			if(array[i].compareTo(array[smallestIndex]) <0) smallestIndex = i;
		}
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
}
