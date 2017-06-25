package com.chapter8;

import acm.graphics.GArc;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class MyLetter extends GraphicsProgram{
	
	private char[] anArray = {'P','C','L'};
	
	public void run(){
		
		int y = 0;
				
		while(y!=2){
			switch (anArray[y]){
			case 'P':{
				GLine line = new GLine(200, 100, 200, 300);
				add(line);
				
				GArc arc = new GArc(100,100,-90,180);
				arc.setLocation(150, 100);
				add(arc);
				
				}
			case 'C': {
				GArc arc = new GArc(200,200,90,180);
				arc.setLocation(250, 100);
				add(arc);
				}
			case 'L': {
				GLine line = new GLine(400,100,400,300);
				GLine stroke = new GLine(400,300,450,300);
				add(stroke);
				add(line);
			}
			default: break;
			}
		y++;
		}
	}
	


}
