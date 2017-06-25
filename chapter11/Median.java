/**
 * File name: Median.java
 * ----------------------
 * This program finds the median in an array filled with double values.
 * 
 * Programmer: Peter Lock
 * Date: 22-2-2016
 * 
 */

package com.chapter11;

import java.util.Arrays;

public class Median {
	/*Runs the program*/
	public static void main(String[] args){
		
		double[] array = { 1, 3.3, 2.5, 6, 8.5, 9, 4, 5.5, 2, 10.5 };
		
		System.out.println("This program prints the median of an array containing integer values.");
		printMedian(array);
		
		getMedian(array);
		
	}

	/*Method name: printMedian
	 *------------------------
	 * This method prints the values in the array to the screen.
	 */
	private static void printMedian(double[] array) {
		System.out.println();
		System.out.println("The array contains: ");
		for(int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
	}
	/*Method name: getMedian
	 *----------------------
	 *Sorts the array using the Arrays.sort(array) method, then finds the midway
	 *point and calculates the median. Once the median has been found it is printed 
	 *to the screen.
	 *
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Prints the median to the screen.
	 */
	private static void getMedian(double[] array) {

		Arrays.sort(array);
		
		printMedian(array);
		
		double median;
		if(array.length %2 == 0)
			median = ((double)array[array.length/2] + (double)array[array.length/2 - 1]) /2;
		else 
			median = (double) array[array.length/2];
		
		System.out.println();
		System.out.println();
		System.out.println("Median found: " + median);
	}

}
