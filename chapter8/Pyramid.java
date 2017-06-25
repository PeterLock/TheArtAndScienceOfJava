/**
 * File name: Pyramid
 * ------------------
 * Draws a pyramid on the canvas.
 */

package com.chapter8;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Pyramid extends GraphicsProgram{
	
	public void run(){
		
		buildThePyramid();
		
	}

	private void buildThePyramid() {
		
		for(int row = 0; row < BRICKS_IN_BASE; row++){
			
			int bricksInRow = BRICKS_IN_BASE - row;
			
			for(int brickNumber = 0; brickNumber<bricksInRow; brickNumber++){
				
				int x = (getWidth()/2 - ((BRICK_WIDTH*2) * bricksInRow) / 2 +
						((brickNumber) * BRICK_WIDTH*2));
				
				int y = getHeight() - (BRICK_HEIGHT*2) * (row+1);
				
				drawBricks(x,y);		
			}
		}
	}

	private void drawBricks(int x, int y) {
		
		GOval brick = new GOval(x,y,BRICK_WIDTH, BRICK_HEIGHT);
		add(brick);
		
	}

	private static final int BRICK_WIDTH = 20;
	
	private static final int BRICK_HEIGHT = 20;
	
	private static final int BRICKS_IN_BASE = 9;
	
}
