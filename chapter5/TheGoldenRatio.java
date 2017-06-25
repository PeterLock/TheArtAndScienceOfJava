/**
 * File name: TheGoldenRatio.java
 * ------------------------------
 * Classical mathematicians believed that the golden ration represented the
 * most aesthetically pleasing ratio for the dimensions of a rectangle. The
 * ratio also turns up in computational mathematics.
 * This program displays the value of the mathematical constant.
 * Programmer: Peter Lock
 * Date: 12/12/2015
 * 
 * φ = 1 + ⎯√ 5 / 2
 * 
 */

package com.chapter5;

import acm.program.ConsoleProgram;

public class TheGoldenRatio extends ConsoleProgram {
	    public void run(){
	    		    	
	        println(golden());
	    }
	    
	    public static double golden() {	        	        
	        return (1 + Math.sqrt(5))/2;
	    }
	    
}
	