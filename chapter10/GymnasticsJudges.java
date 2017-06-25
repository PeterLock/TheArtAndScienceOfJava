/*
 * File: GymnasticsJudges.java
 * ---------------------------
 * This file reads an array of scores and computes the average.
 * 
 * Programmer: Peter Lock
 * Date: 27-1-2016
 */

package com.chapter10;

import acm.program.ConsoleProgram;

public class GymnasticsJudges extends ConsoleProgram {

	/**Runs the program*/
	public void run(){
		
		this.setSize(600, 250);
		
		int nJudges = readInt("Enter the number of judges: ");
		double[] scores = new double[nJudges];
		
		for(int i=0; i<nJudges; i++){
			scores[i] = readInt("Enter score for judge " + (i+1) + ": ");
		}
		
		double total = 0;
		for(int i=0; i<nJudges; i++){
			total+=scores[i];
		}
		double averageScore = total / nJudges;
		println("The average score is " + averageScore);
		
	}
	
}
