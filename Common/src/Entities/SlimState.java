package Entities;

public class SlimState {
	
	private int [][] board;
	private int score;
	
	
	public SlimState(int[][] board, int score) {
		super();
		this.board = board;
		this.score = score;
	}
	
	public int[][] getBoard() {
		return board;
	}
	public void setBoard(int[][] board) {
		this.board = board;
	}
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
}
