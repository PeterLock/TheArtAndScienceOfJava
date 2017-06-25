/**
 * File name: GymnasticsJudgesAverageWithoutBias.java
 * --------------------------------------------------
 * Because individual judges may have bias, it is common practice to throw out the highest and lowest scores 
 * before calculating the average. This program does just that. It prompts the user to  enter the number of 
 * judges and each respective score, removes the highest and lowest score and then computes the average.
 * 
 * Programmer: Peter Lock
 * Date: 1-2-2016
 */

package com.chapter10;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import acm.program.ConsoleProgram;

public class GymnasticsJudgesAverageWithoutBias extends ConsoleProgram{
		
	private static double lowest = 0;
	private static double highest = 0;
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args){
		
		double[] scores;
		double total = 0;
		
		System.out.println("This program computes the average test score from a number of judges.");
		System.out.print("Enter the number of judges: ");
		
		int nJudges = reader.nextInt();
				
		scores = new double[nJudges];	
		inputScores(scores, nJudges);
		total = getTotal(scores, nJudges);
		
		System.out.println();
		printScores(scores, nJudges);
		
		System.out.println();
		System.out.println("The lowest score is: " + getLowestScore(scores, nJudges));
		System.out.println("The highest score is: " + getHighestScore(scores, nJudges));
		
		NumberFormat formatter = new DecimalFormat("#0.00");
		System.out.println();
		System.out.println("The average score is:  " + formatter.format(getAverage(nJudges-2, total)));
		
		reader.close();
	}	
	/*
	 * Method name: getAverage
	 * -----------------------
	 * This method returns the average to the calling method.
	 * Precondition: Receives the number of judges and the total score as parameters.
	 * Postcondition: Returns the average to the calling method.
	 */
	private static double getAverage(int nJudges, double total) {

		double nTotal = total - (highest+lowest);
		
		return nTotal/nJudges;
	}
	/*
	 * Method name: getHighestScore
	 * ----------------------------
	 * This method returns the highest score in the array to the calling method.
	 * Precondition: Receives the array reference and number of judges as parameters.
	 * Postcondition: Returns the highest score to the calling method.
	 */
	private static double getHighestScore(double[] scores, int nJudges) {
		
		double value = scores[0];
		
		for(int i=1; i<scores.length; i++){
			if(scores[i] > value) value=scores[i];
		}
		highest = value;	
		return value;
	}
	/*
	 * Method name: getTotal
	 * ---------------------
	 * This method calculates the total of all of the scores and returns the answer to the 
	 * calling method.
	 * Precondition: Receives the array reference and number of judges as parameters.
	 * Postcondition: Returns the total of all scores to the calling method.
	 */
	private static double getTotal(double[] scores, int nJudges) {
		int total = 0;
		for(int i=0; i<scores.length; i++) total += scores[i];	
		return total;
	}
	/*
	 * Method name: getLowestScore
	 * ------------------------------
	 * ----------------------------
	 * This method returns the lowest score in the array to the calling method.
	 * Precondition: Receives the array reference and number of judges as parameters.
	 * Postcondition: Returns the lowest score to the calling method.
	 */
	private static double getLowestScore(double[] scores, int nJudges) {
		
		double value = scores[0];
		
		for(int i=1; i<scores.length; i++){
			if(scores[i] < value) value=scores[i];
		}
		lowest = value;
		return value;
	}
	/*
	 * Method name: printScores
	 * ------------------------
	 * This method prints the scores to the screen.
	 * Precondition: Receives the array reference and number of judges as parameters.
	 * Postcondition: Prints each judges score to the screen.
	 */
	private static void printScores(double[] scores, int nJudges) {
		for(int i=0; i<scores.length; i++){
			System.out.println("Judge [" + (i+1) + "] score is: " + scores[i]);
		}
	}
	/*
	 * Method name: inputScores
	 * ------------------------
	 * This method prompts the user to enter each judges score.
	 * Precondition: Receives the scores array reference and the number of judges as parameters.
	 * Postcondition: Returns void.
	 */
	private static void inputScores(double[] scores, int nJudges) {
		for(int i = 0; i<scores.length; i++){
			System.out.print("Enter judge [" + (i+1 )+ "] score: ");
			scores[i] = reader.nextDouble();
		}
	}

}
