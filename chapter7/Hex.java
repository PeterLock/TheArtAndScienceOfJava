/**
 * File name: Hex.java
 * -------------------
 * This program converts hexadecimal values to their decimal equivalents.
 * 
 */

package com.chapter7;

import acm.program.ConsoleProgram;

public class Hex extends ConsoleProgram {
	
	public void run(){
		println("This program converts hexadecimal values to their decimal equivalents.");
		println("Enter 0 to stop");
		String hex = "";
		while(true){
			hex = readLine("Enter a hexadecimal number: ");
			if(hex.endsWith("0")) break;
			int decimal = Integer.parseInt(hex, 16);
			println(hex + " hexadecimal = " + decimal + " decimal.");
		}
	}

}
