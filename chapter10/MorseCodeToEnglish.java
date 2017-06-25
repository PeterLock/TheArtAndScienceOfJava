/*
 * File name: MorseCodeToEnglish
 * --------------------
 * This program reads in MorseCode from the user and then displays the message
 * to the screen as English. The program displays each word of the message in 
 * English on separate lines.
 * 
 * Programmer: Peter Lock
 * Date: 10-3-2016
 */

package com.chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MorseCodeToEnglish {
	
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	private static final String[] MORSE_CODE = {
			"._ ", //A 
			"_... ", //B
			"_._. ", //C
			"_.. ", //D
			". ", //E
			".._. ", //F
			"__. ", //G
			".... ", //H
			".. ", //I
			".___ ", //J
			"_._ ", //K
			"._.. ", //L
			"__ ", //M
			"_. ", //N
			"___ ", //O
			".__. ", //P
			"__._ ", //Q
			"._. ", //R
			"... ", //S
			"_ ", //T
			".._ ", //U
			"..._ ", //V
			".__ ", //W
			"_.._ ", //X
			"_.__ ", //Y
			"__.. " //Z
			};
	
			private static final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();

	public static void main(String[] args) throws IOException{
				
		
		System.out.println("For English --> MorseCode, press 1:");
		System.out.println("For MorseCode --> English, press 2:");
		
		String input = reader.readLine();
		
		System.out.println(input);
		
		if(input.equals("1")){
			EnglishToMorse();
		}
		if(input.equals("2")){
			MorseToEnglish();
		}
		
				
	}

	private static void MorseToEnglish() {
		System.out.println("You chose Morse to English. Seperate letters with a space. Sperate words with a \"\"");	
		System.out.print("Enter MorseCode: ");
		
		try {
			String str = reader.readLine();
			
			for(int i=0; i<str.length(); i++){
				
				if(Character.isWhitespace(str.charAt(i))) System.out.println();
				
				for(int x=0; x<MORSE_CODE.length; x++){
					
					if(Character.toLowerCase(str.charAt(i)) == (ALPHABET[x])){
						System.out.print(MORSE_CODE[x]);
					}		
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void EnglishToMorse() {
		System.out.print("Enter English text: ");
		
		try {
			String str = reader.readLine();
			
			for(int i=0; i<str.length(); i++){
				
				if(Character.isWhitespace(str.charAt(i))) System.out.println();
				
				for(int x=0; x<ALPHABET.length; x++){
					
					if(Character.toLowerCase(str.charAt(i)) == (ALPHABET[x])){
						System.out.print(MORSE_CODE[x]);
					}		
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
