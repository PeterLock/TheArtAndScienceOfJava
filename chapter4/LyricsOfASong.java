/* File name: LyricsOfASong.java
 * -----------------------------
 * As a way to pass the time on long bus trips, young people growing up in
 * the United States have been known to sing the following rather repetitive
 * song:
 * 
 * 99 bottles of beer on the wall.
 * 99 bottles of beer.
 * You take one down, pass it around.
 * 98 bottles of beer on the wall.
 * 
 * 98 bottles of beer on the wall ....
 * 
 * This program generates the lyrics to this song.
 * 
 * Coder: Peter Lock
 * Date: 2015/11/29
 * 
 */

package com.chapter4;

import acm.program.ConsoleProgram;

public class LyricsOfASong  extends ConsoleProgram{
	
	public void run(){
		
		showMessage();
		
		showSong(INITIAL_NUMBER);		
	}
	
	/* Method name: showSong
	 * ---------------------
	 * This method contains a for loop starting from a constant number and
	 * going down to zero all while displaying the lyrics to the song and
	 * while adjusting the number in the song until it reaches zero. When
	 * the next number in the index is zero a final message is displayed.
	 * precondition: receive the INITIAL_NUMBER as a parameter.
	 * postcondition: outputs the words to the song.
	 */
	private void showSong(int initialNumber) {
		
		for( int x = INITIAL_NUMBER; x > 0; x--){
			
			println( x + " bottles of beer on the wall.");
			println( x + " bottles of beer.");
			println("You take one down, pass it around.");
			if((x-1) == 0 ){
				println("No more bottles of beer on the wall.");
			}
			else{
				println((x-1) + " bottles of beer on the wall.");
				println("");				
			}
		}	
	}

	/* Method name: showMessage
	 * ------------------------
	 * This message shows the introductory message to the user.
	 * precondition: none
	 * postcondition: Message is sent to the screen.
	 */
	private void showMessage() {
		println("As a way to pass the time on long bus trips, young people growing up");
		println("in the United States have been known to sing the following rather repetitive song.");
		println("");
	}
	
	// The constant for the starting point of the song.
	private final static int INITIAL_NUMBER=99;

}
