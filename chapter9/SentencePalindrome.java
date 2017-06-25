/**
 * File name: SentencePalindrome.java
 * ----------------------------------
 * This program prompts the user to enter a sentence and then tells the user
 * whether the sentence is a palindrome or not.
 * 
 * Programmer: Peter Lock
 * Date: 26-1-2016
 */
package com.chapter9;

import java.util.Scanner;

public class SentencePalindrome {

	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("This program checks for sentece palindromes.");
		System.out.println("Indicate the end of the program with a blank line.");
		
		while(true){
	
			System.out.print("Enter a string: ");
			String sentence = reader.nextLine();
			
			if(sentence.length()==0) break;
			
			if(isSentencePalindrome(sentence))System.out.println("The string is a palindrome.");
			else 
				System.out.println("The string is NOT a palindrome.");
		}
		reader.close();
	}
	/*
	 * Method name: isSentencePalindrome
	 * ---------------------------------
	 * This method receives a sentence as a parameter and runs a series of functions in order to
	 * determine whether the sentence is a palindrome or not. First the sentence is stripped off
	 * all special characters, and each letter is made lowercase. Then this new string value is put
	 * into a for loop which determines whether the letter at the front of the string value is the 
	 * same as the letter at the end. If this condition is true then for loop continues to test the 
	 * next characters in their respective order until all characters have been tested. If the test 
	 * is successful the method returns true, if the test fails the method returns false.
	 * Precondition: Receives a string as a parameter.
	 * Postcondition: Returns true if successful. Returns false is unsuccessful. 
	 */
	private static boolean isSentencePalindrome(String sentence) {

		String word = sentence.replaceAll("[\\s\\p{Punct}\\d]+", "").toLowerCase();
		
		for(int x = 0; x < (word.length()/2) + 1; x++){
			if(word.charAt(x) != word.charAt(word.length() - x - 1)){
				return false;
			}
		}		
		return true;
	}
}
