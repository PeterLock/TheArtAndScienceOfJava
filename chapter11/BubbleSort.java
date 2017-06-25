/**File name: BubbleSort.java
 * --------------------------
 * This program uses the bubble sort algorithm to sort an array of integers.
 * 
 *  Programmer: Peter Lock
 *  Date: 24--2-2016
 */

package com.chapter11;

import java.util.Arrays;

import acm.util.RandomGenerator;

public class BubbleSort {
	/*Runs the program */
	public static void main(String[] args){
		
		int[] array = new int[15];
		
		populateArray(array);
		
		System.out.println("This program uses a bubble sort algorithm to sort an array of integers.");
		linebreak();
		System.out.println("The array has been intialized to: ");
		linebreak();
		printArray(array);
		linebreak(); linebreak();
		System.out.println("Starting bubblesort.. ");
		linebreak();
		sortArray(array);
		linebreak();
		System.out.println("Finished bubblesort. ");

	}
	/*Method name: linebreak() */
	private static void linebreak() {
		System.out.println();
	}
	/* Method name: printArray(int[] array)
	 * ------------------------------------
	 * Prints the arrays contents to the screen.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Array contents are printed to the screen.
	 */
	private static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) System.out.print(array[i] + " ");
	}
	/* Method name: populateArray(int[] array)
	 * ---------------------------------------
	 * Populates the array with random values between 1 and 15.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: The array is populated with random values between 1 and 15.
	 * 
	 */
	private static void populateArray(int[] array) {
		for(int i=0; i < array.length; i++) array[i] = rgen.nextInt(1, 15);
	}
	/** Method name: sortArray(int[] array)
	 * -----------------------------------
	 * Sorts an array using a Bubblesort algorithm. The array will be sorted in 
	 * ascending order.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Prints each iteration of the sorting process to the screen 
	 * until no other values are left to be sorted, meaning that that all values
	 * in the array have been sorted.
	 */
	private static void sortArray(int[] array) {
		int temp;
		
		for(int i = 0; i < array.length; i++){
			
			for(int j = 1; j< array.length-i; j++){
				if(array[j-1] > array[j]){
					
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}	
			}
		System.out.println((i+1) + getSuffix(i+1) + " iterative results: " + Arrays.toString(array));
		}
	}
	/* Method name: getSuffix(int num)
	 * -------------------------------
	 * This method returns the suffix for a number that it receives as a parameter.
	 * Precondition: Receives an integer as a parameter.
	 * Postcondition: Returns the suffix to the calling method.
	 */
	private static String getSuffix(int num) {
		switch(num){
		case 1: return("st");
		case 2: return("nd");
		case 3: return("rd");
		}
		String number = String.valueOf(num);
		if(number.charAt(number.length()-1) == '1'){
			return("th");
		}
		if(number.charAt(number.length()-1) == '1')return ("st");
		if(number.charAt(number.length()-1) == '2')return ("nd");
		if(number.charAt(number.length()-1) == '3')return ("rd");
		else{
			return("th");
		}
	}
	static RandomGenerator rgen = new RandomGenerator();	
}
