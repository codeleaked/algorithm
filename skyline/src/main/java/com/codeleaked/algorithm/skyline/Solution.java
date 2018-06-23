package com.codeleaked.algorithm.skyline;

class Solution {

    int maxIncreaseKeepingSkyline(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] maxHorizontal = new int[m];
        int[] maxVertical = new int[n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (maxHorizontal[i] < grid[i][j]) {
                    maxHorizontal[i] = grid[i][j];
                }
                if (maxVertical[j] < grid[i][j]) {
                    maxVertical[j] = grid[i][j];
                }
            }
        }

        int result = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int maxHeight = Math.min(maxHorizontal[i], maxVertical[j]);
                if (grid[i][j] < maxHeight) {
                    result += maxHeight - grid[i][j];
                    grid[i][j] = maxHeight;
                }
            }
        }

        return result;
    }

}
