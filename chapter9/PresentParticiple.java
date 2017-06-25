/**
 * File name: PresentParticiple.java
 * ---------------------------------
 * This program takes an English verb and forms the participle using these rules:
 * 
 * a. If the word ends in an e preceded by a consonant, take the e away before adding the ing suffix. 
 * Thus, move should become moving. If the e is not preceded by a consonant,
 * it should remain in place, so that see becomes seeing.
 * b. If the word ends in a consonant preceded by a vowel, insert an extra copy of that consonant 
 * before adding the ing suffix. Thus, jam should become jamming. If, however, there is more than one 
 * consonant at the end of the word, no such doubling takes place, so that walk becomes walking.
 * c. In all other circumstances, simply add the ing suffix.
 * 
 * Programmer: Peter Lock
 * Date: 25-1-2016
 */

package com.chapter9;

import java.util.Scanner;

import acm.program.ConsoleProgram;

public class PresentParticiple extends ConsoleProgram {
	
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a verb: ");
		
		String word = reader.next();
		runtTest(word);
		
		reader.close();		
	}

	private static void runtTest(String word) {
		
		int flag=0;
		/*
		 * Tests for condition a. If the word ends in an e preceded by a consonant, takes away the e before adding
		 * the ing suffix. If the e is not preceded by a consonant, the e remains in place and the ing suffix is added.
		 */
		switch(word.charAt(word.length()-1)){
		case 'e': {
			if((word.charAt(word.length()-2) != 'a') && (word.charAt(word.length()-2) != 'e') && (word.charAt(word.length()-2) != 'i') && 
					(word.charAt(word.length()-2) != 'o') && (word.charAt(word.length()-2) != 'u')){				
				System.out.print("The participle is: ");
				for(int x=0; x<word.length()-1; x++){
					System.out.print(word.charAt(x));
				}
				System.out.print("ing");
			}
			flag=1;
			break;
			}
		}	
		/*
		 * Tests for condition b. If the word ends in a consonant preceded by a vowel, inserts an extra copy of that consonant 
		 * before adding the ing suffix. Thus, jam should become jamming. If, however, there is more than one consonant at the 
		 * end of the word, no such doubling takes place, so that walk becomes walking.
		 */
		if(flag==0){
			if((word.charAt(word.length()-1) != 'a') && (word.charAt(word.length()-1) !='e') && (word.charAt(word.length()-1) != 'i') &&
					(word.charAt(word.length()-1) !='o') && (word.charAt(word.length()-1) !='u') && (word.charAt(word.length()-1) != 'y') &&
									
					(word.charAt(word.length()-2) == 'a') || (word.charAt(word.length()-2) =='e') || (word.charAt(word.length()-2) == 'i') ||
					(word.charAt(word.length()-2) =='o') || (word.charAt(word.length()-2) =='u')){
				System.out.print(word.concat(word.charAt(word.length()-1) + "ing"));
			} else{
				System.out.print(word.concat("ing"));
			}			
		}		
	}
}
