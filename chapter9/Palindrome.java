/**
 * File name: Palindrome.java
 * --------------------------
 * This program prompts the user to enter a word and then tells the user
 * whether the word is a Palindrome or not.
 * 
 * Programmer: Peter Lock
 * Date: 26th January 2016
 */

package com.chapter9;

import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("This program tests whether an entered word is a palindrome.");

		while(true){
			System.out.print("Enter a word: ");
			String word = reader.nextLine();
			if(word.length()==0) break;
			
			if(isPalindrome(word)) System.out.println("The word (" + word + ") is a palindrome."); 
			else
				System.out.println("The word (" + word + ") is NOT a palindrome.");
		}		
		reader.close();
	}
	/*
	 * Method name: isPalindrome
	 * -------------------------
	 * This method receives a word as a parameter and tests whether the word is a palindrome. 
	 * A for loop is used to compare each character until the middle of the word with the corresponding
	 * character at the end of the word. If successful the method returns true. If unsuccessful the
	 * method returns false.
	 * Precondition: Receives a word as a parameter.
	 * Postcondition: Returns true if the word is a palindrome. Returns false if the word is not a palindrome.
	 */
	private static boolean isPalindrome(String word) {
		
		for(int x = 0; x < (word.length()/2) + 1; x++){
			if(word.charAt(x) != word.charAt(word.length() - x - 1)){
				return false;
			}
		}
		
		return true;
	}
	
}
