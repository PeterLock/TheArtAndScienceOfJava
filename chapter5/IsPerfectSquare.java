/**
 * File name: IsPerfectSquare.java
 * -------------------------------
 * This is a predicate method that returns true if the integer n is a perfect square.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/15
 * 
 */
package com.chapter5;
import acm.program.ConsoleProgram;

public class IsPerfectSquare extends ConsoleProgram {
	
	public void run(){
		
		println("This program returns true if the number entered is a perfect square.");
		boolean answer = getNumber();
		
		if(answer)println("The number is a perfect square.");
		else println("Bad Times.");
				
	}

	private boolean getNumber() {
		
		int x = readInt("Enter an integer: ");
		
		if(Math.sqrt(x) % 1 == 0)
			return true;
		
		return false; 
	}

}
