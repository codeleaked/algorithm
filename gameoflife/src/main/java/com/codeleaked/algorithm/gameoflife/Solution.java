package com.codeleaked.algorithm.gameoflife;

public class Solution {
    private int[] dr = new int[]{ 0,  1, 1, 1};
    private int[] dc = new int[]{ 1, -1, 0, 1};

    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[] lastRow = new int[cols];
        int[] currentRow = new int[cols];
        for (int r = 0; r < rows; r++) {
            System.arraycopy(board[r], 0, currentRow, 0, cols);
            int lastCell = 0;
            for (int c = 0; c < cols; c++) {
                int currentCell = board[r][c];
                int lives = 0;

                if (r > 0) {
                    if (c > 0) {
                        lives += lastRow[c - 1];
                    }
                    lives += lastRow[c];
                    if (c < cols - 1) {
                        lives += lastRow[c + 1];
                    }
                }

                if (c > 0) {
                    lives += lastCell;
                }

                for (int i = 0; i < 4; ++i) {
                    int nr = r + dr[i];
                    int nc = c + dc[i];
                    if (nc < cols & nc >= 0 & nr < rows) {
                        lives += board[nr][nc];
                    }
                }

                if (board[r][c] == 1) {
                    if (lives < 2 || lives > 3) {
                        board[r][c] = 0;
                    }
                } else {
                    if (lives == 3) {
                        board[r][c] = 1;
                    }
                }

                lastCell = currentCell;
            }

            System.arraycopy(currentRow, 0, lastRow, 0, cols);
        }
    }

}
