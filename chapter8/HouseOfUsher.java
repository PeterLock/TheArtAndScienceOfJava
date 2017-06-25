/**
 * File name: HouseOfUsher.java
 * ----------------------------
 * A house as described by Edgar Allen Poe:
 * 
 * "I looked upon the scene before me . . . upon the bleak walls - upon
 * the vacant eye-like windows . . . with an utter desperation of soul . . .
 * 
 * Programmer: Peter Lock
 * Date: 2015/1/1
 */

package com.chapter8;

import acm.program.GraphicsProgram;

public class HouseOfUsher extends GraphicsProgram{
	
	private HouseOfUsherParts tower1 = new HouseOfUsherParts('t');
	private HouseOfUsherParts tower2 = new HouseOfUsherParts('t');
	private HouseOfUsherParts frame = new HouseOfUsherParts('f');
	private HouseOfUsherParts window1 = new HouseOfUsherParts('w');
	private HouseOfUsherParts window2 = new HouseOfUsherParts('w');
	private HouseOfUsherParts door = new HouseOfUsherParts('d');
	
	public void run(){
		
		tower1.setLocation(100, 200);
		add(tower1);
		
		frame.setLocation(160, 300);
		add(frame);
		
		tower2.setLocation(400, 200);
		add(tower2);
		
		window1.setLocation(200, 350);
		add(window1);
		
		window2.setLocation(300, 350);
		add(window2);
		
		door.setLocation(250, 538);
		add(door);
	}

}
