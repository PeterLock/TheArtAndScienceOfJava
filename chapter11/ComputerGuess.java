package com.chapter11;

import java.util.Scanner;

public class ComputerGuess {

	public static void main (String [] args) {
	
		int min = 1;
		int max = 100;
		int number = 0;
		int start = 1;
		int range = 1 - 100;
		
		Scanner scan = new Scanner(System.in);

	   while (start==1)
		{
			System.out.println("Enter your number (between " + min + 
				 " and " + (max) + "): ");

		   //user entered number
			number = scan.nextInt();

		   
			if (number < min || number >= max) {
				System.out.println("That number is not between " + min + " and " + (max));
			}
			else {
				break;
			}
		}

		int computerGuess = (max+min)/2;
		
		int count = 1;

		while (number != computerGuess) 
		{

			if (computerGuess < number) {
		   
				min = computerGuess;
				computerGuess = (max+min)/2;
			}
			else {
			
				max = computerGuess;
				computerGuess = (max+min)/2;
			}
			System.out.println(computerGuess);
			count++;
		}

		System.out.println("Computer found the right answer: " + computerGuess +
				", in " + count + " guesses");

	}
}
