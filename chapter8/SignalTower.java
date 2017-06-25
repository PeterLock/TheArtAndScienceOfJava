/**
 * Class name: SignalTower
 * -----------------------
 * This class defines a signal tower object that passes a message to the
 * next tower in a line.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/25
 */

package com.chapter8;

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GRect;



/* Class: SignalTower */
/**
 * This class defines a signal tower object that passes a message
 * to the next tower in a line.
 */
public class SignalTower extends GCompound {


	GRect tower = new GRect(TOWER_WIDTH,TOWER_HEIGHT);

	/* Constructor: SignalTower(name, link) */
	/**
	 * Constructs a new signal tower with the following parameters:
	 *
	 * @param name The name of the tower
	 * @param link A link to the next tower, or null if none exists
	 */
	public SignalTower(String name, SignalTower link) {
		towerName = name;
		nextTower = link;
		buildTower();
	}

	/* Method: signal() */
	/**
	 * This method represents sending a signal to this tower. The effect
	 * is to light the signal fire here and to send an additional signal
	 * message to the next tower in the chain, if any.
	 */
	public void signal() {
		lightCurrentTower();
		if (nextTower != null) nextTower.signal();
	}

	/* Method: lightCurrentTower() */
	/**
	 * This method lights the signal fire for this tower. This version
	 * supplies a temporary implementation (typically called a "stub")
	 * that simply prints the name of the tower to the standard output
	 * channel. If you wanted to redesign this class to be part of a
	 * graphical application, for example, you could override this
	 * method to draw an indication of the signal fire on the display.
	 */
	public void lightCurrentTower() {
		try {
			this.setTowerColor();
			Thread.sleep(300);

		} catch (InterruptedException e) {
			// Handle here
		}
		System.out.println("Lighting " + towerName);

	}

	public void buildTower(){
		tower.setFilled(false);
		add(tower);

		GLabel label = new GLabel(towerName);
		label.setLocation(getTowerWidth()/2  - label.getWidth()/2, this.getTowerLabelY());
		add(label);
	}

	public void setTowerColor(){
		tower.setColor(Color.RED);
		tower.setFillColor(Color.RED);
		tower.setFilled(true);
	}

	public int getTowerWidth(){
		return TOWER_WIDTH;
	}
	public int getTowerSpace(){
		return TOWER_SPACE;
	}
	public int getTowerLabelY(){
		return TOWER_LABEL_Y;
	}

	/* Private instance variables */
	private String towerName;         /* The name of this tower    */
	private SignalTower nextTower;    /* A link to the next tower  */
	private static final int TOWER_WIDTH = 30;
	private static final int TOWER_HEIGHT = 180;
	private static final int TOWER_SPACE = 100;
	private static final int TOWER_LABEL_Y = 200;

}
