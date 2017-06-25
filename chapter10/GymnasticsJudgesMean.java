/*
 * File name: GymnasticsJudgesMean.java
 * ------------------------------------
 * This program calculates the mean as a double of the average of a sample
 * set of test scores.
 * 
 * Programmer: Peter Lock
 * Date: 2-1-2016
 */

package com.chapter10;

import acm.program.ConsoleProgram;

public class GymnasticsJudgesMean extends ConsoleProgram{
	
	private static int nJudges=0;
	
	/**Runs the program*/
	public void run(){
		
		this.setSize(600, 250);
		
		nJudges = readInt("Enter the number of judges: ");
		double[] scores = new double[nJudges];
		
		for(int i=0; i<nJudges; i++){
			scores[i] = readInt("Enter score for judge " + (i+1) + ": ");
		}
				
		println("The average score is " + mean(scores));
		
	}

	/*
	 * Method name: mean
	 * -----------------
	 * This method returns the mean of an arrays set data.
	 * Precondition: Receives the array reference as a parameter.
	 * Postcondition: Returns the mean to the calling method.
	 */
	private double mean(double[] scores) {
		double total = 0;
		for(int i=0; i<nJudges; i++){
			total+=scores[i];
		}
		double averageScore = total / nJudges;
		
		return averageScore;
	}

}
