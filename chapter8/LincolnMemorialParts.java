package com.chapter8;

import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.graphics.GRect;

public class LincolnMemorialParts extends GCompound {
	
	public LincolnMemorialParts(char x){
		
		if(x=='t'){
			getTop1();
		}
		if(x=='p'){
			getTop2();
		}
		if(x=='m'){
			getMiddle();
		}
		if(x=='b'){
			getBottom();
		}
		if(x=='y'){
			getPerson();
		}
		
	}

	private void getPerson() {
		GOval head = new GOval(PERSON_WIDTH, PERSON_WIDTH);
		add(head);
		GRect body = new GRect(0, PERSON_WIDTH, PERSON_WIDTH, PERSON_BODY);
		add(body);
	}

	private void getBottom() {
		GRect bottom = new GRect(MEMORIAL_BOTTOM_WIDTH, MEMORIAL_BOTTOM_HEIGHT);
		add(bottom);
	}

	private void getMiddle() {
		GRect middle = new GRect(MEMORIAL_MIDDLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(middle);
		
		GRect pole1 = new GRect(0, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole1);
		
		GRect pole2 = new GRect(POLE_WIDTH, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole2);
		
		GRect pole3 = new GRect(POLE_WIDTH*2, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole3);
		
		GRect pole4 = new GRect(POLE_WIDTH*3, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole4);
		
		GRect pole5 = new GRect(POLE_WIDTH*4, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole5);
		
		GRect pole6 = new GRect(POLE_WIDTH*5, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole6);
		
		GRect pole7 = new GRect(POLE_WIDTH*6, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole7);
		
		GRect pole8 = new GRect(POLE_WIDTH*7, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole8);
		
		GRect pole9 = new GRect(POLE_WIDTH*8, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole9);
		
		GRect pole10 = new GRect(POLE_WIDTH*9, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole10);
		
		GRect pole11 = new GRect(POLE_WIDTH*10, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole11);
		
		GRect pole12 = new GRect(POLE_WIDTH*11, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole12);
		
		GRect pole13 = new GRect(POLE_WIDTH*12, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole13);
		
		GRect pole14 = new GRect(POLE_WIDTH*13, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole14);
		
		GRect pole15 = new GRect(POLE_WIDTH*14, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole15);
		
		GRect pole16 = new GRect(POLE_WIDTH*15, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole16);
		
		GRect pole17 = new GRect(POLE_WIDTH*16, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole17);
		
		GRect pole18 = new GRect(POLE_WIDTH*17, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole18);
		
		GRect pole19 = new GRect(POLE_WIDTH*18, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole19);
		
		GRect pole20 = new GRect(POLE_WIDTH*19, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole20);
		
		GRect pole21 = new GRect(POLE_WIDTH*20, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole21);
		
		GRect pole22 = new GRect(POLE_WIDTH*21, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole22);
		
		GRect pole23 = new GRect(POLE_WIDTH*22, 0, POLE_WIDTH, MEMORIAL_MIDDLE_HEIGHT);
		add(pole23);
	}

	public int getMemorialTop1Width(){
		return MEMORIAL_TOP1_WIDTH;		
	}
	public int getMemorialTop2Width(){
		return MEMORIAL_TOP2_WIDTH;		
	}
	public int getMemorialTopHeight(){
		return MEMORIAL_TOP_HEIGHT;
	}
	public int getMemorialMiddleWidth(){
		return MEMORIAL_MIDDLE_WIDTH;
	}
	public int getMemorialBottomWidth(){
		return MEMORIAL_BOTTOM_WIDTH;
	}
	public int getMemorialBottomHeight(){
		return MEMORIAL_BOTTOM_HEIGHT;
	}
	public int getPoleWidth(){
		return POLE_WIDTH;
	}
	public int getPersonHeight(){
		return PERSON_HEIGHT;
	}

	
	private void getTop1() {
		GRect top = new GRect(MEMORIAL_TOP1_WIDTH, MEMORIAL_TOP_HEIGHT);
		add(top);		
	}
	
	private void getTop2(){
		GRect top = new GRect(MEMORIAL_TOP2_WIDTH, MEMORIAL_TOP_HEIGHT);
		add(top);
		
		/**
		 * Each column is 55 wide. Each Circle has a diameter of 25. both sides have a 15 buffer, except for the ends.
		 * 
		 */
		
		GOval circle1 = new GOval(4, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle1);
		
		GOval circle2 = new GOval(POLE_WIDTH*2, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle2);
		
		GOval circle3 = new GOval(POLE_WIDTH*4, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle3);
		
		GOval circle4 = new GOval(POLE_WIDTH*6+4, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle4);
		
		GOval circle5 = new GOval(POLE_WIDTH*8+8, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle5);
		
		GOval circle6 = new GOval(POLE_WIDTH*10+8, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle6);
		
		GOval circle7 = new GOval(POLE_WIDTH*12+8, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle7);
		
		GOval circle8 = new GOval(POLE_WIDTH*14+8, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle8);
		
		GOval circle9 = new GOval(POLE_WIDTH*16+8, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle9);
		
		GOval circle10 = new GOval(POLE_WIDTH*18+8, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle10);
		
		GOval circle11 = new GOval(POLE_WIDTH*20+8, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle11);
		
		GOval circle12 = new GOval(POLE_WIDTH*22+4, 10, CIRCLE_WIDTH, CIRCLE_WIDTH);
		add(circle12);
		
	}
	
	
	private static final int MEMORIAL_TOP1_WIDTH = 600;
	private static final int MEMORIAL_TOP_HEIGHT = 50;
	private static final int MEMORIAL_TOP2_WIDTH = 644;
	
	private static final int CIRCLE_WIDTH = 20;
	private static final int POLE_WIDTH = 28;
	
	private static final int MEMORIAL_MIDDLE_HEIGHT = 250;
	private static final int MEMORIAL_MIDDLE_WIDTH = 644;
	
	private static final int MEMORIAL_BOTTOM_HEIGHT = 50;
	private static final int MEMORIAL_BOTTOM_WIDTH = 644;
	
	private static final int PERSON_WIDTH = 20;
	private static final int PERSON_BODY = 40;
	private static final int PERSON_HEIGHT = PERSON_BODY + PERSON_WIDTH;
	
}
