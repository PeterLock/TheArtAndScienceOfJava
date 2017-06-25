/*
 * File name: ReverseArray.java
 * ----------------------------
 * This file reads in a array of five integers and then displays
 * those elements in reverse order.
 * 
 * Programmer: Peter Lock
 * Date: 28-1-2016
 */

package com.chapter10;

import acm.program.ConsoleProgram;

public class ReverseArray extends ConsoleProgram{

	/** Runs the program */
	public void run(){
		int[] array = new int[N_VALUES];
		
		this.setSize(600, 250);
		
		println("This program reverses the elements in an array.");
		readArray(array);
		reverseArray(array);
		printArray(array);
	}
	/*
	 * Method name: printArray
	 * -----------------------
	 * This method prints out the data from the array, one per line.
	 */
	private void printArray(int[] array) {
		for(int i =0; i<array.length; i++){
			println(array[i]);
		}
	}
	/*
	 * Method name: reverseArray
	 * -------------------------
	 * This method reverses the data in the array
	 */
	private void reverseArray(int[] array) {
		for(int i=0; i<array.length /2; i++){
			swapElements(array, i, array.length - i - 1);
		}
	}
	/*
	 * Method name: swapElements
	 * -------------------------
	 * This method exchanges two elements in an array
	 */
	private void swapElements(int[] array, int p1, int p2) {
		int temp = array[p1];
		array[p1] = array[p2];
		array[p2] = temp;
	}
	/*
	 * Method name: readArray
	 * ----------------------
	 * This method reads the data into the array.
	 */
	private void readArray(int[] array) {
		for(int i = 0; i< array.length; i++){
			array[i] = readInt(" ? ");
		}
	}

	private static final int N_VALUES = 5;

}
