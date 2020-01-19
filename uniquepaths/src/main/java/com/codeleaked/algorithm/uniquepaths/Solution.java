package com.codeleaked.algorithm.uniquepaths;

public class Solution {

    private int m;
    private int n;
    private int count;
    private int totalSquares;
    private int totalPaths;
    boolean[][] visited;
    int[] dx = new int[] { 0, 0, -1, 1 };
    int[] dy = new int[] {-1, 1,  0, 0 };

    public int uniquePathsIII(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int sourceX = 0, sourceY = 0, targetX = 0, targetY = 0;
        for (int x = 0; x < m; ++x) {
            for (int y = 0; y < n; ++y) {
                if (grid[x][y] == 1) {
                    sourceX = x;
                    sourceY = y;
                } else if (grid[x][y] == 2) {
                    targetX = x;
                    targetY = y;
                } else if (grid[x][y] == 0) {
                    ++totalSquares;
                }
            }
        }

        visited = new boolean[m][n];
        count = 0;
        visited[sourceX][sourceY] = true;
        traverse(grid, sourceX, sourceY, targetX, targetY);

        return totalPaths;
    }

    private void traverse(int[][] grid, int x, int y, int targetX, int targetY) {
        for (int k = 0; k < 4; ++k) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && grid[nx][ny] != -1) {
                if (count == totalSquares && nx == targetX && ny == targetY) {
                    ++totalPaths;
                } else {
                    ++count;
                    visited[nx][ny] = true;
                    traverse(grid, nx, ny, targetX, targetY);
                    visited[nx][ny] = false;
                    --count;
                }
            }
        }
    }

}
