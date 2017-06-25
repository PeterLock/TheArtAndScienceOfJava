package com.chapter8;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Halloween extends GraphicsProgram{
	
	public void run(){
		
		getPumkin();
		getNose();
		getEyes();
		getMouth();
		
	}
	
	private void getMouth() {
		
		GPolygon mouth = new GPolygon();
		
		mouth.addVertex(0, 90);
		mouth.addPolarEdge(20, 285);
		mouth.addPolarEdge(20, 45);	
		mouth.addPolarEdge(20, 285);
		mouth.addPolarEdge(20, 45);	
		mouth.addPolarEdge(20, 285);
		mouth.addPolarEdge(20, 45);	
		mouth.addPolarEdge(20, 285);
		mouth.addPolarEdge(20, 45);	
		
		mouth.setFillColor(MOUTH_COLOR);
		mouth.setFilled(true);
		
		mouth.setLocation(getWidth()/2 - MOUTH_DISPLACEMENT*2, getHeight()/2 - MOUTH_DISPLACEMENT*3);
		
		add(mouth);
	}

	private void getEyes() {

		GPolygon leftEye = new GPolygon();
		
		leftEye.addVertex(50, 50);
		
		leftEye.addPolarEdge(EYE_SIDE_WIDTH, 120);
		leftEye.addPolarEdge(EYE_SIDE_WIDTH, 0);
		leftEye.setFillColor(EYE_COLOR);
		leftEye.setFilled(true);
		
		leftEye.setLocation(getWidth()/2 - EYE_DISPLACEMENT*2.25, getHeight()/2 - EYE_DISPLACEMENT*1.75);
		
		add(leftEye);
		
		GPolygon rightEye = new GPolygon();
		
		rightEye.addVertex(50, 50);
		
		rightEye.addPolarEdge(EYE_SIDE_WIDTH, 120);
		rightEye.addPolarEdge(EYE_SIDE_WIDTH, 0);
		rightEye.setFillColor(EYE_COLOR);
		rightEye.setFilled(true);
		
		rightEye.setLocation(getWidth()/2, getHeight()/2 - EYE_DISPLACEMENT*1.75);
		
		add(rightEye);
		
	}

	private void getNose() {
		GPolygon triangle = new GPolygon();
		
		triangle.addVertex(0, 0);
		
		triangle.addPolarEdge(NOSE_SIDE_WIDTH, 0);
		triangle.addPolarEdge(NOSE_SIDE_WIDTH, 120);
		
		triangle.setLocation(getWidth()/2 - NOSE_SIDE_WIDTH/2, getHeight()/2);
		triangle.setFillColor(NOSE_COLOR);
		triangle.setFilled(true);
		
		add(triangle);		
	}

	private void getPumkin() {

		GOval oval = new GOval(PUMPKIN_WIDTH, PUMPKIN_WIDTH);
		oval.setFilled(true);
		oval.setFillColor(PUMPKIN_COLOR);
		oval.setColor(PUMPKIN_COLOR);
		oval.setLocation(getWidth()/2 - PUMPKIN_WIDTH/2, getHeight()/2 - PUMPKIN_WIDTH/2);
		
		add(oval);
		
		GRect stem = new GRect(getWidth()/2 - STEM_WIDTH/2, getHeight()/2 - PUMPKIN_WIDTH/2 - STEM_HEIGHT, STEM_WIDTH, STEM_HEIGHT);
		stem.setFilled(true);
		stem.setFillColor(STEM_COLOR);
		stem.setColor(STEM_COLOR);
		
		add(stem);
		
	}

	private static int PUMPKIN_WIDTH = 200;
	private static Color PUMPKIN_COLOR = Color.ORANGE;
	
	private static int STEM_WIDTH= 10;
	private static int STEM_HEIGHT=10;
	private static Color STEM_COLOR = Color.BLACK;
	
	private static int NOSE_SIDE_WIDTH = 30;
	private static Color NOSE_COLOR = Color.BLACK;
	
	private static int EYE_SIDE_WIDTH = 30;
	private static Color EYE_COLOR = Color.BLACK;
	private static int EYE_DISPLACEMENT = 40;
	
	private static int MOUTH_DISPLACEMENT = 20;
	private static Color MOUTH_COLOR = Color.BLACK;
	

}
