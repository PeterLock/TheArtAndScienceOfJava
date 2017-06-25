/**
 * File name: CreateDiamond.java
 * -----------------------------
 * This program draws a diamond on the canvas.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/25
 * 
 */
package com.chapter8;

import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class CreateDiamond extends GraphicsProgram {
	
	public void run(){
	
		drawDiamond();
		drawPolygon();
		
	}

	private void drawPolygon() {
		   GPolygon poly = new GPolygon();

		   
	}

	private void drawDiamond() {
		GPolygon diamond = new GPolygon();
		diamond.addVertex(-22, 0);
		diamond.addVertex(0, 36);
		diamond.addVertex(22, 0);
		diamond.addVertex(0, -36);
		diamond.setLocation(300, 100);
		
		add(diamond);		
	}

}
