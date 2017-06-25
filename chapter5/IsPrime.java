/**
 * File name: IsPrime.java
 * -----------------------
 * This class receives an integer from the user and returns true if the
 * integer is a prime number.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/16
 */

package com.chapter5;

import acm.program.ConsoleProgram;

public class IsPrime extends ConsoleProgram {
	
	public void run(){
		
		println("This program tells you if a number is a prime number or not.");
		
		
		int n=0;
		
		while(n !=-1){
			n = readInt("Enter a number: ");	
			
			if(n == -1){
				println("User terminated.");break;
			}
			
			if(ifPerfect(n))
				println("The number is prime.");
			else
				println("The number is NOT a prime.");			
		}
		
	}
	
	/**
	 * Method name: ifPerfect
	 * ----------------------
	 * @param n The number entered by the user.
	 * @return True if the number is a prime. False if the number is not.
	 * Using more efficient coding, we only need to go up to the square root
	 * of n, because if we list out all the factors of a number, the square
	 * will always be in the middle. The number 2 is the only even prime -
	 * because of this we need only check 2 separately, then traverse odd 
	 * numbers up to the square root of n. So we only need to check half of
	 * the integers up to the square root (the odd ones, really). 
	 */
	
	private boolean ifPerfect(int n) {

		if(n == 2) return true;
		
		if(n%2==0) return false;
		
		for(int i=3; i*i<=n; i+=2){
			if(n%i == 0) return false;
		}
		return true;
				
	}

}
