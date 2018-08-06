package com.codeleaked.algorithm.maximalsquare;

public class Solution {

    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] maxLen = new int[n][m];
        int max = 0;
        for (int i = 0; i < n; ++i) {
            if (matrix[i][0] == '1') {
                max = 1;
                maxLen[i][0] = 1;
            }
        }

        for (int j = 0; j < m; ++j) {
            if (matrix[0][j] == '1') {
                max = 1;
                maxLen[0][j] = 1;
            }
        }

        for (int i = 1; i < n; ++i) {
            for (int j = 1; j < m; ++j) {
                if (matrix[i][j] == '1') {
                    maxLen[i][j] = Math.min(Math.min(maxLen[i - 1][j], maxLen[i][j - 1]), maxLen[i - 1][j - 1]) + 1;
                    if (max < maxLen[i][j]) {
                        max = maxLen[i][j];
                    }
                }
            }
        }

        return max * max;
    }

}
