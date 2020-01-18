package com.codeleaked.algorithm.numberofislands;

public class Solution {

    private int[] dr = {0, 0, -1, 1};
    private int[] dc = {-1, 1, 0, 0};

    public int numIslands(char[][] grid) {
        int islands = 0;

        if (grid.length > 0 & grid[0].length > 0) {
            for (int r = 0; r < grid.length; ++r) {
                for (int c = 0; c < grid[0].length; ++c) {
                    if (grid[r][c] == '1') {
                        ++islands;
                        bfs(grid, r, c);
                    }
                }
            }
        }

        return islands;
    }

    private void bfs(char[][] grid, int r, int c) {
        grid[r][c] = '0';
        for (int k = 0; k < 4; ++k) {
            int row = r + dr[k];
            int col = c + dc[k];
            if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == '1') {
                bfs(grid, row, col);
            }
        }
    }

}
