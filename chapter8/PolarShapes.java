/**
 * File name: PolarShapes.
 * ----------------------
 * 
 * Programmer: Peter Lock
 */

package com.chapter8;

/**
 * Number of sides  Name
 * 3                       triangle or trigon
 * 4                       quadrilateral or tetragon
 * 5                       pentagon
 * 6                       hexagon
 * 7                       heptagon
 * 8                       octagon
 * 9                       enneagon
 * 10                      decagon
 * 11                      hendecagon
 * 12                      dodecagon
 * 13                      triskaidecagon or tridecagon
 * 14                      tetrakaidecagon or tetradecagon
 * 15                      pendedecagon
 * 16                      hexdecagon
 * 17                      heptdecagon
 * 18                      octdecagon
 * 19                      enneadecagon
 * 20                      icosagon
 *
 */

import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class PolarShapes extends GraphicsProgram {
	
	public void run(){
		
		
		drawOctogon();
		drawPentagon();
		drawTriangle();
		
	}

	private void drawTriangle() {
		
		GPolygon triangle = new GPolygon();
		
		triangle.addVertex(50, 50);
		
		triangle.addPolarEdge(140, 0);
		triangle.addPolarEdge(80, 150);

		
		triangle.setLocation(400, 200);
		
		add(triangle);
	}

	private void drawPentagon() {

		GPolygon pentagon = new GPolygon();
		
		pentagon.addVertex(50, 50);
		
		pentagon.addPolarEdge(80, 72);
		pentagon.addPolarEdge(80, 144);
		pentagon.addPolarEdge(80, 216);
		pentagon.addPolarEdge(80, 288);
		
		pentagon.setLocation(300, 200);
		
		add(pentagon);
		
	}

	private void drawOctogon() {
		GPolygon octogon = new GPolygon();
		
		octogon.addVertex(50,50);
		octogon.addPolarEdge(50, 45);
		octogon.addPolarEdge(50,90);
		octogon.addPolarEdge(50,135);
		octogon.addPolarEdge(50,180);
		octogon.addPolarEdge(50, 225);
		octogon.addPolarEdge(50, 270);
		octogon.addPolarEdge(50, 315);
		
		
		octogon.setLocation(100,200);
		
		add(octogon);		
	}

}
