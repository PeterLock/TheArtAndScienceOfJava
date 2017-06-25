/**
 * Filename: LineGraph.java
 * ------------------------
 * This program draws a line graph on the screen.
 * 
 * Programmer: Peter Lock
 * Date: 12-2-2016
 * 
 */

package com.chapter10;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class LineGraph extends GraphicsProgram{
	
	double[] pointX = { 1.0, 80, 160, 240, 300, 400, 480, 560, 640, 720};
	double[] pointY = { 180.67, 183.68, 160.71, 170.86, 160.86, 120.3, 50.7, 95.9, 120.2, 30.6};
	
	
	public void run(){
		
	for(int x=0; x<pointX.length; x++){
		GOval point = new GOval( pointX[x], pointY[x], size, size );
		point.setFilled(true);
		add(point);
	}
	
	for(int i=0; i<pointX.length-1; i++){
		GLine line = new GLine( pointX[i], pointY[i], pointX[i+1], pointY[i+1]);		
		add(line);
		}
	}
	
	private static final int size = 5;

}
