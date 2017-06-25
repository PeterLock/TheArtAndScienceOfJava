/*
 * File name: Shapes
 * -----------------
 */

package com.chapter8;

import java.awt.Color;

import acm.graphics.GMath;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class Shapes extends GraphicsProgram {
	
	public void run(){
		
		GPolygon parra = new GPolygon();
		
		parra = createParallelogram(100);
		parra.setLocation(350, 150);
		add(parra);
		
		
		GPolygon pentagon = new GPolygon();
		
		pentagon = createPentagon(100);
		pentagon.setLocation(330, 350 );
		add(pentagon);
		
		GPolygon cross = new GPolygon();
		
		cross = createCross(30);
		cross.setLocation(340, 550);
	//	add(cross);
		
	}


	/* Creates a parallelogram with its reference point at the center */
	   private GPolygon createParallelogram(double edge) {
	      GPolygon poly = new GPolygon();
	      double x0 = -(edge + edge / Math.sqrt(2)) / 2;
	      double y0 = edge / Math.sqrt(2) / 2;
	      poly.addVertex(x0, y0);
	      poly.addPolarEdge(edge, 0);
	      poly.addPolarEdge(edge, 45);
	      poly.addPolarEdge(edge, 180);
	      poly.addPolarEdge(edge, 225);
	      
	      poly.setFillColor(Color.RED);
	      
	      
	      return poly;
	}
	/* Creates a pentagon with its reference point at the center */
	   private GPolygon createPentagon(double edge) {
	      GPolygon poly = new GPolygon();
	      double x0 = -edge / 2;
	      double y0 = edge / 2 / GMath.tanDegrees(36);
	      poly.addVertex(x0, y0);
	      for (int i = 0; i < 5; i++) {
	         poly.addPolarEdge(edge, i * 72);
	}
	      return poly;
	   }
	/* Creates a cross polygon with its reference point at the center */
	   private GPolygon createCross(double edge) {
	      GPolygon poly = new GPolygon();
	      double x0 = -2.5 * edge;
	      double y0 = edge / 2;
	      poly.addVertex(x0, y0);
	      poly.addEdge(edge, 0);
	      poly.addEdge(0, edge);
	      poly.addEdge(edge, 0);
	      poly.addEdge(0, edge);
	      poly.addEdge(edge, 0);
	      poly.addEdge(0, -edge);
	      poly.addEdge(edge, 0);
	      poly.addEdge(0, -edge);
	      poly.addEdge(edge, 0);
	      poly.addEdge(0, -edge);
	      poly.addEdge(-edge, 0);
	      poly.addEdge(0, -edge);
	      poly.addEdge(-edge, 0);
	      poly.addEdge(0, -edge);
	      poly.addEdge(-edge, 0);
	      poly.addEdge(0, edge);
	      poly.addEdge(-edge, 0);
	      poly.addEdge(0, edge);
	      poly.addEdge(-edge, 0);
	      poly.addEdge(0, edge);
	      return poly;
	}	

}
