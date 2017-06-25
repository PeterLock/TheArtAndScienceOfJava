/**
 * File name: GuessTheNumber.java
 * ------------------------------
 * This program plays a child number-guessing game with its user, who is
 * presumably an elementary child. The child thinks of a number between 1
 * and 100 and answers a series of questions from the computer until it
 * correctly guesses the number.
 * 
 * Programmer: Peter Lock
 * Date: 18-2-2-16
 */

package com.chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessTheNumber {
	
	private final static int UPPER_RANGE = 100;
	
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
	
		System.out.println("Think of a number between 1 and " + SEARCH_SIZE + " and I'll guess it.");
		
		int value = binarySearch();
		if(value == -1) {
			System.out.println("Number not found. Contact a System Administrator for more information. ");
			return;
		}
		
		System.out.println("I guessed the number. It was " + value + ".");
		
		reader.close();
	}
	/*
	 * Method name: binarySearch
	 * -------------------------
	 * Using a binary search this method prompts the user to see whether the number is less
	 * then the mid value. If it is the lh and rh values are adjusted accordingly.
	 */
	private static int binarySearch() throws IOException {
       int lh = 0;
       int rh = SEARCH_SIZE;
       while (lh <= rh) {
           int mid = (lh + rh) / 2;
           System.out.println("Is it " + mid + " ?");
       if(reader.readLine().equalsIgnoreCase("yes")) return mid;
       
       System.out.println("Is it less than " + mid + " ?");
       if(reader.readLine().equalsIgnoreCase("yes")){
               rh = mid - 1;
           } else {
        	   lh = mid + 1; }
       }
       return -1; 
	}
	   
	private static final int SEARCH_SIZE = 100;

}
