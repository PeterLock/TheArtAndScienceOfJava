/*
 * File name: MorseCode
 * --------------------
 * This program reads a sentence in from the user and then displays the message
 * to the screen as MorseCode. The program displays each word of the message in 
 * MorseCode on separate lines.
 * 
 * Programmer: Peter Lock
 * Date: 3-2-2016
 */

package com.chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MorseCode {
	

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

	public static void main(String[] args){
		
		System.out.println("This program translates a line into Morse code.");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.print("Enter English text: ");
		
		try {
			String str = reader.readLine();
			
			System.out.println(str);

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
