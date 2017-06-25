/**
 * File name: IsPerfect.java
 * -------------------------
 * Greek mathematicians took a special interest in numbers that are equal
 * to the sum of their proper divisors (a proper divisor of n is any number
 * that is less the n). They called such numbers "perfect numbers"..
 * 
 * For example: 6 is a perfect number because it is the sum of 1,2, and 3,
 * which are the integers less than 6 that divide evenly into 6.
 * 
 * This program returns true if the integer n is perfect, false otherwise.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/17
 */

package com.chapter5;

import acm.program.ConsoleProgram;

public class IsPerfect extends ConsoleProgram {
	
	public void run(){
		
		println("This program tests for perfect numbers.");
		int x = readInt("Enter a number: ");
		
		if(testNumber(x)){
			println("---------------------------");
			println(x + " is a perfect number.");
		}
		else{
			println("---------------------------");
			println(x + " is not a perfect number.");
		}
		println("");
		println("List of perfect numbers less then 10,000.");
		getList();
	
	}
	
	private void getList() {
		
		println("");
		for(int j = 1; j<=10000; j++){
	
			int sum=0;
			/**
			 * For all of the numbers up to the number itself, divide it by
			 * each of (i). If the number is even then it is a divisible of 
			 * the number, as such is added to sum.
			 */
			for(int i=1; i<=j; i++){
				if( j%i == 0)
					sum+=i;
			}
			/**
			 * Divide sum by two, if the result is equal to the number entered
			 * by the user then it is a perfect number.
			 */
			if(sum/2 == j){
				println(j);
			}
			
		}
			
	}
	

	/**
	 * Method name: testNumber
	 * -----------------------
	 * This method receives an integer as a parameter and test whether
	 * it is a perfect number or not.
	 * @param x The number entered by the user.
	 * @return True if the number is perfect, false otherwise.
	 */
	private boolean testNumber(int x) {
		int sum=0;
		/**
		 * For all of the numbers up to the number itself, divide it by
		 * each of (i). If the number is even then it is a divisible of 
		 * the number, as such is added to sum.
		 */
		for(int i=1; i<=x; i++){
			if( x%i == 0)
				sum+=i;
		}
		/**
		 * Divide sum by two, if the result is equal to the number entered
		 * by the user then it is a perfect number.
		 */
		if(sum/2 == x){
			return true;
		}
		else
			return false;
	}

}
