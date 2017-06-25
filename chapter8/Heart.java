package com.chapter8;

import acm.graphics.GArc;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Heart extends GraphicsProgram {
	
	
	public void run(){
		
		Heart();
		
	}
	
	private void Heart(){
		
		GArc left = new GArc(100,100, 45, 180);
		GArc right = new GArc(100,100,315, 180);
		
		left.setLocation(200,200);
		right.setLocation(270, 200);
		add(left);
		add(right);
		
		GLine leftLine = new GLine(215,285, 287, 370);
		add(leftLine);
		
		GLine rightLine = new GLine(355, 285, 287,370);
		add(rightLine);
		
	}

}
