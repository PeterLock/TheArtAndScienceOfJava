package com.chapter8;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
public class DrawPeaceSymbol extends GraphicsProgram{
	
	public void run(){
		
		drawPeaceSymbol(100,100,150);
		
	}
		
	public void drawPeaceSymbol(int x, int y, double r){
		
		double RADIUS = r;
		
			GOval circle = new GOval(RADIUS*2,RADIUS*2);
			/*Draws the circle in the center of the screen*/
			circle.setLocation(x,y);
			add(circle);
			/* Draws a line down the center of the circle*/
			GLine stroke = new GLine(x+RADIUS, y+RADIUS*2, x+RADIUS, y);
			add(stroke); 
			
			GLine right = new GLine(x+RADIUS, y+RADIUS, 135, 345);
			add(right);
			
			GLine left = new GLine(x+RADIUS, y+RADIUS,365, 346);
			add(left);
				
	}
}
