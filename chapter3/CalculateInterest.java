/* File: CalculateInterest.java
 * ---------------------------
 * This program calculates a compounded interest rate after asking the user
 * for their initial balance and for their interest rate.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/24
 * 
 *
 *--------FORMULA NOTATION ---------
 *
 * To calculate the compound interest and total amount we need to use the 
 * following formula:
 * 
 * Principal (P) = $10000
 * 
 * Rate (R) = 6%
 * 
 * Compound Interest(CI) = {Rate/100xPrincipal} + Principal
 * 
 * = (6/100x10000)+10000
 * 
 * = $10600
 * 
 */

package com.chapter3;

import java.text.DecimalFormat;

import acm.program.ConsoleProgram;

/* Class name: CalculateInterest2
 * 
 * This class calculates the compounded interest after receive the principal amount
 * and interest rate from the user
 */
public class CalculateInterest extends ConsoleProgram {
	
	public void run(){
		
		double balance = getBalance();	
		double interestRate = getInterestRate();
		
		displayResults(balance, interestRate);
		
	}
	
	/* Method name: getInterestRate
	 * 
	 * This method reads the interest rate from the user
	 * Precondition: none
	 * Postcondition: returns the interest rate to the calling function
	 */
	private double getInterestRate() {

		double interest = readDouble("Enter annual interest rate: ");
		
		return interest;
	}

	/* Method name: displayResults
	 * 
	 * This method receives the principal and rate and then calculates the
	 * annual balance. This figure is then displayed
	 * to the screen
	 * Precondition: Receives the principal amount, and interest rate as parameters.
	 * Postcondition: Sends the calculated annual balance to the screen.
	 */
	private void displayResults(double balance, double interestRate) {

		double balanceAfterOneYear;
		
		balanceAfterOneYear = (interestRate/100)*balance + balance;
		
		DecimalFormat df = new DecimalFormat("####0.00");
		
		println("Balance after one year = $" + df.format(balanceAfterOneYear));
		
	}
	
	/* Method name: getPrincipal
	 * 
	 * This method prompts the user to enter a balance
	 * Precondition: none.
	 * Postcondition: Returns the principal to the calling function
	 * 
	 */
	private float getBalance() {
		
		double balance = readDouble("Enter starting balance: ");
				
		return (float) balance;
	}

}
