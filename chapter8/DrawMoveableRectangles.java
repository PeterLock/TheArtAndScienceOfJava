/**
 * File: DrawRectangle.java
 * ------------------------
 * This program allows the user to create rectangles on the canvas by
 * clicking and dragging with the mouse. You can then click and move the
 * rectangles to new positions. Each rectangle is created with a 
 * randomly chosen color.
 * 
 * Note: Working 
 * 
 * Programmer: Peter Lock
 * Date: 2016/1/5
 */
package com.chapter8;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

/** This class allows users to drag rectangles on the canvas */
public class DrawMoveableRectangles extends GraphicsProgram {

	private GObject gobj;
	private double lastX = 0;
	private double lastY = 0;
	private boolean moveable = false;
	
	private int buttonClicked = 1;

	private DrawMoveableRectangleComponents ovalButtonNoFill = new DrawMoveableRectangleComponents('t');
	private DrawMoveableRectangleComponents ovalButtonFill = new DrawMoveableRectangleComponents('s');
	private DrawMoveableRectangleComponents rectButtonNoFill = new DrawMoveableRectangleComponents('p');
	private DrawMoveableRectangleComponents rectButtonFill = new DrawMoveableRectangleComponents('o');
	private DrawMoveableRectangleComponents lineStraight = new DrawMoveableRectangleComponents('l');

	/** Runs the program */
	public void run() {
		getSideBar();
		add(ovalButtonNoFill);
		ovalButtonNoFill.setLocation(5, 20);
		
		add(ovalButtonFill);
		ovalButtonFill.setLocation(5,  70);
		
		add(rectButtonNoFill);
		rectButtonNoFill.setLocation(5, 120);
		
		add(rectButtonFill);
		rectButtonFill.setLocation(5, 170);
		
		add(lineStraight);
		lineStraight.setLocation(5,  220);
		
		addMouseListeners();
	}
	private void getSideBar() {
		GRect buttonContainer = new GRect(0, 0, 50,getHeight());
		add(buttonContainer);
	}
	/** Called on mouse press to record the starting coordinates 
	 **/
	public void mousePressed(MouseEvent e) {

		gobj = getElementAt(e.getX(), e.getY());

		System.out.println("Area-bounds: " + e.getX());

		Point mp = e.getPoint();
		
		if(ovalButtonNoFill.contains(mp.getX(), mp.getY())){
			System.out.print("Nofilled oval ");
			ovalButtonNoFill.setColor(Color.RED);
			ovalButtonFill.setColor(Color.BLACK);
			rectButtonNoFill.setColor(Color.BLACK);
			rectButtonFill.setColor(Color.BLACK);
			lineStraight.setColor(Color.BLACK);
			buttonClicked = 1;
		}
		
		if(ovalButtonFill.contains(mp.getX(), mp.getY())){
			System.out.println("OvalFilled");
			ovalButtonNoFill.setColor(Color.BLACK);
			ovalButtonFill.setColor(Color.RED);
			rectButtonNoFill.setColor(Color.BLACK);
			rectButtonFill.setColor(Color.BLACK);
			lineStraight.setColor(Color.BLACK);
			buttonClicked = 2;
		}
		
		if(rectButtonNoFill.contains(mp.getX(), mp.getY())){
			System.out.println("NoFilled rect");
			ovalButtonNoFill.setColor(Color.BLACK);
			ovalButtonFill.setColor(Color.BLACK);
			rectButtonNoFill.setColor(Color.RED);
			rectButtonFill.setColor(Color.BLACK);
			lineStraight.setColor(Color.BLACK);
			buttonClicked = 3;
		}
		
		if(rectButtonFill.contains(mp.getX(), mp.getY())){
			System.out.println("Filled rect");
			ovalButtonNoFill.setColor(Color.BLACK);
			ovalButtonFill.setColor(Color.BLACK);
			rectButtonNoFill.setColor(Color.BLACK);
			rectButtonFill.setColor(Color.RED);
			lineStraight.setColor(Color.BLACK);
			buttonClicked = 4;
		}
		
		if(lineStraight.contains(mp.getX(), mp.getY())){
			System.out.println("Straight line");
			ovalButtonNoFill.setColor(Color.BLACK);
			ovalButtonFill.setColor(Color.BLACK);
			rectButtonNoFill.setColor(Color.BLACK);
			rectButtonFill.setColor(Color.BLACK);
			lineStraight.setColor(Color.RED);
			buttonClicked = 5;
		}
		
		

		if(gobj == null){
			moveable = false;
			System.out.println("Good times");
			startX = e.getX();
			startY = e.getY();
			
			switch(buttonClicked){
			case 1: {
				currentOval = new GOval(startX, startY, 0, 0);
				currentOval.setFilled(false);
				currentOval.setColor(rgen.nextColor());
				add(currentOval);
				break;
				}
			case 2: {
				currentOval = new GOval(startX, startY, 0, 0);
				currentOval.setFilled(true);
				currentOval.setColor(rgen.nextColor());
				add(currentOval);
				break;
			}
			case 3: {
				currentRect = new GRect(startX, startY, 0, 0);
				currentRect.setFilled(false);
				currentRect.setColor(rgen.nextColor());
				add(currentRect);		
				break;
				}
			case 4: {
				currentRect = new GRect(startX, startY, 0, 0);
				currentRect.setFilled(true);
				currentRect.setColor(rgen.nextColor());
				add(currentRect);
				break;
			}
			case 5: {
				currentLine = new GLine(startX, startY, startX, startY);
				currentLine.setColor(rgen.nextColor());
				add(currentLine);
				break;
			}
			default: break;
			}			
	
		} 

		if(gobj != null){
			if(gobj.getX() > 50){
				moveable = true;
				lastX = e.getX();
				lastY = e.getY();
				gobj = getElementAt(lastX, lastY);			
			}
		}

	}

	/** Called on mouse drag to reshape the current rectangle */
	public void mouseDragged(MouseEvent e) {

		if(moveable == false){
			double x = Math.min(e.getX(), startX);
			double y = Math.min(e.getY(), startY);
			double width = Math.abs(e.getX() - startX);
			double height = Math.abs(e.getY() - startY);
			if((buttonClicked == 1) || (buttonClicked == 2)){
				currentOval.setBounds(x, y, width, height);	
			}
			if((buttonClicked == 3) || (buttonClicked == 4)){
				currentRect.setBounds(x, y, width, height);	
			}
			if((buttonClicked == 5)){
				currentLine.setEndPoint(e.getX(), e.getY());
			}
			
			moveable = false;
		}

		if(moveable == true){
			if(gobj.getX() > 50){
				System.out.println("Moveable");
				if(gobj != null){
					gobj.move(e.getX() - lastX, e.getY() - lastY);
					lastX = e.getX();
					lastY = e.getY();				  
				}
			}
		}  
	}

	/**Called on mouse click to move this object to the front*/
	public void mouseClicked(MouseEvent e){
		if(gobj !=null) gobj.sendToFront();
	}

	/* Private state */
	private GRect currentRect; /* The current rectangle     */
	private GOval currentOval; /* The current oval			*/
	private GLine currentLine; /* The current line			*/
	private double startX; /* The initial mouse X position  */
	private double startY; /* The initial mouse Y position  */
	RandomGenerator rgen = new RandomGenerator();

}