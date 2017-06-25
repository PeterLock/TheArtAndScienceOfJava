/**
 * File: DragObjects.java
 * ----------------------
 */
package com.chapter8;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class DragObjects extends GraphicsProgram {
	
	/**Runs the program*/
	public void run(){
		GRect rect = new GRect(100,100,150, 100);
		rect.setFilled(true);
		rect.setFillColor(Color.RED);
		add(rect);
		GOval oval = new GOval(300,115,100,70);
		oval.setFilled(true);
		oval.setFillColor(Color.GREEN);
		add(oval);
		addMouseListeners();
	}
	
	/**Called on mouse press to record the coordinates of the click*/
	public void mousePressed(MouseEvent e){
		lastX = e.getX();
		lastY = e.getY();
		gobj = getElementAt(lastX, lastY);
	}
	
	/**Called on mouse drag to reposition the object*/
	public void mouseDragged(MouseEvent e){
		if(gobj != null){
			gobj.move(e.getX() - lastX, e.getY() - lastY);
			lastX = e.getX();
			lastY = e.getY();
		}
	}
	
	/**Called on mouse click to move this object to the front*/
	public void mouseClicked(MouseEvent e){
		if(gobj !=null) gobj.sendToFront();
	}
	
	/*Instance variables*/
	private GObject gobj; /*The object being dragged*/
	private double lastX; /*The last mouse X position*/
	private double lastY; /*The last mouse Y position*/
	
}
