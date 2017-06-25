package com.chapter8;

import acm.program.GraphicsProgram;

public class LincolnMemorial extends GraphicsProgram{
	
	private LincolnMemorialParts top1 = new LincolnMemorialParts('t');
	private LincolnMemorialParts top2 = new LincolnMemorialParts('p');
	private LincolnMemorialParts middle = new LincolnMemorialParts('m');
	private LincolnMemorialParts bottom = new LincolnMemorialParts('b');
	private LincolnMemorialParts person = new LincolnMemorialParts('y');
	
	public void run(){
		top1.setLocation(getWidth()/2 - top1.getMemorialTop1Width()/2, top1.getMemorialTopHeight());
		add(top1);
	
		top2.setLocation(getWidth()/2 - top2.getMemorialTop2Width()/2, top2.getMemorialTopHeight()*2);
		add(top2);
		
		middle.setLocation(getWidth()/2 - middle.getMemorialMiddleWidth()/2, top1.getMemorialTopHeight()*3);
		add(middle);
		
		bottom.setLocation(getWidth()/2 - bottom.getMemorialBottomWidth()/2, 400);
		add(bottom);
		
		person.setLocation(person.getPoleWidth()*14-2, 400-(person.getPersonHeight()));
		add(person);
		
	}


}
