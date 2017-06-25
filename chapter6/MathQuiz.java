/**
 * File name: MathQuiz.java
 * ------------------------
 * This program poses a series of simple arithmetic questions for a student to answer.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/25
 */

package com.chapter6;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class MathQuiz extends ConsoleProgram{
	
	public void run(){
		
		println("Welcome to My Math Quiz");
		
		for(int i=0; i <NUMBER_OF_QUESTIONS; i++){
			boolean addition = rgen.nextBoolean();
			getQuestion(addition);
		}	
	}
	
	private void getQuestion(Boolean addition) {
		if(addition){
			getAddition();
		} else{
			getSubtraction();
		}
	}

	private void getSubtraction() {
		int n1 = rgen.nextInt(1, 20);
		int n2 = rgen.nextInt(1, 20);
		int attemptCount = 1;
		
		int answer=n1 - n2;
		
		while(answer < 0 ){
			n1 = rgen.nextInt(1,20);
			n2 = rgen.nextInt(1, 20);
			answer = n1 - n2;
		}
		
		int userAnswer = readInt("What is " + n1 + " - " + n2 + "? ");
		
		if(userAnswer == answer){
			getResponse();
		}
		else{
			while(attemptCount !=MAX_TRIES){
				attemptCount++;
				if(userAnswer == answer) {
					getResponse();
					return;
				} else userAnswer = readInt("That's incorrrect - try a different answer: ");
			}
			if(userAnswer == answer) getResponse();
			else{
				println("No, the answer is " + answer);
			}
		}		
	}

	private void getResponse() {
		
		int n1 = rgen.nextInt(1, 5);
		
		switch(n1){
		case 1: 
			println("Great ..");
			break;
		case 2:
			println("Awesome");
			break;
		case 3: 
			println("Fantastic");
			break;
		case 4: 
			println("Wow, Great!");
			break;
		case 5: 
			println("AMAZING work. Why are you so SMART? Are you a robot?");
			break;
		}		
	}

	private void getAddition() {
		int n1 = rgen.nextInt(1, 20);
		int n2 = rgen.nextInt(1, 20);
		int attemptCount = 1;
		
		int answer=n1 + n2;
		
		while(answer > 20 ){
			n1 = rgen.nextInt(1,20);
			n2 = rgen.nextInt(1, 20);
			answer = n1 + n2;
		}
		
		int userAnswer = readInt("What is " + n1 + " + " + n2 + "? ");
		
		if(userAnswer == answer){
			getResponse();
		}
		else{
			while(attemptCount !=MAX_TRIES){
				attemptCount++;
				if(userAnswer == answer) {
					getResponse();
					return;
				} else userAnswer = readInt("That's incorrrect - try a different answer: ");
			}
			if(userAnswer == answer) getResponse();
			else{
				println("No, the answer is " + answer);
			}
		}	
	}

	private final static int NUMBER_OF_QUESTIONS=20;
	private final static int MAX_TRIES=3;
	private RandomGenerator rgen = new RandomGenerator();

}
