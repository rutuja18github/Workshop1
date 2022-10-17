package com.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	// create array of size 10
	Scanner scanner = new Scanner(System.in);
	char[] board = new char[10];
	char computer, player;

	// create board assign value to board
	public void boardGame() {
		for (int boardValue = 0; boardValue < board.length; boardValue++) {
			board[boardValue+1] = ' ';// Assign value to board

		}
	}
    //player's choice X or O
	public void choiceOfPlayer() {
		System.out.println("Player to choose a letter X or O");
		char option = scanner.next().charAt(0);
		switch (option) {
		case 'X':
			player = 'X';
			computer = 'O';
			break;
		case 'O':
			player = 'O';
			computer = 'X';
			break;
		default:
			System.out.println("Invalid Intput");
			break;
		}
	}
}
