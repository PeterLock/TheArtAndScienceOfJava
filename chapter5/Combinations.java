/**
 * File name: Combinations.java
 * ----------------------------
 * This program computes the mathematical combinations function
 * C(n,k), which is the number of ways of selecting k objects
 * from a set of n distinct objects.
 */
package com.chapter5;

import acm.program.ConsoleProgram;

public class Combinations extends ConsoleProgram  {

	/* Runs the progrm */
	public void run(){
		int n = readInt("Enter the number of objects in the set (n): ");
		int k = readInt("Enter the number to be chosen (k): ");
		println("C(" + n + ", " + k + ")= " + combinations(n, k));
	}

	/**
	 * Returns the mathematical combinations function C(n,k), which is 
	 * the number of ways of selecting k objects from a set of n distinct
	 * objects.
	 * 
	 * @param n The number of objects in the set.
	 * @param k The number of objects to be chosen.
	 * @return Returns the result.
	 */
	private int combinations(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n-k));
	}

	private int factorial(int k) {
		int result = 1;
		for(int i=1; i <= k; i++){
			result *=i;
		}
		return result;
	}
	
}
