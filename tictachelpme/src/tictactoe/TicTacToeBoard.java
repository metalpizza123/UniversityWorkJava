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

	CellState[][] board;
	PlayerID turn;
	
	public TicTacToeBoard(){
		turn = PlayerID.PLAYER_ONE;
		  board = new CellState[][]{
			{CellState.EMPTY, CellState.EMPTY,CellState.EMPTY},
			{CellState.EMPTY,CellState.EMPTY,CellState.EMPTY},
			{CellState.EMPTY,CellState.EMPTY,CellState.EMPTY}
			};		
	}
	
	public boolean play(int row, int column){
		if(row < 0 || row > 2 || column <0 || column > 2){
			throw new IllegalArgumentException("Invalid row or column value. Must be 0, 1, or 2.");
		}
		if(board[row][column] == CellState.EMPTY){
			board[row][column] = (turn == PlayerID.PLAYER_ONE)?CellState.PLAYER_ONE:CellState.PLAYER_TWO;
			turn = (turn == PlayerID.PLAYER_ONE)?PlayerID.PLAYER_TWO:PlayerID.PLAYER_ONE;
			return true;
		}
		return false;
	}
	
	public String toString(){
		String output = "+-+-+-+\n";
		for(int row = 0; row < board.length; row++){
			output += String.format("|%s|%s|%s|\n", board[row][0], board[row][1], board[row][2]);
			output += "+-+-+-+\n";
		}
		return output;
	}
	
	public PlayerID winner(){
		CellState playerMark = null;
		
		// Diagonals
		if(board[1][1] != CellState.EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2]){
			playerMark = board[1][1];
			return playerMark == CellState.PLAYER_ONE? PlayerID.PLAYER_ONE : PlayerID.PLAYER_TWO;
		}
		if(board[1][1] != CellState.EMPTY && board[2][0] == board[1][1] && board[1][1] == board[0][2]){
			playerMark = board[1][1];
			return playerMark == CellState.PLAYER_ONE? PlayerID.PLAYER_ONE : PlayerID.PLAYER_TWO;
		}
		
		// Rows
		for(int row = 0; row < board.length; row++){
			if(board[row][0] != CellState.EMPTY && board[row][0] == board[row][1] && 
					board[row][1] == board[row][2]){
				playerMark = board[row][1];
				return playerMark == CellState.PLAYER_ONE? PlayerID.PLAYER_ONE : PlayerID.PLAYER_TWO;
			}			
		}

		// Columns
		for(int col = 0; col < board[0].length; col++){
			if(board[0][col] != CellState.EMPTY && board[0][col] == board[1][col] && 
					board[1][col] == board[2][col]){
				playerMark = board[1][col];
				return playerMark == CellState.PLAYER_ONE? PlayerID.PLAYER_ONE : PlayerID.PLAYER_TWO;
			}			
		}

		return null;
	}
	
	public boolean isDraw(){
		if(winner() != null){
			return false;
		} else {
			for(int row = 0; row < board.length; row ++){
				for(int col = 0; col < board[row].length; col++){
					if(board[row][col] == CellState.EMPTY){
						return false;
					}
				}
			}
			
		}
		return true;
	}
	
	public ArrayList<Point> getValidMoves(){
		ArrayList<Point> moves = new ArrayList<>();
		for(int row = 0; row < board.length; row ++){
			for(int col = 0; col < board[row].length; col++){
				if(board[row][col] == CellState.EMPTY){
					moves.add(new Point(row,col));
				}
			}
		}
		return moves;
	}
	
	public CellState getCellState(int row, int column){
		if(row < 0 || row > 2 || column <0 || column > 2){
			throw new IllegalArgumentException("Invalid row or column value. Must be 0, 1, or 2.");
		}
		return board[row][column];
	}
	
	public PlayerID getPlayerTurn(){
		return turn;
	}
	
	public TicTacToeBoard copy(){
		TicTacToeBoard copy = new TicTacToeBoard();
		copy.turn = this.turn;
		for(int row = 0; row < board.length; row ++){
			for(int col = 0; col < board[row].length; col++){
				copy.board[row][col] = board[row][col];
			}
		}		
		return copy;
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

}
