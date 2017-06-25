package com.chapter8;

import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

public class HouseParts extends GCompound{
	
	public HouseParts(char x){		
		if(x == 's'){
			getSmallWindows();
		} 
		if(x == 'm'){
			getMediumWindows();
		}
		if(x == 'd'){
			getDoor();
		}
		if(x == 'f'){
			getFrame();
		}
		if(x == 'r'){
			getRoof();
		}		
	}
	
	private void getRoof() {
		GPolygon roof = new GPolygon();
		
		roof.addVertex(50, 50);
		
		roof.addPolarEdge(FRAME_WIDTH, 0);
		roof.addPolarEdge(350, 150);
		
		add(roof);		
	}

	private void getFrame() {
		GRect frame = new GRect(FRAME_WIDTH, FRAME_HEIGHT);
		add(frame);
	}

	private void getDoor() {
		GRect Door = new GRect(DOOR_WIDTH, DOOR_HEIGHT);
		add(Door);
		GOval knob = new GOval(DOOR_KNOB_WIDTH, DOOR_KNOB_WIDTH);
		knob.setLocation(80,80);
		add(knob);
		
	}

	private void getMediumWindows() {
		GRect TopLeft = new GRect(MEDIUM_WINDOW_WIDTH,MEDIUM_WINDOW_HEIGHT);
		add(TopLeft);
		GRect TopMiddle = new GRect(MEDIUM_WINDOW_WIDTH, 0, MEDIUM_WINDOW_WIDTH, MEDIUM_WINDOW_HEIGHT );
		add(TopMiddle);
		GRect TopRight = new GRect(MEDIUM_WINDOW_WIDTH*2, 0, MEDIUM_WINDOW_WIDTH, MEDIUM_WINDOW_HEIGHT );
		add(TopRight);	
		
		GRect BottomLeft = new GRect(0, MEDIUM_WINDOW_HEIGHT, MEDIUM_WINDOW_WIDTH, MEDIUM_WINDOW_HEIGHT);
		add(BottomLeft);
		GRect BottomMiddle = new GRect(MEDIUM_WINDOW_WIDTH, MEDIUM_WINDOW_HEIGHT, MEDIUM_WINDOW_WIDTH, MEDIUM_WINDOW_HEIGHT );
		add(BottomMiddle);
		GRect BottomRight = new GRect(MEDIUM_WINDOW_WIDTH*2, MEDIUM_WINDOW_HEIGHT, MEDIUM_WINDOW_WIDTH, MEDIUM_WINDOW_HEIGHT );
		add(BottomRight);
	}

	private void getSmallWindows(){
		GRect TopLeft = new GRect(SMALL_WINDOW_WIDTH,SMALL_WINDOW_HEIGHT);
		add(TopLeft);
		GRect TopMiddle = new GRect(SMALL_WINDOW_WIDTH, 0, SMALL_WINDOW_WIDTH, SMALL_WINDOW_HEIGHT );
		add(TopMiddle);
		GRect TopRight = new GRect(SMALL_WINDOW_WIDTH*2, 0, SMALL_WINDOW_WIDTH, SMALL_WINDOW_HEIGHT );
		add(TopRight);	
		
		GRect BottomLeft = new GRect(0, SMALL_WINDOW_HEIGHT, SMALL_WINDOW_WIDTH, SMALL_WINDOW_HEIGHT);
		add(BottomLeft);
		GRect BottomMiddle = new GRect(SMALL_WINDOW_WIDTH, SMALL_WINDOW_HEIGHT, SMALL_WINDOW_WIDTH, SMALL_WINDOW_HEIGHT );
		add(BottomMiddle);
		GRect BottomRight = new GRect(SMALL_WINDOW_WIDTH*2, SMALL_WINDOW_HEIGHT, SMALL_WINDOW_WIDTH, SMALL_WINDOW_HEIGHT );
		add(BottomRight);	
	}
	
	private static final int SMALL_WINDOW_WIDTH = 25;
	private static final int SMALL_WINDOW_HEIGHT = 40;
	
	private static final int MEDIUM_WINDOW_WIDTH = 40;
	private static final int MEDIUM_WINDOW_HEIGHT = 60;
	
	private static final int DOOR_WIDTH = 120;
	private static final int DOOR_HEIGHT = 180;
	private static final int DOOR_KNOB_WIDTH = DOOR_WIDTH/10;
	
	private static final int FRAME_WIDTH = DOOR_WIDTH*5;
	private static final int FRAME_HEIGHT = DOOR_HEIGHT*2;
	

}
