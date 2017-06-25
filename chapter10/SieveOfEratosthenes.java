/**
 * File name: SieveOfEratosthenes.java
 * -----------------------------------  
 * In the third century B.C.E., the Greek astronomer Eratosthenes developed an algorithm for finding
 * all the prime numbers up to some upper limit N. 
 * 
 * This programs generates a list of primes between 2 and 100 using the Sieve of Eratosthenes
 * method.
 
 * Programmer: Peter Lock
 * Date: 2-2-2-16
 */
package com.chapter10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
	
	public static void main(String[] args){
		
		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("This program generates prime numbers using the Seive of Eratosthenes algorthim.");
			System.out.println();
			System.out.print("Enter the number for n: ");
			
			String str = reader.readLine();
			System.out.println();
			System.out.println("The Prime numbers of [" + Integer.parseInt(str) + "] are: " + getPrimes(Integer.parseInt(str)));

		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	/*
	 * Method name: getPrimes
	 * ----------------------
	 * This method returns an array list of prime numbers for a given value
	 * Precondition: Receives an upper limit value as a parameter.
	 * Postcondition: Returns an array list containing the prime numbers.
	 * 
	 */
	public static List<Integer> getPrimes(int limit) {

	    List<Integer> list = new ArrayList<>();

	    boolean [] isComposite = new boolean [limit + 1]; 
	    // limit + 1 because we won't use the '0' index of the array
	    
	    isComposite[1] = true;

	    // Mark all composite numbers
	    for (int i = 2; i <= limit; i++) {
	        if (!isComposite[i]) {
	            // 'i' is a prime number
	            list.add(i);
	            int multiple = 2;
	            while (i * multiple <= limit) {
	                isComposite [i * multiple] = true;
	                multiple++;
	            }
	        }
	    }

	    return list;
	}


}
