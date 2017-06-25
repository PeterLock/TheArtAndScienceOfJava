/**
 * File name: Card.java
 * --------------------
 * This class includes the following entries:
 * 
 * Named constants for the four suits (CLUBS, DIAMONDS, HEARTS, SPADES)
 * and the four ranks (ACE, JACK, QUEEN, KING)
 * 
 * A constructor that takes a rank and suite and returns a Card with those values
 * 
 * Accessor methods getRank and getSuit to retrieve the rank and suit components
 * of the card.
 * 
 * An implementation of the toString method
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/25
 */

package com.chapter6;


public class Card {
	
	//Named constants for ranks
	public static final int ACE=1, JACK=11, QUEEN=12, KING=13;
	
	// Named constants for suits
	public static final int CLUBS=1, DIAMONDS=2, HEARTS=3, SPADES=4;

	/**
	 * Method name: Card
	 * -----------------
	 * @param rank Sets the value of the field 'rank'.
	 * @param suit Sets the value of the field 'suit'.
	 */
	public Card(int rank, int suit){
		cardRank = rank;
		cardSuit = suit;
	}
	/**
	 * Method name: getRank
	 * --------------------
	 * @return Returns the cardRank as an integer to the calling method.
	 */
	public int getRank(){
		return cardRank;
	}
	/**
	 * Method name: getSuit
	 * --------------------
	 * @return Returns the cardSuit as an integer to the calling method.
	 */
	public int getSuit(){
		return cardSuit;
	}
	/**
	 * Method name: toString
	 * ---------------------
	 * Returns the user input as a string e.g.: 1,2 returns ACE of DIAMONDS.
	 */
	public String toString(){
		return(rankName() + " of " + suitName());
	}
	/**
	 * Method name: rankName
	 * ---------------------
	 * @return Returns the string name of the cardRank.
	 */
	private String rankName() {
		switch(cardRank){
		case 1: return ("ACE");
		
		case 2: return("JACK");
		
		case 3: return("QUEEN");
		
		case 4: return("KING");
		
		default: return ("Invalid entry.");
		}
	}
	/**
	 * Method name: suitName
	 * ---------------------
	 * @return Returns the strong name of the cardSuit.
	 */
	private String suitName(){
		switch(cardSuit){
		case 1: return("CLUBS");
		
		case 2: return("DIAMONDS");
		
		case 3: return("HEARTS");
		
		case 4: return("SPADES");
		
		default: return("Invalid entry.");
		}
	}

	private int cardRank;
	private int cardSuit;

}
