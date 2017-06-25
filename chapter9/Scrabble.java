/**
 * File name: Scrabble.java
 * ------------------------
 * In most word games, each letter in a word is scored according to its point value, 
 * which is inversely proportional to its frequency in English words. 
 * In ScrabbleTM, the points are allocated as follows:
 * 
 * Points Letters
 * For example, the Scrabble word "FARM" is worth 9 points: 4 for the F, 1 each for the
 * A and the R, and 3 for the M.
 * 
 * This program ignores characters other than uppercase letters in computing the score.
 * In particular, lowercase letters are assumed to represent blank tiles in scrabble, which
 * stand for any letter but which have a score of 0.
 * 
 * Programmer: Peter Lock
 * Date: 22-1-2016
 */

package com.chapter9;

import java.util.Scanner;

public class Scrabble{
	
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		
		String input = reader.next();
		System.out.println("The scrabble score for " + input + " is " + getScore(input));
		
	}
	/*
	 * Method name: getScore
	 * ---------------------
	 * Returns the score of the word it receives as a parameter.
	 * Precondition: Receives a word as a parameter.
	 * Postcondition: Returns the score to the calling method.
	 */
	private static int getScore(String input) {
		
		int length = input.length();
		int score = 0;
		
		for(int x = 0; x < length; x++){
			switch(input.charAt(x)){
			case 'A': case 'E': case 'I': case 'L': case 'N': case 'O': case 'R': case 'S': case 'T': case 'U': {
				score+=1;
				break;
			}
			case 'D': case 'G': {
				score +=2;
				break;
			}
			case 'B': case 'C': case 'M': case 'P': {
				score +=3;
				break;
			}
			case 'F': case 'H': case 'V': case 'W': case 'Y': {
				score+=4;
				break;
			}
			case 'K': {
				score+=5;
				break;
			}
			case 'J': case 'X': {
				score+=8;
				break;
			}
			case 'Q': case 'Z': {
				score+=10;
				break;
			}
			default: break;
			}
		}		
		return score;
	}

}