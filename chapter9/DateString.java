/**
 * File　name: DateString
 * ----------------------
 * This program receives date values as a parameter and then prints
 * the date to the screen using a set format.
 * 
 * Programmer: Peter Lock
 * Date: 21.1.2016
 */

package com.chapter9;

import acm.program.ConsoleProgram;

public class DateString extends ConsoleProgram {
	
	public void run(){
		
		this.setSize(600, 300);
		
		int date = readInt("Enter the date: ");
		int month = readInt("Enter the month: ");
		String year = readLine("Enter the year: ");
		
		dateString(date, month, year);
		
	}
	/*
	 * Method name: dateString
	 * -----------------------
	 * Receives three values as parameters representing dates and outputs the date
	 * using a suitable format.
	 * Precondition: Receives 2 integers and a string as parameters.
	 * Postcondition: Prints the formatted date to the screen.
	 */
	private void dateString(int date, int month, String year) {
		println(date + "-" + getMonth(month) + "-" + year.charAt(2) + year.charAt(3));
	}
	/*
	 * Method name: getMonth
	 * ---------------------
	 * Returns the month in text form. Receives the month number as an integer.
	 * Precondition: Receives the month as an integer.
	 * Postcondition: Returns the month as a string.
	 */
	private String getMonth(int month) {
		switch(month){
		case 1: return("Jan");
		case 2: return("Feb");
		case 3: return("Mar");
		case 4: return("Apr");
		case 5: return("May");
		case 6: return("Jun");
		case 7: return("Jul");
		case 8: return("Aug");
		case 9: return("Sep");
		case 10: return("Oct");
		case 11: return("Nov");
		case 12: return("Dec");
		}
		return null;
	}

}
