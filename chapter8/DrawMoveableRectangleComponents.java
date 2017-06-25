/*
 * File name: DrawMoveableRectangleComponents
 * ------------------------------------------
 * This is a simple drawing program.
 * 
 * Programmer: Peter Lock
 * Date: January 13th, 2016
 * 
 */

package com.chapter8;

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

public class DrawMoveableRectangleComponents extends GCompound {
	
	public Color outlineColor = Color.WHITE;
	/*
	 * Constructor name: DrawMoveableRectangleComponents
	 * --------------------------------------------
	 * This constructor receives a character as a parameter and adds the corresponding component 
	 * to the screen. 
	 */
	public DrawMoveableRectangleComponents(char c){
		
		if(c == 't'){
			getOvalComponentNoFill();
		}
		
		if(c == 's'){
			getOvalComponentFilled();			
		}
		if(c == 'p'){
			getRectangleComponentNoFill();
		}
		if(c == 'o'){
			getRectangleComponentFill();
		}
		if(c == 'l'){
			getLineComponent();
		}	
	}

	private void getLineComponent() {
		GRect outline = new GRect(outlineWidth, outlineWidth);
		outline.setFillColor(outlineColor);
		outline.setFilled(true);
		add(outline);
		GPolygon poly = new GPolygon();
		poly.addVertex(0, 0);
		poly.addVertex(30, -20);
		poly.setLocation(5, 30);
		add(poly);
	}

	private void getRectangleComponentFill() {
		GRect outline = new GRect(outlineWidth, outlineWidth);
		outline.setFillColor(outlineColor);
		outline.setFilled(true);
		add(outline);
		GRect rect = new GRect(5,10,30,20);
		rect.setFilled(true);
		rect.setFillColor(Color.BLACK);
		add(rect);
	}

	private void getRectangleComponentNoFill() {
		GRect outline = new GRect(outlineWidth, outlineWidth);
		outline.setFillColor(outlineColor);
		outline.setFilled(true);
		add(outline);
		GRect rect = new GRect(5,10,30,20);
		add(rect);
		
	}

	private void getOvalComponentFilled() {
		GRect outline = new GRect(outlineWidth,outlineWidth);
		outline.setFillColor(outlineColor);
		outline.setFilled(true);
		add(outline);
		GOval oval = new GOval(30, 25);
		oval.setLocation(5, 8);
		oval.setFilled(true);
		oval.setFillColor(Color.BLACK);
		add(oval);
	}

	private void getOvalComponentNoFill() {

		GRect outline = new GRect(outlineWidth,outlineWidth);
		outline.setFillColor(outlineColor);
		outline.setFilled(true);
		add(outline);
		GOval oval = new GOval(30, 25);
		oval.setLocation(5, 8);
		add(oval);
		
	}
	
	private static final double outlineWidth = 40;

}
