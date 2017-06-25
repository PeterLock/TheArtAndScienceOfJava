/* File name: Checkerboard.java
 * ----------------------------
 * This program draws a picture of a Checkerboard on the screen.
 * 
 * Coder: Peter Lock
 * Date: 2015/12/01
 * 
 */
package com.chapter4;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Checkerboard extends GraphicsProgram{
	
	public void run() {

		int rows = 8;
		int columns = 8;

		for (int row = 1; row <= rows; row++){
			for (int column = 1; column <= columns; column++) {

				GRect squares = new GRect((40*row), (40*column), 40, 40);
				add(squares);

				if ((row%2+1) == (column%2) || (row%2) == (column%2+1)) {
					GOval checkers = new GOval((40*row+1), (40*column), 40, 40);
					add(checkers);
					} //end if
				} // end inner for
			} // end outer for
		
	}

}
