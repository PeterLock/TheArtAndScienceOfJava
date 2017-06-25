package com.chapter4;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Calendar2 extends GraphicsProgram{
	
	
	final static int DAY_WIDTH = 40;
	final static int DAY_HEIGHT = 40;
	final static int DAYS_IN_MONTH=30;
	

	public void run(){
		
		
		int day = 1;
		int columns = 7;
		int rows = 5;
		
		
		for (int row = 0; row < rows; row++)
			for (int column = 0; column < columns; column++) {
				// x, y, width, height
				GRect square = new GRect( (DAY_WIDTH * column), DAY_HEIGHT * row, DAY_WIDTH, DAY_HEIGHT);
				add(square);
				
				GLabel days = new GLabel(("" + day), DAY_WIDTH * column + 22, DAY_HEIGHT * row + 22);
				if (day <= DAYS_IN_MONTH)
					add(days);
				day++;
				}
	}

}
