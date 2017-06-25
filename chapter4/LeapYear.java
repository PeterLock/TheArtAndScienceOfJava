/* File name: LeapYear.java
 * ------------------------
 * This program checks to see if a year entered by the user is 
 * a leap year or not.
 * 
 * Coder: Peter Lock
 * Date:2015/11/28
 */
package com.chapter4;

import acm.program.ConsoleProgram;


/* Class name: LeapYear
 * --------------------
 * Checks for a leap year
 */
public class LeapYear extends ConsoleProgram{

	public void run(){
		println("This program checks for a leep year.");
		int year = readInt("Enter the year: ");
		boolean isLeapYear = ((year % 4 == 0) && (year %100 != 0) 
				|| year %400 == 0);
		
		if(isLeapYear){
			println( year + " is a leap year.");
		}
		else{
			println( year + " is not a leap year.");
		}
	}
	
}
