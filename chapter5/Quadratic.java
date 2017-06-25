/**
 * File name: Quadratic.java
 * -------------------------
 * In high-school algebra, you learned that the standard quadratic 
 * equation ax2 +bx+c=0 has two solutions given by the formula 
 * 
 * x=–b±⎯√⎯b⎯⎯–⎯4⎯ac
 * -------------
 *       2a
 *       
 * 
 * The first solution is obtained by using + in place of ±; the second 
 * is obtained by using – in place of ±.
 * 
 * This program accepts values for a, b, and c, and then calculates the
 * two solutions. If the quantity under the square root sign is negative,
 * the equation has no real solution and displays a message to that effect.
 *
 * Coder: Peter Lock
 * Date: 2015/12/12
 */
package com.chapter5;

import acm.program.ConsoleProgram;

public class Quadratic extends ConsoleProgram {
	
	public void run(){
		
		getCoefficients();

	}

	private void getCoefficients() {

		println("Enter coefficients for the quadratic equation: ");
		
		int a = readInt("a: ");
		int b = readInt("b: ");
		int c = readInt("c: ");
		
		double solution1 = getFirstSolution(a,b,c);
		double solution2 = getSecondSolution(a,b,c);
		
		if(Double.isNaN(solution1) || (solution1 == 0)){
			println("The number under the SQR ROOT is negative, as such no real "
					+ "answer exists.");		}
		else{
			println("The first solution is " + solution1);
		}
		
		if(Double.isNaN(solution2) || (solution1 == 0)){
			println("The number under the SQR ROOT is negative, as such no real "
					+ "answer exists.");		}
		else{
			println("The second solution is " + solution2);
		}

	}
	private double getSecondSolution(int a, int b, int c) {
		return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);	
	}

	/**The first solution returns the answer wherein the formula
	 *  	x =  −b + √(b2 − 4ac)
	 * 				2a
	 * 
	 * An Example.     
	 * Coefficients are:	 	a = 5, b = 6, c = 1
	 * 	 	 
	 * Quadratic Formula:	 	x =  −b ± √(b2 − 4ac)
	 * 									2a
	 *  	 
	 * Put in a, b and c:	 	x =  −6 ± √(62 − 4×5×1)
	 * 									 2×5
	 *  
	 * Solve: x =  −6 ± √(36 − 20)
	 * 					10
	 *  
	 *	 	x =  −6 ± √(16)
	 *			  10
	 *
	 *	 	x =  −6 ± 4
	 *			 10
	 *
	 *	 	x = −0.2 or −1
	 */
	
	private double getFirstSolution(int a, int b, int c) {		
		return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	}
}
