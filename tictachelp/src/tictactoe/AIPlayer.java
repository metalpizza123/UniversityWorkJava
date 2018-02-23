package tictactoe;

import java.awt.Point;

import tictactoe.TicTacToeBoard.PlayerID;

public class AIPlayer {

	/**
	 * The id of the player, either TicTacToeBoard.PlayerID.PLAYER_ONE or
	 * TicTacToeBoard.PlayerID.PLAYER_TWO
	 */
	TicTacToeBoard.PlayerID id;
	
	/**
	 * The game board to play on.
	 */
	TicTacToeBoard game;

	public AIPlayer(TicTacToeBoard game, TicTacToeBoard.PlayerID id) {
	}
	
	/**
	 * Returns the player ID.
	 * @return the player id.
	 */
	public PlayerID getID(){
		return null;
	}

	/**
	 * return the next move for this player. The format of the move is a
	 * java.awt.Point P where P.x is the row, and P.y is the column on the board
	 * game. The value of row and column are comprised between 0 and 2
	 * inclusive.
	 * 
	 * @return the next move for that player.
	 */
	public Point getMove() {
		return null;
	}

}
