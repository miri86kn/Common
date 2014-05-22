package Entities;

import java.io.Serializable;

public class SlimState implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int [][] board;
	private int score;
	
	public SlimState() {
		super();
	}
	
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
	
	public SlimState clone()
	{
		SlimState newSlim = new SlimState();
		int len = this.board[0].length;
		int[][] arr = new int[len][len];
		for(int i=0; i<len; i++){
			for(int j=0; j<len; j++){
				arr[i][j] = this.board[i][j];
			}
		}
		newSlim.setBoard(arr);
		newSlim.setScore(score);
		return newSlim;
	}
}
