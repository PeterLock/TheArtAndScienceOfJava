/* File: CalculateInterest2.java
 * -----------------------------
 * This program is an extension of CalculateInterest.java.
 * 
 *Coder: Peter Lock
 *Date: 2015/11/25 
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
public class CalculateInterest2 extends ConsoleProgram {
	
	public void run(){
		
		int principal = getPrincipal();	
		double interestRate = getInterestRate();
		
		displayResults(principal, interestRate);
		
	}
	
	/* Method name: getInterestRate
	 * 
	 * This method reads the interest rate from the user
	 * Precondition: none
	 * Postcondition: returns the interest rate to the calling function
	 */
	private double getInterestRate() {

		double rate = readDouble("Enter annual interest rate: ");
		
		return rate;
	}

	/* Method name: displayResults
	 * 
	 * This method receives the principal and rate and then calculates the
	 * annual balance and second year balance. These figures are then displayed
	 * to the screen
	 * Precondition: Receives the principal amount, and interest rate as parameters.
	 * Postcondition: Sends the calculated annual balance and second year balance to the screen.
	 */
	private void displayResults(double principal, double rate) {

		double annualBalance;
		double secondYearBalance;
		
		annualBalance = (rate/100)*principal + principal;
		
		DecimalFormat df = new DecimalFormat("####0.00");
		
		println("Balance after one year = $" + df.format(annualBalance));
		
		secondYearBalance = (rate/100)*annualBalance + annualBalance;
		println("Balance after the second year = $" + df.format(secondYearBalance));
		
	}

	/* Method name: getPrincipal
	 * 
	 * This method prompts the user to enter a balance
	 * Precondition: none.
	 * Postcondition: Returns the principal to the calling function
	 * 
	 */
	private int getPrincipal() {
		
		int principal = readInt("Enter starting balance: ");
				
		return (int) principal;
	}
	
	final static int ONE_YEAR=1;
	final static int TWO_YEARS=2;

}