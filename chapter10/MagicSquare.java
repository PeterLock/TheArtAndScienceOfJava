package com.chapter10;

public class MagicSquare 
{

	public static void main (String[] args) 
	{ 
		int N = Integer.parseInt(args[0]);
		if (N % 2 == 0) throw new RuntimeException("N must be odd");

		int[][] magic = new int[N][N];

		int row = N-1;
		int col = N/2;
		magic[row][col] = 1;

		for (int i = 2; i <= N*N; i++) {
			if (magic[(row + 1) % N][(col + 1) % N] == 0) {
				row = (row + 1) % N;
				col = (col + 1) % N;
			}
			else {
				row = (row - 1 + N) % N;
				
			}
			magic[row][col] = i;
		}

		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (magic[i][j] < 10)  System.out.print(" "); 
				if (magic[i][j] < 100) System.out.print(" "); 
				System.out.print(magic[i][j] + " ");
			}
			System.out.println();
		}

	}
}

