/**
 * File name: Wrapper.java
 * -----------------------
 * This class contains a test area for playing with wrapper classes.
 * 
 * Programmer: Peter Lock
 */
package com.chapter7;

import acm.program.ConsoleProgram;

public class Wrapper extends ConsoleProgram{
	public void run(){
		
		Integer five = new Integer(5);
		
		println(five);
				
		println(five.byteValue());
		
		println(five.intValue());
		
	}
}
