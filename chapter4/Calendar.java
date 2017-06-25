/* File name: Calendar.java
 * ------------------------
 * This program draws a simple calendar on the canvas.
 * 
 */

package com.chapter4;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Calendar extends GraphicsProgram {

	
	final static int DAY_WIDTH = 40;
	final static int DAY_HEIGHT = 40;
	final static int DAYS_IN_MONTH=30;

	public void run() {

	int columns = 7;
	int rows = 5;
	int day =1;

	for (int row = 0; row < rows; row++)
		for (int column = 0; column < columns; column++) {
			// x, y, width, height
			GRect square = new GRect( (DAY_WIDTH * column), DAY_HEIGHT * row, DAY_WIDTH, DAY_HEIGHT);
			add(square);
			
			GLabel days = new GLabel(("" + day), DAY_WIDTH*column, DAY_HEIGHT*row);
			if (day <= DAYS_IN_MONTH)
				add(days);
			day++;
			}
		}
	}

