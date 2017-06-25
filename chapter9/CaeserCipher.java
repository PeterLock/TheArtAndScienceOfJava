/**
 * File name: CaesarCipher.java
 * ----------------------------
 * This program demonstrates a simple caesar cipher.
 * 
 * Programmer: Peter Lock
 * Date: 25-1-2016
 */

package com.chapter9;

import java.util.Scanner;

import acm.program.ConsoleProgram;

public class CaeserCipher extends ConsoleProgram {

	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		System.out.println("This program encodes a message using a Caesar cipher.");
		System.out.print("Enter the number of character positions to shift: ");
		int shift = reader.nextInt();
		
		reader.nextLine();

		System.out.print("Enter a message: ");
		String message = reader.nextLine();
		
		String encoded = encodeString(message, shift);
		System.out.println(encoded);
		
		reader.close();
	}
	/*
	 * Method name: encodeString
	 * -------------------------
	 * This method encodes a string using a simple Caeser cipher. If the cipher reaches 'z'
	 * it goes back to the letter 'a' and continues. If the shift position is negative, it 
	 * encodes the message to the shift positions in reverse.
	 * Precondition: Receives the message and the number of shift positions as parameters.
	 * Postcondition: Returns the encoded message to the calling method.
	 */
	private static String encodeString(String str, int shift) {		
		String encoded = "";
		char temp = 0;
		
		for(int x=0; x<str.length(); x++ ){
			if(shift <0){
				temp = (char)(str.charAt(x) - shift);
			} else{
				temp = (char)(str.charAt(x) + shift);
			}	
			if( temp > 'z')
				encoded += (char)(str.charAt(x)- (26-shift));
			else
				encoded+= (char)(str.charAt(x) + shift);	
		}
		return (encoded);	
	}	
}
