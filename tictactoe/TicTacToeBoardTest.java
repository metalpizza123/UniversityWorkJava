package tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import tictactoe.TicTacToeBoard.CellState;
import tictactoe.TicTacToeBoard.PlayerID;


public class TicTacToeBoardTest {

	public static final Point MOVE1 = new Point(0,0);
	public static final Point MOVE2 = new Point(0,1);
	public static final Point MOVE3 = new Point(0,2);
	public static final Point MOVE4 = new Point(1,0);
	public static final Point MOVE5 = new Point(1,1);
	public static final Point MOVE6 = new Point(1,2);
	public static final Point MOVE7 = new Point(2,0);
	public static final Point MOVE8 = new Point(2,1);
	public static final Point MOVE9 = new Point(2,2);

	public static boolean array2Dequals(CellState[][] a1, CellState[][] a2){
		if(a1.length != a2.length){
			return false;
		}
		for(int row = 0; row < a1.length; row++){
			if(a1[row].length != a2[row].length){
				return false;
			}
			if(!Arrays.equals(a1[row], a2[row])){
				return false;
			}
		}
		return true;
	}

	@Test
	public void testTicTacToeBoard() {
		TicTacToeBoard board = new TicTacToeBoard();
		CellState[][] expectedBoard = {
				{CellState.EMPTY, CellState.EMPTY,CellState.EMPTY},
				{CellState.EMPTY,CellState.EMPTY,CellState.EMPTY},
				{CellState.EMPTY,CellState.EMPTY,CellState.EMPTY}
		};
		assertEquals(PlayerID.PLAYER_ONE, board.turn);
		assertTrue(array2Dequals(expectedBoard, board.board));
	}

