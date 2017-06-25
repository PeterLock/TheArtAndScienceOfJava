/**
 * File name: EmbeddedInteger.java
 * -------------------------------
 * This class allows its clients to treat an integer as an object.
 * The underlying integer value is set using setValue and returned using
 * getValue.
 */

package com.chapter7;

public class EmbeddedInteger {
	
	/**
	 * Constructor: EmbeddedInteger(n)
	 * -------------------------------
	 */
	public EmbeddedInteger(int n){
		value = n;
	}
	
	/**
	 * Method name: setValue(n)
	 * ------------------------
	 * Sets the internal value of this EmbeddedInteger to n.
	 */
	public void setValue(int n){
		value = n;
	}
	
	/**
	 * Method name: getValue
	 * ---------------------
	 * Returns the internal value of this EmbeddedInteger.
	 */
	public int getValue(){
		return value;
	}
	
	/**
	 * Method name: toString
	 * ---------------------
	 * Overrides the toString method to make it return the string 
	 * corresponding to the internal value.
	 */
	public String toString(){
		return "" + value;
	}
	
	//Private instance variable
	private int value; // The internal value
}
