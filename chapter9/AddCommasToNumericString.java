/**
 * File name: AddCommasToNumericString.java
 * ----------------------------------------
 * This program adds commas to large numbers which have been entered
 * by the user.
 * 
 * Programmer: Peter Lock
 * Date: 26-1-2016
 */

package com.chapter9;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import acm.program.ConsoleProgram;

public class AddCommasToNumericString extends ConsoleProgram {
	
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		while(true){
			System.out.print("Enter a number: ");
			String digits = reader.nextLine();
			if( digits.length()==0) break;
			System.out.println("The formatted number is: " + addCommasToNumericString(digits));
		}
		reader.close();
	}

	/*
	 * Method name: addCommasToNumericString
	 * -------------------------------------
	 * This method adds commas to a numeric string and returns the result to the calling method.
	 * Precondition: Receives a numeric string from the calling method as a parameter.
	 * Postcondition: Returns a number string which includes commas to the calling method.
	 */
	private static String addCommasToNumericString(String digits) {

		long number = Long.parseLong(digits);
		
		return NumberFormat.getNumberInstance(Locale.US).format(number);
	}
	
}
