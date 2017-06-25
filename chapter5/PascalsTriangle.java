
/*
 * File: PascalsTriangle.java
 * Name: Peter Lock
 * ------------------
 * This program draws a pyramid consisting of bricks arrange in horizontal
 * rows, so that the number of bricks in each row decreases by one as you 
 * move up the pyramid.
 */
package com.chapter5;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class PascalsTriangle extends GraphicsProgram {
	
	public void run(){
	
		startBuilding();
		
	}
	/** Method name: startBuilding
	 * --------------------------
	 * This method calculates the position of each of the blocks of a pyramid
	 * and then calls the method drawBrick. The outer for loop controls 
	 * the y position while the inner for loop controls the x position.
	 * precondition: none
	 * postcondition: passes the x, and y position of each brick to draw
	 * on the screen to the method called drawBrick.
	 */
	private void startBuilding() {

		int height = BRICKS_IN_BASE - 1;
		
		for( int row=0; row<BRICKS_IN_BASE; row++){
						
			int bricksInRow = BRICKS_IN_BASE - row;
			
			for(int brickNumber=0; brickNumber<bricksInRow; brickNumber++){
								
				int x = (getWidth()/2) - (BRICK_WIDTH*bricksInRow)/2 + brickNumber * BRICK_WIDTH;
				
				int y = getHeight() - BRICK_HEIGHT * (row+1);
				
				GLabel pascal = new GLabel( "" + combinations(height, brickNumber) , x+20, y+25);
				add(pascal);
								
				drawBrick(x, y);				
			}
			height--;
		}
		
	}
	
	/**
	 * Method name: combinations
	 * -------------------------
	 * Computes the factorial after receiving parameters from the calling function.
	 * @param n The number of objects in the set
	 * @param k The number of objects to be chosen
	 * @return Returns the results of the factorial.
	 */
	
	private int combinations(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n-k));
	}

	private int factorial(int k) {
		int result = 1;
		for(int i=1; i <= k; i++){
			result *=i;
		}
		return result;
	}
	
	/** Method name: drawBrick
	 * ----------------------
	 * This method receives the x, and y position of each brick to draw,
	 * and paints the brick on the screen.
	 * precondition: Receives the x, and y position for each brick from the
	 * calling method.
	 * postcondition: Paints the brick on the canvas in the positions it
	 * received as parameters.
	 */

	private void drawBrick(int x, int y) {
		GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
		add(brick);
	}

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 60;

	/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 40;

	/** Number of bricks in the base of the pyramid 
	 *  The BRICKS_IN_BASE is also used for the height integer of the pyramid
	 *  which will be passed to the method combinations, which in-turn correctly
	 *  calculate and return the factorial for each brick in the pyramid.
	 * */
	private static final int BRICKS_IN_BASE = 14;
}