	@Test
	public void testPlay() {
		TicTacToeBoard board = new TicTacToeBoard();
		assertTrue(board.play(1, 1));
		CellState[][] expectedBoard = {
				{CellState.EMPTY, CellState.EMPTY,CellState.EMPTY},
				{CellState.EMPTY,CellState.PLAYER_ONE,CellState.EMPTY},
				{CellState.EMPTY,CellState.EMPTY,CellState.EMPTY}
		};
		assertTrue(array2Dequals(expectedBoard, board.board));
		assertEquals(PlayerID.PLAYER_TWO, board.turn);

		assertTrue(board.play(1, 0));
		expectedBoard = new CellState[][]{
			{CellState.EMPTY, CellState.EMPTY,CellState.EMPTY},
			{CellState.PLAYER_TWO,CellState.PLAYER_ONE,CellState.EMPTY},
			{CellState.EMPTY,CellState.EMPTY,CellState.EMPTY}
		};
		assertTrue(array2Dequals(expectedBoard, board.board));
		assertEquals(PlayerID.PLAYER_ONE, board.turn);

		assertFalse(board.play(1, 0));
		assertTrue(array2Dequals(expectedBoard, board.board));
		assertEquals(PlayerID.PLAYER_ONE, board.turn);

		assertTrue(board.play(0, 0));
		assertEquals(PlayerID.PLAYER_TWO, board.turn);
		assertTrue(board.play(0, 1));
		assertEquals(PlayerID.PLAYER_ONE, board.turn);
		assertTrue(board.play(0, 2));
		assertEquals(PlayerID.PLAYER_TWO, board.turn);
		assertTrue(board.play(2, 0));
		assertEquals(PlayerID.PLAYER_ONE, board.turn);
		assertTrue(board.play(2, 1));
		assertEquals(PlayerID.PLAYER_TWO, board.turn);
		assertTrue(board.play(2, 2));
		assertEquals(PlayerID.PLAYER_ONE, board.turn);
		assertTrue(board.play(1, 2));
		assertEquals(PlayerID.PLAYER_TWO, board.turn);

		expectedBoard = new CellState[][]{
			{CellState.PLAYER_ONE, CellState.PLAYER_TWO,CellState.PLAYER_ONE},
			{CellState.PLAYER_TWO,CellState.PLAYER_ONE,CellState.PLAYER_ONE},
			{CellState.PLAYER_TWO,CellState.PLAYER_ONE,CellState.PLAYER_TWO}
		};
		assertTrue(array2Dequals(expectedBoard, board.board));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPlayError1() {
		TicTacToeBoard board = new TicTacToeBoard();
		board.play(1, 3);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPlayError2() {
		TicTacToeBoard board = new TicTacToeBoard();
		board.play(3, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPlayError3() {
		TicTacToeBoard board = new TicTacToeBoard();
		board.play(-1, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPlayError4() {
		TicTacToeBoard board = new TicTacToeBoard();
		board.play(1, -1);
	}


	@Test
	public void testWinner() {
		TicTacToeBoard board = new TicTacToeBoard();
		assertNull(board.winner());
		
		//    TEST DIAGONALS
		board.board = new CellState[][]{
				{CellState.PLAYER_ONE, CellState.PLAYER_TWO,CellState.EMPTY},
				{CellState.EMPTY,CellState.PLAYER_ONE,CellState.EMPTY},
				{CellState.PLAYER_TWO,CellState.EMPTY,CellState.PLAYER_ONE}
		};
		assertEquals(PlayerID.PLAYER_ONE, board.winner());
		
		board.board = new CellState[][]{
			{CellState.PLAYER_ONE, CellState.PLAYER_TWO,CellState.PLAYER_TWO},
			{CellState.PLAYER_ONE,CellState.PLAYER_TWO,CellState.PLAYER_ONE},
			{CellState.PLAYER_TWO,CellState.PLAYER_ONE,CellState.PLAYER_ONE}
		};
		assertEquals(PlayerID.PLAYER_TWO, board.winner());

		//     TEST COLUMNS
		board.board = new CellState[][]{
			{CellState.PLAYER_TWO, CellState.PLAYER_TWO,CellState.PLAYER_ONE},
			{CellState.PLAYER_ONE,CellState.PLAYER_TWO,CellState.PLAYER_ONE},
			{CellState.PLAYER_TWO,CellState.PLAYER_ONE,CellState.PLAYER_ONE}
		};
		assertEquals(PlayerID.PLAYER_ONE, board.winner());
		
		board.board = new CellState[][]{
			{CellState.PLAYER_ONE, CellState.PLAYER_TWO,CellState.PLAYER_ONE},
			{CellState.PLAYER_ONE,CellState.PLAYER_TWO,CellState.PLAYER_TWO},
			{CellState.PLAYER_ONE,CellState.PLAYER_ONE,CellState.PLAYER_TWO}
		};
		assertEquals(PlayerID.PLAYER_ONE, board.winner());
		
		board.board = new CellState[][]{
			{CellState.PLAYER_ONE, CellState.PLAYER_ONE,CellState.PLAYER_ONE},
			{CellState.PLAYER_TWO,CellState.PLAYER_ONE,CellState.PLAYER_TWO},
			{CellState.PLAYER_TWO,CellState.PLAYER_ONE,CellState.PLAYER_TWO}
		};
		assertEquals(PlayerID.PLAYER_ONE, board.winner());
		
		//     TEST ROWS
		board.board = new CellState[][]{
			{CellState.PLAYER_ONE, CellState.PLAYER_ONE,CellState.PLAYER_ONE},
			{CellState.PLAYER_ONE,CellState.PLAYER_TWO,CellState.PLAYER_TWO},
			{CellState.PLAYER_TWO,CellState.PLAYER_TWO,CellState.PLAYER_ONE}
		};
		assertEquals(PlayerID.PLAYER_ONE, board.winner());
		
		board.board = new CellState[][]{
			{CellState.PLAYER_TWO, CellState.PLAYER_TWO,CellState.PLAYER_ONE},
			{CellState.PLAYER_ONE,CellState.PLAYER_ONE,CellState.PLAYER_ONE},
			{CellState.PLAYER_TWO,CellState.PLAYER_ONE,CellState.PLAYER_TWO}
		};
		assertEquals(PlayerID.PLAYER_ONE, board.winner());
		
		board.board = new CellState[][]{
			{CellState.PLAYER_ONE, CellState.PLAYER_ONE,CellState.PLAYER_ONE},
			{CellState.PLAYER_TWO,CellState.PLAYER_ONE,CellState.PLAYER_TWO},
			{CellState.PLAYER_TWO,CellState.PLAYER_ONE,CellState.PLAYER_TWO}
		};
		assertEquals(PlayerID.PLAYER_ONE, board.winner());
		
	}

	@Test
	public void testIsDraw() {
		TicTacToeBoard board = new TicTacToeBoard();
		assertFalse(board.isDraw());
		
		//    TEST DIAGONALS
		board.board = new CellState[][]{
				{CellState.PLAYER_ONE, CellState.PLAYER_TWO,CellState.EMPTY},
				{CellState.EMPTY,CellState.PLAYER_ONE,CellState.EMPTY},
				{CellState.PLAYER_TWO,CellState.EMPTY,CellState.PLAYER_ONE}
		};
		assertFalse(board.isDraw());
		
		board.board = new CellState[][]{
			{CellState.PLAYER_ONE, CellState.PLAYER_TWO,CellState.PLAYER_ONE},
			{CellState.PLAYER_ONE,CellState.PLAYER_TWO,CellState.PLAYER_ONE},
			{CellState.PLAYER_TWO,CellState.PLAYER_ONE,CellState.PLAYER_TWO}
		};
		assertTrue(board.isDraw());
	}

	@Test
	public void testGetValidMoves() {
		ArrayList<Point> moves = new ArrayList<>(Arrays.asList(new Point[]
				{MOVE1, MOVE2, MOVE3, MOVE4, MOVE5, MOVE6, MOVE7, MOVE8, MOVE9}));
		TicTacToeBoard board = new TicTacToeBoard();
		assertTrue(board.getValidMoves().containsAll(moves));
		board.play(0, 0);
		assertTrue(board.getValidMoves().containsAll(moves.subList(1, moves.size())));
		board.play(0, 1);
		assertTrue(board.getValidMoves().containsAll(moves.subList(2, moves.size())));
		board.play(0, 2);
		assertTrue(board.getValidMoves().containsAll(moves.subList(3, moves.size())));
		board.play(1, 0);
		assertTrue(board.getValidMoves().containsAll(moves.subList(4, moves.size())));
		board.play(1, 1);
		assertTrue(board.getValidMoves().containsAll(moves.subList(5, moves.size())));
		board.play(1, 2);
		assertTrue(board.getValidMoves().containsAll(moves.subList(6, moves.size())));
		board.play(2, 0);
		assertTrue(board.getValidMoves().containsAll(moves.subList(7, moves.size())));
		board.play(2, 1);
		assertTrue(board.getValidMoves().containsAll(moves.subList(8, moves.size())));
		board.play(2, 2);
		assertTrue(board.getValidMoves().isEmpty());

	}

	@Test
	public void testGetBoxState() {
		TicTacToeBoard board = new TicTacToeBoard();
		assertEquals(CellState.EMPTY, board.getCellState(0, 0));
		board.play(0, 0);
		assertEquals(CellState.PLAYER_ONE, board.getCellState(0, 0));

		assertEquals(CellState.EMPTY, board.getCellState(1, 0));
		board.play(1, 0);
		assertEquals(CellState.PLAYER_TWO, board.getCellState(1, 0));

		board.play(1, 0);
		assertEquals(CellState.PLAYER_TWO, board.getCellState(1, 0));

		board.play(2, 0);
		assertEquals(CellState.PLAYER_ONE, board.getCellState(2, 0));
		board.play(0, 1);
		assertEquals(CellState.PLAYER_TWO, board.getCellState(0, 1));
		board.play(1, 1);
		assertEquals(CellState.PLAYER_ONE, board.getCellState(1, 1));
		board.play(2, 1);
		assertEquals(CellState.PLAYER_TWO, board.getCellState(2, 1));
		board.play(0, 2);
		assertEquals(CellState.PLAYER_ONE, board.getCellState(0, 2));
		board.play(1, 2);
		assertEquals(CellState.PLAYER_TWO, board.getCellState(1, 2));
		board.play(2, 2);
		assertEquals(CellState.PLAYER_ONE, board.getCellState(2, 2));

	}

	@Test
	public void testGetPlayerTurn() {
		TicTacToeBoard board = new TicTacToeBoard();
		assertEquals(PlayerID.PLAYER_ONE, board.getPlayerTurn());
		assertTrue(board.play(1, 1));
		assertEquals(PlayerID.PLAYER_TWO, board.getPlayerTurn());
	}

	@Test
	public void testCopy() {
		TicTacToeBoard board = new TicTacToeBoard();
		TicTacToeBoard copy = board.copy();
		assertTrue(array2Dequals(copy.board, board.board));
		assertEquals(copy.turn, board.turn);
		board.play(1, 1);
		assertFalse(array2Dequals(copy.board, board.board));
		assertNotEquals(copy.turn, board.turn);
		copy = board.copy();
		assertTrue(array2Dequals(copy.board, board.board));
		assertEquals(copy.turn, board.turn);		
	}

	@Test
	public void testEquals() {
		TicTacToeBoard board1 = new TicTacToeBoard();
		TicTacToeBoard board2 = new TicTacToeBoard();
		assertEquals(board1, board2);

		board1.play(0, 0);
		board2.play(0, 0);
		assertEquals(board1, board2);

		board1.play(0, 1);
		board2.play(1, 0);
		assertNotEquals(board1, board2);

		board1.play(0, 2);
		board1.play(1, 0);
		board1.play(1, 1);
		board1.play(1, 2);
		board1.play(2, 0);
		board1.play(2, 1);
		board1.play(2, 2);

		board2.play(0, 2);
		board2.play(0, 1);
		board2.play(1, 1);
		board2.play(1, 2);
		board2.play(2, 0);
		board2.play(2, 1);
		board2.play(2, 2);
		assertEquals(board2,board1);
	}

}
