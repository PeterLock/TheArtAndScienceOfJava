/**
 * File name: MyIndexOf
 * --------------------
 * This program demonstrates a method that behaves the same way as
 * indexOf does.
 * 
 * Programmer: Peter Lock
 * Date: 22-1-2016
 * 
 */

package com.chapter9;

import java.util.Scanner;

import acm.program.ConsoleProgram;

public class MyIndexOf extends ConsoleProgram {
	
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		
		String word = reader.next();
		System.out.print("Enter the letter to search for: ");
		
		char letter = reader.next().charAt(0);
		showIndexPositions(word);
		System.out.println("");
		if(myIndexOf(word, letter) == -1) System.out.print("The letter ( " + letter + " ) was not found in the string.");
		else{
			System.out.print("The letter " + letter + " is first found at position " + myIndexOf(word, letter) + " of the string.");
		}
		reader.close();		
	}
	/*
	 * Method name: showIndexPostions
	 * ------------------------------
	 * This method displays a word passed as a parameter and the character index positions within.
	 * Precondition: Receives a word as a parameter.
	 * Postcondition: Prints the character index positions of the word to the screen.
	 */
	private static void showIndexPositions(String word) {
		System.out.println("");
		for(int x = 0; x < word.length(); x++){
			System.out.println(word.charAt(x) + " is in postion: " + x);
		}
	}
	/*
	 * Method name: myIndexOf
	 * ----------------------
	 * This method shows the index position of a letter in a word. Both the word and the letter 
	 * being searched for are passed as parameters.
	 * Precondition: Receives a word and letter as parameters. The word has already been searched before this
	 * method is called, meaning that this method will always return character index postion.
	 * Postcondition: Returns the character index position to the calling method if the character was found.
	 */
	private static int myIndexOf(String word, char letter) {		
		for(int x=0; x<word.length(); x++){
			if(word.charAt(x) == letter){
				return x;
			}
		}	
		return -1;
	}

}
