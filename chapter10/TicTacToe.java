package com.chapter10;

import java.util.Scanner;

public class TicTacToe
{
	// Grid variables
	//    0 for an empty square
	//    1 if the square contains X
	//    2 if the square contains O
	static int A1, A2, A3, B1, B2, B3, C1, C2, C3;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		String prompt = "Welcome to Tic-Tac-Toe. Please enter your first move: ";
		String humanMove = "";
		String computerMove = "";
		boolean gameIsWon = false;

		// There are a maximum of nine plays, so a for loop keeps track of
		// the number of plays. The game is over after the ninth play.
		// Each time through the loop, both the human and the computer play.
		// So i is incremented in the body of the loop after the computer plays.

		for (int i = 1; i <=9; i++)
		{
			// Human player

			humanMove = getMove(prompt);
			updateBoard(humanMove, 1);
			displayBoard();
			if (isGameWon())
			{
				System.out.println("You beat me!");
				gameIsWon = true;
				break;
			}

			// Computer player
			if (i < 9)
			{
				computerMove = getComputerMove();
				System.out.println("I will play at " + computerMove);
				updateBoard(computerMove, 2);
				displayBoard();
				if (isGameWon())
				{
					System.out.println("I beat you!");
					gameIsWon = true;
					break;
				}
				prompt = "Please enter your next move: ";
				i++;
			}
		}
		if (!gameIsWon)
			System.out.println("It's a draw!");
	}

	public static String getMove(String prompt)
	{
		String play;
		System.out.print(prompt);
		do
		{
			play = sc.nextLine();
			if (!isValidPlay(play))
			{
				System.out.println("That is not a valid play.");
			}
		} while (!isValidPlay(play));
		return play;
	}

	public static boolean isValidPlay(String play)
	{
		if (play.equalsIgnoreCase("A1") & A1 == 0)
			return true;
		if (play.equalsIgnoreCase("A2") & A2 == 0)
			return true;
		if (play.equalsIgnoreCase("A3") & A3 == 0)
			return true;
		if (play.equalsIgnoreCase("B1") & B1 == 0)
			return true;
		if (play.equalsIgnoreCase("B2") & B2 == 0)
			return true;
		if (play.equalsIgnoreCase("B3") & B3 == 0)
			return true;
		if (play.equalsIgnoreCase("C1") & C1 == 0)
			return true;
		if (play.equalsIgnoreCase("C2") & C2 == 0)
			return true;
		if (play.equalsIgnoreCase("C3") & C3 == 0)
			return true;
		return false;
	}

	public static void updateBoard(String play, int player)
	{
		if (play.equalsIgnoreCase("A1"))
			A1 = player;
		if (play.equalsIgnoreCase("A2"))
			A2 = player;
		if (play.equalsIgnoreCase("A3"))
			A3 = player;
		if (play.equalsIgnoreCase("B1"))
			B1 = player;
		if (play.equalsIgnoreCase("B2"))
			B2 = player;
		if (play.equalsIgnoreCase("B3"))
			B3 = player;
		if (play.equalsIgnoreCase("C1"))
			C1 = player;
		if (play.equalsIgnoreCase("C2"))
			C2 = player;
		if (play.equalsIgnoreCase("C3"))
			C3 = player;
	}

	public static void displayBoard()
	{
		String line = "";
		System.out.println();
		line = " " + getXO(A1) + " | " + getXO(A2) + " | " + getXO(A3);
		System.out.println(line);
		System.out.println("-----------");
		line = " " + getXO(B1) + " | " + getXO(B2) + " | " + getXO(B3);
		System.out.println(line);
		System.out.println("-----------");
		line = " " + getXO(C1) + " | " + getXO(C2) + " | " + getXO(C3);
		System.out.println(line);
		System.out.println();
	}

	public static String getXO(int square)
	{
		if (square == 1)
			return "X";
		if (square == 2)
			return "O";
		return " ";
	}

	public static String getComputerMove()
	{
		if (A1 == 0)
			return "A1";
		if (A2 == 0)
			return "A2";
		if (A3 == 0)
			return  "A3";
		if (B1 == 0)
			return  "B1";
		if (B2 == 0)
			return  "B2";
		if (B3 == 0)
			return  "B3";
		if (C1 == 0)
			return  "C1";
		if (C2 == 0)
			return  "C2";
		if (C3 == 0)
			return  "C3";
		return "";
	}

	public static boolean isGameWon()
	{
		if (isRowWon(A1, A2, A3))
			return true;
		if (isRowWon(B1, B2, B3))
			return true;
		if (isRowWon(C1, C2, C3))
			return true;
		if (isRowWon(A1, B1, C1))
			return true;
		if (isRowWon(A2, B2, C2))
			return true;
		if (isRowWon(A3, B3, C3))
			return true;
		if (isRowWon(A1, B2, C3))
			return true;
		if (isRowWon(A3, B2, C1))
			return true;
		return false;
	}

	public static boolean isRowWon(int a, int b, int c)
	{
		return ((a == b) & (a == c) & (a != 0));
	}
}

