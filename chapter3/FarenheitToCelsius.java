/* File: FarenheitToCelciue.java
 * -----------------------------
 * This program converts Fahrenheit to Celsius
 * 
 * Coder: Peter Lock
 * Date: 2015/11/25
 * 
 * ------FORMULA REMINDER------
 * 
 * To convert farenheit to celsius:
 * 
 * [C] = ([F] - 32) x 5/9
 * [F] = ([C] x 9/5 + 32
 */

package com.chapter3;

import java.text.DecimalFormat;

import acm.program.ConsoleProgram;

/* Class name: FarenheitToCelsius
 * This class converts farenheit to celsius
 */
public class FarenheitToCelsius extends ConsoleProgram {
	
	public void run(){
		
		double userInput = showMessage();
		double answer = performCalculation(userInput);
		displayAnswer(userInput, answer);
		
			
	}

	/* Method name: displayAnswer
	 * --------------------------
	 * This method receives two parameters, userInput, and, answer. It then
	 * sends the answer to the screen formatted to 2 decimal places
	 * precondition: receives 2 parameters from the calling method, userInput, and, answer
	 * postcondition: Prints the answer to the screen in a simple message
	 */
	private void displayAnswer(double userInput, double answer) {
		
		DecimalFormat df = new DecimalFormat("####0.00");
		
		println(userInput + " degrees farenheit = " + df.format(answer) + " degrees celsius");
	}
	/* Method name: performCalculation
	 * -------------------------------
	 * This method calculates the conversion of farenheit to celsius
	 * precondition: receives the userInput from the calling method as a parameter
	 * postcondition: returns the result to the calling method.
	 */
	private double performCalculation(double userInput) {

		double result = (userInput-32)/1.8;
		
		return result;
	}

	/* Method name: showMessage
	 * ------------------------
	 * This method shows the initial message to the screen asking the user to 
	 * enter a temperature in farenheit to be converted to celsius.
	 * precondition: none;
	 * postcondition: returns the userInput to the calling method.
	 */
	private double showMessage() {
		println("This program converts farenheit -> celsius");
			
		double userInput = readDouble("Enter the temperature (F): ");
		
		return userInput;
		
	}

}
