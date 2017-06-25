package com.chapter3;


/*
 * File: InchesToCentimeters.java
 * ------------------------------
 * This program converts inches to centimeters.
 * Coder: Peter Lock
 * Date: 2015/11/24
 */
import acm.program.ConsoleProgram;
public class InchesToCentimeters extends ConsoleProgram {
public void run() {
      println("This program converts feet and inches to centimeters.");
      
      int feet = readInt("Enter the number of feet: ");
      int inches = readInt("Enter the number of inches: ");
      
      int centimeters = (int) ((double) (feet * INCHES_PER_FOOT  * CENTIMETERS_PER_INCH) + (inches*CENTIMETERS_PER_INCH));
      
      println(feet + "ft " + inches + " inches" + " = " + centimeters + "cm");
      
}
   private static final double CENTIMETERS_PER_INCH = 2.54;
   private static final int INCHES_PER_FOOT = 12;

}