/**
 * File name: PrintConsonants.java
 * -------------------------------
 * This program prints all the English consonants in uppercase.
 * 
 * Programmer: Peter Lock
 * Date: 20/1/2016
 */

package com.chapter9;

import acm.program.ConsoleProgram;

public class PrintConsonants extends ConsoleProgram {
	
	public static void main(String[] args){
		
		char ch;
		
		for(ch='a'; ch<='z'; ch++){
			isConsonant(ch);
		}
	}
	
	/**
	 * Method name: isConstonant
	 * -------------------------
	 * This method receives a character as parameter and tests to see 
	 * if it is a vowel. If it is a vowel the method returns. If it is
	 * not a vowel the method sends the letter to the screen in upper case.
	 * @param ch Receives a character as a parameter.
	 * Precondition: Receives a character as a parameter
	 * Postcondition: Sends all consonant characters to the screen,
	 */
	private static void isConsonant(char ch) {
		switch(ch){
		case 'a': case 'e': case 'i': case '0': case 'u': {
			return;
		}
		}
		System.out.print(Character.toUpperCase(ch));
	}

}
