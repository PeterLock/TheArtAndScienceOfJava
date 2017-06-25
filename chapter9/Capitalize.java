/**
 * File name: Capitalize.java
 * --------------------------
 * This program reads in text from the user,　capitalizes the first letter
 * and then proceeds to make the remaining letters in the text lowercase.
 * 
 * Programmer: Peter Lock
 * Date:21.1.2016
 */
package com.chapter9;

import acm.program.ConsoleProgram;

public class Capitalize extends ConsoleProgram {
	
	public void run(){
		
		String word = readLine("Enter a word: ");
		
		capitalize(word);
		
	}

	private void capitalize(String word) {
		int length = word.length();
		
		println("");
		for(int x = 0; x< length; x++){
						if(x==0){
							print(Character.toUpperCase(word.charAt(0)));
						} else{
							print(Character.toLowerCase(word.charAt(x)));
						}
		}
	}


}
