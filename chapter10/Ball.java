package com.chapter10;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Ball extends GraphicsProgram{
	
	int ballX = 0;
	int ballY = 0;
	
	public void Ball(){
		
		GOval ball = new GOval(this.ballX, this.ballY, 10,10);
		add(ball);
	}
	
	public void move2(int x, int y){
		ballX = x;
		ballY = y;
	}

}
