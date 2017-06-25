/**
 * File name: OrdinalForm.java
 * ---------------------------
 * This program returns the ordinal form of a number entered by the user.
 * 
 * The general rule for determining the suffix of an ordinal 
 * can be defined as follows: 
 * 
 * Numbers ending in the digit 1, 2, and 3, take the suffixes "st", "nd", and "rd", 
 * respectively, unless the number ends with the two- digit combination 11, 12, or 13. 
 * Those numbers, and any numbers not ending with a 1, 2, or 3, take the suffix "th".
 * 
 * Programmer: Peter Lock
 * Date: 25-1-2016
 */
package com.chapter9;

import java.util.Scanner;

import acm.program.ConsoleProgram;

public class OrdinalForm extends ConsoleProgram {

	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int number = reader.nextInt();
				
		String suffix = getSuffix(number);
		System.out.println("The ordinal form (" + number + ") " + "returns the string \"" +  number +suffix + "\"");
		
		reader.close();
	}
	/*
	 * Method name: getSuffix
	 * ----------------------
	 * This method receives a number as a parameter and runs a series of test to see which suffix 
	 * the number should have. Then, when the correct suffix has been found the suffix is returned 
	 * to the calling method.
	 * Precondition: Receives a number to be tested.
	 * Postcondition: Returns the correct suffix to the calling method.
	 */
	private static String getSuffix(int num) {

		switch(num){
		case 1: return("st");
		case 2: return("nd");
		case 3: return("rd");
		}
		
		String number = String.valueOf(num);
		System.out.println();
		
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
	
}
