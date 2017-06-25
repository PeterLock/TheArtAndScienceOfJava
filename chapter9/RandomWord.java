/**
 * File name: RandomWord.java
 * --------------------------
 * This program generates random letters to form a random "word". The structure
 * of the random word is made up of random letters and contains no grammatical rules.
 * Also the length of each word is random.
 * 
 * Programmer: Peter Lock
 * Date: 20/1/2016
 */
package com.chapter9;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class RandomWord extends ConsoleProgram{

	public void run(){
		
		for(int x = 1; x<=5; x++){
			
			int num_letters = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
			System.out.print("Word " + x + " is: ");
			for(int i = 0; i < num_letters; i++){
				char c = (char)(rgen.nextInt(26) + 'a');
				System.out.print(c);
			}
			System.out.println("");
		}
	}	
	private static final int MIN_LETTERS = 1;
	private static final int MAX_LETTERS = 5;
	
	private RandomGenerator rgen = new RandomGenerator();
}
