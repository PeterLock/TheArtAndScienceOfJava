/* File: ConvertKilogramsToPounds.java
 * -----------------------------------
 * This program converts kilograms to pounds and ounces.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/25
 * 
 * ----FORMULA REMINDER------
 * lbs/2.2 = kilograms (2.20462262185)
 * kg x 2.2 = pounds
 * 
 * 1 kilogram = 2.2 pounds
 * 1 pound = 16 ounces
 * 1 kilogram = 35.2 ounces
 */
package com.chapter3;

import java.text.DecimalFormat;

import acm.program.ConsoleProgram;


/* Class name: ConvertKilogramsToPounds
 * ------------------------------------
 * This class converts kilograms to pounds.
 */
public class ConvertKilogramsToPounds extends ConsoleProgram{
	
	public void run(){
		
		double userInput = displayMessage();
				
		converToPounds(userInput);	
	}

	/* Method: convertToPounds
	 * -----------------------
	 * This method converts kilograms to pounds.
	 * Precondition: Receives the number entered by the user which will be converted
	 * into pounds as a parameter.
	 * Postcondition: Prints the results to the screen.
	 */
	private void converToPounds(double userInput) {

		double pounds =  (userInput * CONVERSION_KILO_RATIO);
		println(userInput + "kg = " + pounds + " pounds");
		
		// Isolate the numbers after the decimal place, nominal data loss.
		double remainder = pounds % 1;
		
		//Calculate the remaining ounces
		double remainingOunces = remainder * CONVERSION_OUNCES_RATIO;
		
		/* Format the output pounds to 4 places, format the output for ounces
		 * to 3 decimal places
		 */
		DecimalFormat dfPounds = new DecimalFormat("####");
		DecimalFormat dfOunces = new DecimalFormat("#.000");
		
		//Print the remainder to screen for test and comparison purposes
		println("Remainding ounces: " + remainingOunces);
		
		//Print the results, including formatting
		println(userInput + " kgs = " + dfPounds.format(pounds) + " pounds and " + 
		dfOunces.format(remainingOunces) + " ounces");		
	}

	/* Method: displayMessage
	 * ----------------------
	 * This method displays a simple instruction for the user to the screen
	 * Precondition: none.
	 * Postcondition: Returns the users input to the calling method. 
	 */
	private double displayMessage() {

		println("This program converts kilograms to pounds and ounces.");
		double userInput = readDouble("Enter the number of kilograms to convert: ");
		
		return userInput;
	}

	final static double CONVERSION_KILO_RATIO= 2.20462262185;
	final static double CONVERSION_OUNCES_RATIO=16;
}
