package com.chapter8;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class ArrayOfGLabels extends GraphicsProgram {
	
	GLabel[] test = new GLabel[2];
	
	
	
	
	//Student[] studentArray = new Student[7];

	String names[] = {"One", "Two"};

	public void run(){
		
		test[0] = new GLabel(names[0]);	
		test[1] = new GLabel(names[1]);
		
		test[0].setLocation(10,10);
		add(test[0]);
		
		
		test[1].setLocation(10,20);
		add(test[1]);
	}
	
	
}
