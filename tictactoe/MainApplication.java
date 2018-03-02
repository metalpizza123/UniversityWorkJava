package tictactoe;

import java.awt.Point;

import tictactoe.TicTacToeBoard.PlayerID;

public class MainApplication {

	public static void main(String[] args) {
		// For the game we need a board and two players playing on the same
		// board
		TicTacToeBoard game = new TicTacToeBoard();
		AIPlayer player_one = new AIPlayer(game, PlayerID.PLAYER_ONE);
		AIPlayer player_two = new AIPlayer(game, PlayerID.PLAYER_TWO);

		// Display the empty board at the start of the game
		System.out.println(game);

		// Enter the game loop. The loop finishes when a player wins or it is a
		// draw
		while (!game.isDraw() && game.winner() == null) {
			//Check which player should play next
			if (player_one.getID() == game.getPlayerTurn()) { //Player one's turn
				
				// get the move from the player
				Point move = player_one.getMove();
				// play that move on the board
				game.play(move.x, move.y);
				
			} else { //Player one's turn
				
				// get the move from the player
				Point move = player_two.getMove();
				// play that move on the board
				game.play(move.x, move.y);
			}
			
			// Display the updated board
			System.out.println(game);
		}
		
		// Game loop is finished, therefore we have winner or a draw.
		if (game.isDraw()) {
			System.out.println("It's a draw!");
		} else {
			if (game.winner() == PlayerID.PLAYER_ONE) {
				System.out.println("Player One wins the game!");
			} else {
				System.out.println("Player Two wins the game!");
			}
		}

	}

}
