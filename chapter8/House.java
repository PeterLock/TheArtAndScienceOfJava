package com.chapter8;
/**
 * File name: House.java
 * ---------------------
 * This program draws a house on the screen.
 * 
 * Programmer: Peter Lock
 * Date: 2016/1/1
 */


import acm.program.GraphicsProgram;

public class House extends GraphicsProgram {
	
	
	private HouseParts smallLeftWindow = new HouseParts('s');
	private HouseParts smallRightWindow = new HouseParts('s');
	
	private HouseParts mediumLeftWindow = new HouseParts('m');
	private HouseParts mediumRightWindow = new HouseParts('m');
	
	private HouseParts door = new HouseParts('d');
	private HouseParts frame = new HouseParts('f');
	private HouseParts roof = new HouseParts('r');

	
	public void run(){
		
		frame.setLocation(100, 300);
		add(frame);
		
		smallLeftWindow.setLocation(180, 350);
		add(smallLeftWindow);
		smallRightWindow.setLocation(530, 350);
		add(smallRightWindow);
		
		mediumLeftWindow.setLocation(150, 500);
		add(mediumLeftWindow);
		mediumRightWindow.setLocation(510, 500);
		add(mediumRightWindow);
		
		door.setLocation(330, 480);
		add(door);
		
		roof.setLocation(50, 250);
		add(roof);
		

		
		
	}
}
