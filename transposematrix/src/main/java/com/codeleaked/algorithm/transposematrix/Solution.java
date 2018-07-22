package com.codeleaked.algorithm.transposematrix;

public class Solution {

    public int[][] transpose(int[][] A) {
        int[][] B = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; ++i) {
            B[i] = new int[A[0].length];
        }

        for (int i = 0; i < A.length; ++i) {
            for (int j = 0; j < A[i].length; ++j) {
                B[i][j] = A[j][i];
            }
        }

        return B;
    }

}
