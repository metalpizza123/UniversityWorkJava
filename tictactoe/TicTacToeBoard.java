package tictactoe;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;


public class TicTacToeBoard {
	
	public enum PlayerID {
		PLAYER_ONE, PLAYER_TWO
	}
	
	public enum CellState {
		EMPTY(" "),
		PLAYER_ONE("X"),
		PLAYER_TWO("O");
		
		private final String icon;
		
		CellState(String icon){
			this.icon = icon;
		}
		
		@Override
		public String toString(){
			return this.icon;
		}
	}

	/**
	 * Represent the game board as a 2D array of CellState. We use enum object
	 * to ensure that only the three possible values are used.
	 */
	CellState[][] board;

	/**
	 * Represents whose turn it is to play the next time play(int,int) is
	 * called. We use an enum object PlayerID to ensure only the two possible
	 * values are used. We cannot use a CellState object as the value EMPTY is
	 * not a valid value for a player. Therefore we use another enum type.
	 */
	PlayerID turn;

	/**
	 * The constructor must initialise board to a 3x3 2D array fill with the
	 * value CellState.EMPTY. In addition the turn should be initialised to the
	 * first player to play, i.e. PlayerID.PLAYER_ONE.
	 */
	public TicTacToeBoard(){
	}
	

	/**
	 * Mark the cell (row, column) with the current player (define by turn). The
	 * method returns true if the play was successful, false if that cell has
	 * been already marked.
	 * 
	 * @param row
	 *            the row of the cell to be checked
	 * @param column
	 *            the column of the cell to be checked
	 * @return true if the play was successful, false if that cell has been
	 *         already marked.
	 * 
	 * @throws IllegalArgumentException
	 *             if row or column are not comprised between 0 and 2 inclusive,
	 *             or if the board is already full.
	 */
	public boolean play(int row, int column) {
		return false;
	}

	@Override
	public String toString() {
		return null;
	}
	
	@Override
	public boolean equals(Object other){
		if(this == other){
			return true;
		}
		if(!(other instanceof TicTacToeBoard)){
			return false;
		}
		TicTacToeBoard otherBoard = (TicTacToeBoard) other;
		if(otherBoard.turn != this.turn){
			return false;
		}
		if(otherBoard.board.length != this.board.length){
			return false;
		}
		for(int row = 0; row < otherBoard.board.length; row++){
			if(otherBoard.board[row].length != this.board[row].length){
				return false;
			}
			if(!Arrays.equals(otherBoard.board[row], this.board[row])){
				return false;
			}
		}
		return true;
	}


	/**
	 * Returns the player ID who has won the game (PlayerID.PLAYER_ONE or
	 * PlayerID.PLAYER_TWO), null if there is no winner.
	 * 
	 * @return the player ID who won the game (PlayerID.PLAYER_ONE or
	 *         PlayerID.PLAYER_TWO), null if there is no winner.
	 */
	public PlayerID winner() {
		return null;
	}

	/**
	 * Returns true if the game is a draw, false otherwise. A game is considered
	 * a draw if there are no more move available (e.g. the board is full) and
	 * there is no winner.
	 * 
	 * @return true if the game is a draw, false otherwise
	 */
	public boolean isDraw() {
		return false;
	}

	/**
	 * Return the list of all remaining valid moves on the board. The method
	 * returns an empty list if the board is full, i.e. no other move are
	 * possible. A move is represented by a Point object where Point.x is the
	 * row on the board, and Point.y is the column. The first row is a x=0 and
	 * the last row is at x=2, similarly the first column is at y-0 and the last
	 * at y=2.
	 * 
	 * @return the list of valid move, an empty list if the board is full
	 */
	public ArrayList<Point> getValidMoves() {
		return null;
	}

	/**
	 * Return the current state of the board for a given cell
	 * 
	 * @param row
	 *            the row of the cell to be checked
	 * @param col
	 *            the column of the cell to be checked
	 * @return the current state of the board at position (row, column).
	 */
	public CellState getCellState(int row, int col) {
		return null;
	}

	/**
	 * Returns the player ID of the player to play the next move, i.e. the
	 * player ID that will mark the next cell when play(int,int) is called.
	 * 
	 * @return the player ID of the player to play the next move.
	 */
	public PlayerID getPlayerTurn() {
		return null;
	}

	/**
	 * Make a deep copy of the board. This means that change to the copied game
	 * will not affect the current game. This will be useful later on in the
	 * term. The method should create a new TicTacToeBoard, copy the current
	 * state of the game to that new game, and copy the current player turn.
	 * 
	 * @return a deep copy of the current game.
	 */
	public TicTacToeBoard copy() {
		return null;
	}
}
