/**
 * File name: StandardDeviation.java
 * ---------------------------------
 * This program inputs an array with a sample set of test scores as doubles
 * and returns the standard deviation of the data distribution contained in the 
 * array.
 * 
 * Programmer: Peter Lock
 * Date: 2-1-2016
 */

package com.chapter10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StandardDeviation {
	
	double MARKS_TOTAL;
	
	static int NSCORES=5;
	static double[] marks = new double[NSCORES];
	
	/* Runs the program*/
	public static void main(String[] args){
		
		try{
		
			BufferedReader reader =
					new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("This program calculates the Standard Deviation of a series of five test scores.");
			System.out.println();
			for(int i = 0; i < NSCORES; i++){		
				System.out.print("Enter the " + (i+1) + getSuffix(i+1) + " test score: ");
				marks[i] = Double.parseDouble(reader.readLine());
			}	
			
			NumberFormat formatter = new DecimalFormat("#0.00");

			System.out.println("The Standard Deviation for the data supplied is: " + formatter.format(getStandardDeviation(marks)));;
			
		}catch (Exception e){
			e.printStackTrace();
		}	
	}

	/*
	 * Method name: getStandardDeviation
	 * ---------------------------------
	 * This method calculates the standard deviation form a sample data set. If then returns the answer
	 * to the calling method.
	 * Precondition: Receives an array populated with sample data of type double from the calling method.
	 * Postcondition: Returns the standard deviation of the sample data set.
	 */
	private static double getStandardDeviation(double[] marks) {
		System.out.println();
		double mean=0;
		double total = 0;
		
		for(int i=0; i<marks.length; i++){
			mean+=marks[i];
		}
		
		mean = mean/NSCORES;
		System.out.println();
		
		double[] difference = new double[NSCORES];
		
		for(int i=0; i< marks.length; i++){
			difference[i] = marks[i]-mean;
			difference[i] = difference[i] * difference[i];
			total+=difference[i];
		}
		
		
		return Math.sqrt(total/NSCORES);
	}

	/*
	 * Method name: getSuffix
	 * ----------------------
	 * Returns the suffix for a number that it receives from the calling method of type integer.
	 * Precondition: Receives an integer from the calling method.
	 * Postcondition: Returns a String suffix to the calling method.
	 */
	private static String getSuffix(int num) {

		switch(num){
		case 1: return("st");
		case 2: return("nd");
		case 3: return("rd");
		}
		
		String number = String.valueOf(num);

		
		if(number.charAt(number.length()-1) == '1'){
			return("th");
		}
		
		if(number.charAt(number.length()-1) == '1')return ("st");
		if(number.charAt(number.length()-1) == '2')return ("nd");
		if(number.charAt(number.length()-1) == '3')return ("rd");
		else{
			return("th");
		}
	}
	
}