package com.chapter8;

import acm.graphics.GCompound;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

public class HouseOfUsherParts extends GCompound{
	
	public HouseOfUsherParts(char c){
		
		if(c == 't'){
			getTower();
		}
		if(c == 'f'){
			getFrame();
		}
		if(c == 'w'){
			getWindow();
		}
		if(c == 'd'){
			getDoor();
		}
		
	}

	private void getDoor() {
		GRect door = new GRect(TOWER_WIDTH, TOWER_HEIGHT/4);
		add(door);
		
		GPolygon triangle = new GPolygon();
		
		triangle.addVertex(0, 0);
		
		triangle.addPolarEdge(TOWER_WIDTH, 0);
		triangle.addPolarEdge(35, 150);
		
		add(triangle);
	}

	private void getWindow() {
		GRect window = new GRect(WINDOW_WIDTH, WINDOW_WIDTH);
		add(window);
	}

	private void getFrame() {
		GRect frame = new GRect(TOWER_WIDTH*4, TOWER_HEIGHT - 100);
		add(frame);
		
		GPolygon triangle = new GPolygon();
		
		triangle.addVertex(0, 0);
		
		triangle.addPolarEdge(TOWER_WIDTH*4, 0);
		triangle.addPolarEdge(140, 150);
		
		add(triangle);
	}

	private void getTower() {
		
		GRect tower = new GRect(TOWER_WIDTH, TOWER_HEIGHT);
		add(tower);
		
		GPolygon triangle = new GPolygon();
		
		triangle.addVertex(0, 0);
		
		triangle.addPolarEdge(TOWER_WIDTH, 0);
		triangle.addPolarEdge(80, 110);
		
		add(triangle);
		
	}
	
	private static final int TOWER_WIDTH = 60;
	private static final int TOWER_HEIGHT = 450;
	
	private static final int WINDOW_WIDTH = 50;

}
