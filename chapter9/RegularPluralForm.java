/**
 * File name: RegularPluralForm
 * ----------------------------
 * This program returns the plural of a word by following these standard English rules:
 * 
 * a. If the word ends in s, x, z, ch, or sh, add es to the word.
 * b. If the word ends in y and the y is preceded by a consonant, change the y to ies.
 * c. In all other cases, just add an s.
 * 
 * Programmer: Peter Lock
 * Date: 22-1-2-16
 */

package com.chapter9;

import java.util.Scanner;

import acm.program.ConsoleProgram;

public class RegularPluralForm extends ConsoleProgram{
	
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		
		String word = reader.next();
		System.out.print("The plural form of the word is: ");
		runTest(word);
		
		reader.close();
	}
	/*
	 * Method name: runTest
	 * --------------------
	 * This method uses a switch statement to test the end character(s) of a word that has been received as 
	 * a parameter. If:
	 * 
	 * a. If the word ends in s, x, z, ch, or sh, es is added to the word.
	 * b. If the word ends in y and the y is preceded by a consonant, the y is changed to ies.
	 * c. In all other cases, the letter s is added.
	 * 
	 * This method is a GENERAL rule of thumb for concatenating words into plurals. It does not take into account
	 * all possible words or word combinations. Use with caution.
	 */
	private static void runTest(String word) {

		switch(word.charAt(word.length()-1)){
		case 's': {
			System.out.print(word);
			break;
		}
		case 'x': {
			System.out.print(word.concat("es"));
			break;
		}
		case 'z': {
			System.out.print(word.concat("es"));
			break;
		}
		case 'h': {
			if((word.charAt(word.length()-2) == 'c') || (word.charAt(word.length()-2)=='s')) 	
				System.out.print(word.concat("es"));			
			break;
		}
		case 'y': {			
			if((word.charAt(word.length()-2) !='a') && (word.charAt(word.length()-2) != 'e') && (word.charAt(word.length()-2) != 'i') 
					&& (word.charAt(word.length()-2) != 'o') && (word.charAt(word.length()-2) != 'u')) {
				for(int x=0; x<word.length()-1; x++){
					System.out.print(word.charAt(x));
				}
			System.out.print("ies");
			} else {
				System.out.print(word.concat("s"));
			}
			break;
		}	
		default: {
			System.out.println(word.concat("s"));
			break;
			}	
		}
	}
}
