/**
 * Filename: ProbabiltyBoard.java
 * ------------------------------
 * This program graphically simulates dropping balls onto a probability board.
 * 
 *  Programmer: Peter Lock
 *  
 *  Date: 11-2-2016
 */

package com.chapter10;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class ProbabilityBoard extends GraphicsProgram {
		
	private Peg[] peg = new Peg[PEG_NUMBER];
	private double[] pegLocation = new double[PEG_NUMBER];
	
	//If true move left. If false move right.
	boolean moveLeft;
	
	private double[] localesX = new double[BALL_NUMBER];
	private double[] localesY = new double[BALL_NUMBER];
	
	private double[] tubesX = new double[TUBE_NUMBER+1];
	private int[] tubeContents = new int[TUBE_NUMBER];

	/*Runs the program*/
	public void run(){
				
		setupBoard();
		
		for(int x=0; x<BALL_NUMBER; x++){
			runMechanics(x);
		}	
	}
	/*
	 * Method name: checkMechanics
	 * ---------------------------
	 * This is the engine area of the program. The ball will continue to fall until it encounters its 
	 * first object, after that it will begin the bounce stage. And finally the ball will continue to fall
	 * down the tube.
	 * Postcondition: Ball (a) bounces of ball (b) with a 50% probability of either bouncing left or 
	 * bouncing right.
	 */
	private void runMechanics(int xyz) {
		
		GOval ball = new GOval(getWidth()/2 - BALL_SIZE/2, BALL_START_POSITION, BALL_SIZE, BALL_SIZE);
		ball.setFilled(true);
		add(ball);
		
		while(true){			
			double x = ball.getX();
			double y = ball.getY();
			gobj = getElementAt(x,y+BALL_SIZE+(BALL_SIZE/2));
			if(gobj==null){
				
				ball.move(DELTA_X, DELTA_Y);
				pause(PAUSE_TIME);			
			} 
			if(gobj!=null)break;
		}	
		
		for(int x=0; x<PEG_NUMBER-1; x++){
			pause(PAUSE_TIME);
			moveLeft = rgen.nextBoolean();
			//moveLeft = true;
			//moveLeft = false;
			if(moveLeft){
				bounceLeft(ball);
			}else{
				bounceRight(ball);
			}		
		}
		
		localesX[xyz] = ball.getX();		
		localesY[xyz] = ball.getY();	
		incrementTubeArray(ball, xyz);
	} 
	
	private void stackTube(GOval ball, double xyz, int t) {		
		
		switch(t){
		case 1:{
			stackMechanics(ball, xyz, t, 1);
			break;
			}
		case 2:{
			stackMechanics(ball, xyz, t, 2);
			break;
			}
		case 3:{
			stackMechanics(ball, xyz, t, 3);
			break;
			}
		case 4:{
			stackMechanics(ball, xyz, t, 4);
			break;
		}
		case 5:{
			stackMechanics(ball, xyz, t, 5);
			break;
			}
		case 6:{
			stackMechanics(ball, xyz, t, 6);
			break;
			}
		case 7:{
			stackMechanics(ball, xyz, t, 7);
			break;
			}
		case 8:{
			stackMechanics(ball, xyz, t, 8);
			break;
		}
		case 9: {
			stackMechanics(ball, xyz, t, 9);
			break;
			}
		case 10:{
			stackMechanics(ball, xyz, t, 10);
			break;
			}
		}
	}
	
	private void stackMechanics(GOval ball, double xyz, int t, int i) {
		
		while((ball.getY() < this.getHeight()-BALL_SIZE) && (ball.getY() < (getHeight() - BALL_SIZE*tubeContents[i-1]))){	
			gobj = getElementAt(ball.getX(), ball.getY());
			ball.move(DELTA_X, DELTA_Y);
			pause(PAUSE_TIME_TUBE);			
		}		
	}
	
	private void incrementTubeArray(GOval ball, int xyz) {		
		
		if((localesX[xyz] >0) && (localesX[xyz] < tubesX[1])){
			tubeContents[0]++; 
			stackTube(ball, localesX[xyz], 1);
		}		
		
		if((localesX[xyz] > tubesX[1]) && (localesX[xyz] < tubesX[2])){
			tubeContents[1]++; 
			stackTube(ball, localesX[xyz], 2);
		}			
		
		if((localesX[xyz] > tubesX[2]) && (localesX[xyz] < tubesX[3])){
			tubeContents[2]++; 
			stackTube(ball, localesX[xyz], 3);
		}		
		
		if((localesX[xyz] > tubesX[3]) && (localesX[xyz] < tubesX[4])){
			tubeContents[3]++;
			stackTube(ball, localesX[xyz], 4);
		}		
		
		if((localesX[xyz] > tubesX[4]) && (localesX[xyz] < tubesX[5])){
			tubeContents[4]++; 
			stackTube(ball, localesX[xyz], 5);
		}		
		
		if((localesX[xyz] > tubesX[5]) && (localesX[xyz] < tubesX[6])){
			tubeContents[5]++; 
			stackTube(ball, localesX[xyz], 6);
		}		
		
		if((localesX[xyz] > tubesX[6]) && (localesX[xyz] < tubesX[7])){
			tubeContents[6]++; 
			stackTube(ball, localesX[xyz], 7);
		}		
		
		if((localesX[xyz] > tubesX[7]) && (localesX[xyz] < tubesX[8])){
			tubeContents[7]++; 
			stackTube(ball, localesX[xyz], 8);
		}
		
		if((localesX[xyz] > tubesX[8]) && (localesX[xyz] < tubesX[9])){
			tubeContents[8]++; 
			stackTube(ball, localesX[xyz], 9);
		}
		if((localesX[xyz] > tubesX[9]) && (localesX[xyz] < tubesX[10])){
			tubeContents[9]++; 
			stackTube(ball, localesX[xyz], 10);
		}		
	}
	
	private void bounceLeft(GOval ball) {
		
		for(int x=0; x<4; x++)ball.move(getX()-3, getY()-2);					
		for(int y=0; y<3; y++)ball.move(getX()-1, getY()-1);	
		ball.move(getX()-2, getY());
		ball.move(getX()-0.5, getY()+2);
		for(int l=0; l<4; l++) ball.move(getX(), getY()+1);
		for(int z=0; z<12; z++) ball.move(getX(), getY()+2);
	}
	
	private void bounceRight(GOval ball) {
		
		for(int x=0; x<4; x++)ball.move(getX()+3, getY()-2);					
		for(int y=0; y<3; y++)ball.move(getX()+1, getY()-1);	
		ball.move(getX(), getY());
		ball.move(getX()+2.5, getY()+2);
		for(int l=0; l<4; l++) ball.move(getX(), getY()+1);
		for(int z=0; z<12; z++) ball.move(getX(), getY()+2);
	}
	
	private void setupBoard() {
		
		GLine[] line = new GLine[TUBE_NUMBER+1];
		
		for(int i=0; i<line.length; i++){
			line[i] = new GLine((getWidth()-(TUBE_WIDTH*TUBE_NUMBER))/2+TUBE_WIDTH*i, getHeight(), (getWidth()-(TUBE_WIDTH*TUBE_NUMBER))/2+TUBE_WIDTH*i, TUBE_HEIGHT);
			add(line[i]);
			tubesX[i] = line[i].getX();
		}		
		
		for(int row=0; row<PEG_NUMBER-1; row++){
			int pegsInRow = PEG_NUMBER - row;
			
			for(int pegNumber = 1; pegNumber<pegsInRow; pegNumber++){
				
				int x = (getWidth()/2 - (TUBE_WIDTH * pegsInRow) / 2 + ((pegNumber) * TUBE_WIDTH)) - PEG_WIDTH/2;	
				int y = TUBE_HEIGHT - (PEG_HEIGHT*3 + (PEG_HEIGHT * (row*2)));	
				peg[pegNumber] = new Peg(x, y);
				add(peg[pegNumber]);	 
				pegLocation[pegNumber] = peg[pegNumber].getBounds().getY();	
			}			
		}
	}
	
	private static final int TUBE_WIDTH=35;
	private static final int TUBE_NUMBER=10;
	private static final int TUBE_HEIGHT=320; 
	
	private static final int PEG_WIDTH=10;
	private static final int PEG_HEIGHT=10;
	private static final int PEG_NUMBER=10;

	private static final int BALL_START_POSITION=50;
	private static final double BALL_SIZE=10;
	private static final int BALL_NUMBER=50;
	
	private static final int DELTA_X=0;
	private static final int DELTA_Y=5;
	
	private static final int PAUSE_TIME = 30;
	private static final int PAUSE_TIME_TUBE = 5;
	
	private GObject gobj;
	
	RandomGenerator rgen = new RandomGenerator();
}
