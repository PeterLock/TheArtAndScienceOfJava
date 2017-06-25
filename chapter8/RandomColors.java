/**
 * File name: RandomColors
 * -----------------------
 * Adds labels to the screen for each of the seven colors of the rainbow in a random
 * location within the confines of the window. Label colors do not match the label 
 * description. When pressed on the color changes to match the name, then when the mouse
 * is released a new color is chosen at random.
 * 
 * Programmer: Peter Lock
 * Date: 2016/1/3
 */

package com.chapter8;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomColors extends GraphicsProgram {
	
	private GObject gobj;
	
	
	private GLabel[] labels = new GLabel[7];
	
	private String Names[] = {"RED", "ORANGE", "YELLOW", "GREEN", "CYAN", "BLUE", "MAGENTA"};
	
	private Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
			Color.CYAN, Color.BLUE, Color.MAGENTA};
	
	private double y = 0;
	private double x = 0;
	private double width = 0;
	private double height = 0;
	
	public void run(){
		addLabels();	
		
		addMouseListeners();
	}

	private void addLabels() {
		for(int i = 0; i<7; i++){
			
			labels[i] = new GLabel(Names[i]);
			labels[i].setFont("Serif-36");
						
			width = labels[i].getWidth();
			height = labels[i].getHeight();
			y = rgen.nextDouble(height, getHeight()-height);
			x = rgen.nextDouble(width, getWidth()-width);
			
			/*Test if an object already exists*/
			runTest();
			labels[i].setColor(getColor(colors[i]));
			
			labels[i].setLocation(x, y);
			add(labels[i]);	
		}	
	}
	/**
	 * Method name: getColor()
	 * -----------------------
	 */
	private Color getColor(Color x) {
		Color y = rgen.nextColor();
		while(y.equals(x)){
			y = rgen.nextColor();
		}
		return y;
	}
	/**
	 * Method name: runTest()
	 * ----------------------
	 * Test whether an object is present at a given x,y location.
	 * @return Returns false when an x,y location has been found which does not have an object.
	 */
	private void runTest() {	
		gobj = getElementAt(x,y);
		while(gobj != null){
			y = rgen.nextDouble(height, getHeight()-height);
			x = rgen.nextDouble(width, getWidth()-width);
		}		
	}
    public void mousePressed(MouseEvent e) {
       gobj = getElementAt(e.getX(), e.getY());
              
       if (gobj != null) {
       	String stringObject = (gobj.toString());
       	
       	for(int x =0; x<7; x++){
       		int pos = stringObject.indexOf(Names[x]);
       		if(pos !=-1) gobj.setColor(colors[x]);
       	}
      }
    }
    
    public void mouseReleased(MouseEvent e){
    	gobj = getElementAt(e.getX(), e.getY());
    	gobj.setColor(rgen.nextColor());
    }
	
	RandomGenerator rgen = new RandomGenerator();

}
