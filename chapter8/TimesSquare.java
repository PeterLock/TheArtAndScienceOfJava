/**
 * File name: TimesSquare.java
 * ---------------------------
 * This program displays the text of the string HEADLINE on the screen
 * in an animated way that moves it across the display from left-to-right.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/25
 */
package com.chapter8;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class TimesSquare extends GraphicsProgram{
	
	public void run(){
		GLabel label = new GLabel(HEADLINE);
		label.setFont("Times-72");
		add(label, getWidth(), (getHeight() + label.getAscent()) /2);
		
		while(label.getX() + label.getWidth() > 0){
			label.move(-DELTA_X, 0);
			pause(PAUSE_TIME);
		}
	}

	/**The number of pixels to shift the label on each cycle*/
	private static final double DELTA_X = 2.0;
	
	/**The number of milliseconds to pause on each cycle*/
	private static final int PAUSE_TIME = 20;
	
	/**The string to use as the value of the label*/
	private static final String HEADLINE = 
			"When in the course of human events it becomes neccessary " +
			"for one people to dissolve the political bends which " +
			"connected them with another ...";
}
