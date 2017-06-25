/*
 * File name: Histogram.java
 * -------------------------
 * This program reads in an array of numbers and then displays a histogram of those
 * numbers, divided into the ranges: 0-9, 10-19, 20-29, 30-39 -> 100.
 * 
 * NOTE: Program words but contains terrible code style.
 * 
 * Programmer: Peter Lock
 * Date: 3-2-2-16
 */

package com.chapter10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Histogram {
	
	private static int[] dataSample = { 100, 95, 47, 88, 86, 88, 92, 75, 70, 70, 55, 80 };
	private static String[] rangeSample = { " 0-9  |", "10-19 |", "20-29 |", "30-39 |", "40-49 |"
			, "50-59 |", "60-69 |", "70-79 |" , "80-89 |", "90-99 |", "100   |"};
	
	public static void main(String[] args){
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<rangeSample.length; i++){
			System.out.print(rangeSample[i] + getDistribution(i));
			System.out.println();
		}		
		
	}

	/*
	 * Method name: getDistribution
	 * ----------------------------
	 * Precondition: Receives an index value as a parameter.
	 * Postcondition: Returns a string containing the distribution pattern.
	 */
	private static String getDistribution(int i) {
		
		String stars = "";
		
		switch(i){
		case 0: {
			for(int x = 0; x<dataSample.length; x++){
				if( dataSample[x] <=9){
					stars = stars + "*";
				}
			}	
			break;
		}
		case 1: {
			for(int x = 0; x<dataSample.length; x++){
				if( dataSample[x] >=10 && dataSample[x] <=19){
					stars = stars + "*";
				}
			}	
			break;
		}
		case 2: {
			for(int x = 0; x<dataSample.length; x++){
				if( dataSample[x] >=20 && dataSample[x] <=29){
					stars = stars + "*";
				}
			}
			break;
		}
		case 3: {
			for(int x = 0; x<dataSample.length; x++){
				if( dataSample[x] >=30 && dataSample[x] <=39){
					stars = stars + "*";
				}
			}	
			break;
		}
		case 4: {
			for(int x = 0; x<dataSample.length; x++){
				if( dataSample[x] >=40 && dataSample[x] <=49){
					stars = stars + "*";
				}
			}
			break;
		}
		case 5: {
			for(int x = 0; x<dataSample.length; x++){
				if( dataSample[x] >=50 && dataSample[x] <=59){
					stars = stars + "*";
				}
			}
			break;
		}
		case 6: {
			for(int x = 0; x<dataSample.length; x++){
				if( dataSample[x] >=60 && dataSample[x] <=69){
					stars = stars + "*";
				}
			}	
			break;
		}
		case 7: {
			for(int x = 0; x<dataSample.length; x++){
				if( dataSample[x] >=70 && dataSample[x] <=79){
					stars = stars + "*";
				}
			}	
			break;
		}
		case 8: {
			for(int x = 0; x<dataSample.length; x++){
				if( dataSample[x] >=80 && dataSample[x] <=89){
					stars = stars + "*";
				}
			}
			break;
		}
		case 9: {
			for(int x = 0; x<dataSample.length; x++){
				if( dataSample[x] >=90 && dataSample[x] <=99){
					stars = stars + "*";
				}
			}	
			break;
		}
		case 10: {
			for(int x = 0; x<dataSample.length; x++){
				if( dataSample[x] == 100){
					stars = stars + "*";
					}
				}	
			break;
			}

		}
		return stars;	
	}

}
