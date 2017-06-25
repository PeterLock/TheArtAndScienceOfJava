/**
 * File name: BeaconsOfGondor.java
 * -------------------------------
 * Message passing in linked structures: The beacons of Gondor:
 * 
 * For answer Gandalf cried aloud to his horse. “On, Shadowfax! We must hasten.
 * Time is short. See! The beacons of Gondor are alight, calling for aid. War 
 * is kindled. See, there is the fire on Amon Dîn, and flame on Eilenach; and 
 * there they go speeding west: Nardol, Erelas, Min-Rimmon, Calenhad, and the
 * Halifirien on the borders of Rohan.”
 * —J. R. R. Tolkien, The Return of the King, 1955
 * 
 * This program creates a graphical representation of linked structures using 
 * this example.
 * 
 * Programmer: Peter Lock
 * Date: 2016/1/5
 */
package com.chapter8;

import java.awt.Point;
import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;

public class BeaconsOfGondor extends GraphicsProgram implements Runnable{

	private Object gobj;
	public String flag = "";

	SignalTower[] towers = new SignalTower[10];

	SignalTower rohan = new SignalTower("Rohan", null);
	SignalTower halifirien = new SignalTower("Halifirien", rohan);
	SignalTower calenhad = new SignalTower("Calenhad", halifirien);
	SignalTower minRimmon = new SignalTower("Min-Rimmon", calenhad);
	SignalTower erelas = new SignalTower("Erelas", minRimmon);
	SignalTower nardol = new SignalTower("Nardol", erelas);
	SignalTower eilenach = new SignalTower("Eilenach", nardol);
	SignalTower amonDin = new SignalTower("Amon Din", eilenach);
	SignalTower minasTirith = new SignalTower("Minas Tirith", amonDin);


	public void run(){
		createTowers();
		addMouseListeners();
		//	minasTirith.signal();
	}

	private void createTowers() {
		add(minasTirith);
		minasTirith.setLocation(minasTirith.getTowerSpace(), 30);		
		add(amonDin);
		amonDin.setLocation(amonDin.getTowerSpace()*2, 30);		
		add(eilenach);
		eilenach.setLocation(eilenach.getTowerSpace()*3, 30);	
		add(nardol);
		nardol.setLocation(nardol.getTowerSpace()*4, 30);		
		add(erelas);
		erelas.setLocation(erelas.getTowerSpace()*5, 30); 
		add(minRimmon);
		minRimmon.setLocation(minRimmon.getTowerSpace()*6, 30);		
		add(calenhad);
		calenhad.setLocation(calenhad.getTowerSpace()*7, 30);		
		add(halifirien);
		halifirien.setLocation(halifirien.getTowerSpace()*8, 30);		
		add(rohan);
		rohan.setLocation(rohan.getTowerSpace()*9, 30);					
	}


	public void mousePressed(MouseEvent e) {

		gobj = getElementAt(e.getX(), e.getY());	   
		if(gobj != null){
			Point mp = e.getPoint();	   

			if(minasTirith.contains(mp.getX(), mp.getY())) minasTirith.signal();	
			if(amonDin.contains(mp.getX(), mp.getY())) amonDin.signal();
			if(eilenach.contains(mp.getX(), mp.getY())) eilenach.signal(); 
			if(nardol.contains(mp.getX(), mp.getY())) nardol.signal();
			if(erelas.contains(mp.getX(), mp.getY())) erelas.signal();	  
			if(minRimmon.contains(mp.getX(), mp.getY())) minRimmon.signal();
			if(calenhad.contains(mp.getX(), mp.getY())) calenhad.signal();
			if(halifirien.contains(mp.getX(), mp.getY())) halifirien.signal();
			if(rohan.contains(mp.getX(), mp.getY())) rohan.signal();		
		}

	}

}



