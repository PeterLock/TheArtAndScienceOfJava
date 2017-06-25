/**
 * File name: WordBounce.java
 * --------------------------
 * This program bounces the words 'I Love Java' around the canvas area.
 * 
 * Programmer: Peter Lock
 * Date: 15th January 2016
 */

package com.chapter8;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class WordBounce extends GraphicsProgram{
	
	GLabel label = new GLabel("I Love Java");
	private double DELTA_X = 0;
	private double DELTA_Y = 0;
	
	public void run(){
	
		add(label, ((getWidth() - label.getWidth())/2), (getHeight() + label.getAscent()) / 2);
		label.setFont("Old London-18");
		
		while(true){	
			int direction = rgen.nextInt(1, 4);	
			switch(direction){
			/*NorthEast*/
			case 1:{
				DELTA_X = rgen.nextInt(1, 8);
				DELTA_Y = rgen.nextInt(1, 8);
				while(label.getY() > label.getHeight() && label.getX() < getWidth()-label.getWidth()){
					label.move(DELTA_X, -DELTA_Y);
					pause(PAUSE_TIME);			
				}
				break;
			}
			/*SouthEast*/
			case 2: {			
				DELTA_X = rgen.nextInt(1, 8);
				DELTA_Y = rgen.nextInt(1, 8);
				while(label.getX() < getWidth()-label.getWidth() && label.getY() < getHeight() - label.getHeight()){
					label.move(DELTA_X, DELTA_Y);
					pause(PAUSE_TIME);								
				}				
				break;
			}
			/*SouthWest*/
			case 3: {
				DELTA_X = rgen.nextInt(1, 8);
				DELTA_Y = rgen.nextInt(1, 8);
				while((label.getX() > 0 && label.getY() < getHeight()-label.getHeight())){
					label.move(-DELTA_X, DELTA_Y);
					pause(PAUSE_TIME);				
				}
				break;
			}
			/*NorthWest*/
			case 4:{
				DELTA_X = rgen.nextInt(1, 8);
				DELTA_Y = rgen.nextInt(1, 8);
				while((label.getX() > 0) && (label.getY() > label.getHeight())){
					label.move(-DELTA_X, -DELTA_Y);
					pause(PAUSE_TIME);		
				}	
				break;
			}		
			default: break;			
			} // End Switch
		}
	}
	
	private static final int PAUSE_TIME = 30;
	
	RandomGenerator rgen = new RandomGenerator();

}
