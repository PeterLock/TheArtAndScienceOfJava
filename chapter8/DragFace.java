/**
 * File: DragFace.java
 * -------------------
 * This program creates a GFace object and allows the user to drag
 * it around the canvas.
 */

package com.chapter8;

import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.program.GraphicsProgram;

public class DragFace extends GraphicsProgram {
	
/** Width of the face */
   private static final double FACE_WIDTH = 200;
   
/** Height of the face */
   private static final double FACE_HEIGHT = 300;
   
   private static double x1 = 200;
   
   
/** Runs the program */
   public void run() {
      GFace face = new GFace(x1, x1, FACE_WIDTH, FACE_HEIGHT );
      double x = (getWidth() - FACE_WIDTH) / 2;
      double y = (getHeight() - FACE_HEIGHT) / 2;
      add(face, 200, 200);
      addMouseListeners();
}
   
/** Called on mouse press to record the coordinates of the click */
   public void mousePressed(MouseEvent e) {
      lastX = e.getX();
      lastY = e.getY();
      gobj = getElementAt(lastX, lastY);
}
   
/** Called on mouse drag to reposition the object */
   public void mouseDragged(MouseEvent e) {
      
	   if (gobj != null) {
         gobj.move(e.getX() - lastX, e.getY() - lastY);
         lastX = e.getX();
         lastY = e.getY();
      } 
}
   
/** Called on mouse click to move this object to the front */
   public void mouseClicked(MouseEvent e) {
      if (gobj != null) gobj.sendToFront();
}
   
/* Private state */
   private GObject gobj;	/* The object being dragged   */
   private double lastX;	/* The last mouse X position  */
   private double lastY;	/* The last mouse Y position  */

}