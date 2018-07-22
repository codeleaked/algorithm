package com.codeleaked.algorithm.matrixnearestdistance;

public class Solution {

    public Solution() {}

    public int[][] updateMatrix(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        int[][] output = new int[M][N];

        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < N; ++j) {
                if (matrix[i][j] == 0) {
                    output[i][j] = 0;
                } else {
                    output[i][j] = Math.max(M, N) + 1;
                }
            }
        }

        boolean stop = false;
        while (!stop) {
            stop = true;
            for (int i = 0; i < M; ++i) {
                for (int j = 0; j < N; ++j) {
                    if (i > 0 && output[i][j] > output[i - 1][j] + 1) {
                        output[i][j] = output[i - 1][j] + 1;
                        stop = false;
                    }
                    if (i < M - 1 && output[i][j] > output[i + 1][j] + 1) {
                        output[i][j] = output[i + 1][j] + 1;
                        stop = false;
                    }
                    if (j > 0 && output[i][j] > output[i][j - 1] + 1) {
                        output[i][j] = output[i][j - 1] + 1;
                        stop = false;
                    }
                    if (j < N - 1 && output[i][j] > output[i][j + 1] + 1) {
                        output[i][j] = output[i][j + 1] + 1;
                        stop = false;
                    }
                }
            }
        }

        return output;
    }


}
