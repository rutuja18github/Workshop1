package com.tictactoe;

public class TicTacToeGame {
	char[] board=new char[10];

	public void boardGame() {
		for (int boardValue = 1; boardValue < board.length; boardValue++) {
           board [boardValue] =' ';
           System.out.println(board [boardValue]);

		}
	}
}
