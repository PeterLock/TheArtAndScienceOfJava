/**
 * File name: IsEnglishConsonant.java
 * ----------------------------------
 * This program determines whether the first letter of a word 
 * is a consonant or a vowel.
 * 
 * Programmer: Peter Lock
 * Date: 20/1/2016
 */
package com.chapter9;

import java.util.Scanner;

import acm.program.ConsoleProgram;

public class IsEnglishConsonant extends ConsoleProgram{
	

	public static void main(String[] args){	
		
		Scanner reader = new Scanner(System.in);
			
		System.out.print("Enter the character here: ");			
			
		char value = reader.next().charAt(0);
					
		boolean whatIsIt = isConstonant(value);
		if(whatIsIt)System.out.println("The first letter " + value + " is a consonant.");
		else System.out.println("The first letter " + value + " is a vowel.");
		
		System.out.println(value);
	}

	/*
	 * Method name: isConsonant
	 * ------------------------
	 * This method receives a character as a parameter and tests whether
	 * it is a vowel of a consonant. If the letter is a vowel the method 
	 * returns false. If the character is a consonant the method returns 
	 * true.
	 * Precondition: Receives a character as a parameter.
	 * Postcondition: Returns true or false after testing the character.
	 * Returns true for a consonant. Returns false for a vowel.
	 */
	private static boolean isConstonant(char value) {
		
		switch(Character.toLowerCase(value)){
		case 'a': case 'e': case 'i': case 'o': case 'u': {
			return false;
		}
		}
		
		return true;
	}
}