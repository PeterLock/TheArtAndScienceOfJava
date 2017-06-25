/**
 * File name: PascalsTriangleTestClass.java
 * ----------------------------------------
 * This program prints the first eight lines of Pascals Triangle
 * to the console.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/16
 */
package com.chapter5;
import acm.program.ConsoleProgram;

public class PascalsTriangleTestClass extends ConsoleProgram{

	public void run(){
		
        int rows = 8;

        for(int i =0;i<rows;i++) {

            int number = 1;

            System.out.format("%"+(rows-i)*2+"s","");

            for(int j=0;j<=i;j++) {

                 System.out.format("%4d",number);

                 number = number * (i - j) / (j + 1);
     
            }

            System.out.println();
	
        }
	}
}

