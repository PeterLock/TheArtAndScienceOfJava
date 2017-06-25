package com.chapter10;

import acm.graphics.GCompound;
import acm.graphics.GOval;

public class Peg extends GCompound {
	
	public Peg(double x, double y){
		
		GOval peg = new GOval(x, y, getWidth(), getHeight());
		add(peg);
		
	}
	
	public double getWidth(){
		return PEG_WIDTH;
	}
	public double getHeight(){
		return PEG_HEIGHT;
	}
	
	private static final int PEG_WIDTH=10;
	private static final int PEG_HEIGHT=10;

}
