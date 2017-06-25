/* File name: ThisOldMan.java
 * --------------------------
 * This program prints the lyrics to a song ten times, changing the number
 * in the first line as well as a word at the end of the second line.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/29
 */
package com.chapter4;

import acm.program.ConsoleProgram;

public class ThisOldMan extends ConsoleProgram {
	
	public void run(){
		
		playSong();
		
	}

	/* Method name: playSong
	 * ---------------------
	 * This method uses a for loop to play the versus of the song. The first
	 * line contains a number which is the for loops index position, the second
	 * line makes a call to the function getWord which will return the correct
	 * word to the println. The call to getWord passes the current index number
	 * to the method.
	 * precondition: none
	 * postcondition: Outputs the lyrics of the song to the screen.
	 */
	private void playSong() {
		
		for( int i = 1; i <= 10; i++ ){
			println("This old man he played " + i);
			println("He played knick-knack on my " + getWord(i));
			println("With a knick-knack, paddy-whack,");
			println("Give your dog a bone.");
			println("This old man came rolling home.");
			println("");
			println("");
		}	
	}

	/* Method name: getWord
	 * --------------------
	 * This method receives a number as a parameter in the range of 1-10,
	 * and using a switch statement returns a corresponding word to the calling
	 * method.
	 * precondition: Must receive a number in the range of 1-10 from the calling method
	 * postcondition: Returns a string to the invoking method.
	 * 
	 */
	private String getWord(int i) {

		switch(i){
		case 1: return("thumb");
		
		case 2: return("shoe");
		
		case 3: return("knee");
		
		case 4: return("door");
		
		case 5: return("hive");
		
		case 6: return("sticks");
		
		case 7: return("up to heaven");
		
		case 8: return("pate");
		
		case 9: return("spine");
		
		case 10: return("shin");
		
		default: 
			println("Error occured in the swtich statement.");
			break;
		}
		
		return null;
	}

}
