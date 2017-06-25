/**
 * File name: Mode.java
 * --------------------
 * This program finds the mode in an array populated with double values.
 * 
 * Programmer: Peter Lock
 * Date: 23-2-2016
 */

package com.chapter11;

import java.util.Arrays;

public class Mode {
	/*Runs the program */
	public static void main(String[] args){
		
		double array[] = { 65, 84, 95, 75, -82, -79, 82, 72, 84, 94, 86, 90, -82 };
		
		System.out.println("This program finds the mode of an array populated with double values.");
		linebreak();
		printArray(array);
		
		linebreak();
		linebreak();
		System.out.print("The mode value is: " + getMode(array) + ".");
	}
	/* Method name: getMode
	 * --------------------
	 * Returns the mode of a sample data set.
	 * Precondition: Receives an array as a parameter.
	 * Postcondition: Returns the mode to the calling method.
	 * 
	 */
	private static double getMode(double[] array) {
		Arrays.sort(array);
		
		int count2 = 0;
		int count1 = 0;
		double popular1 = 0;
		double popular2 = 0;
		
		for(int i = 0; i < array.length; i++){
			
			popular1 = array[i];
			count1 = 1;
			
			for( int j = i + 1; j < array.length; j++){
				if(popular1 == array[j]) count1 ++;
			}
			
			if(count1 > count2){
				popular2 = popular1;
				count2 = count1;
			}
			else if(count1 == count2){
				popular2 = Math.min(popular2, popular1);	
			}
		}
		return popular2;
	}

	private static void linebreak() {
		System.out.println();
	}

	private static void printArray(double[] array) {
		for(int i = 0; i < array.length; i++) System.out.print(array[i] + ", ");
	}
	

}
