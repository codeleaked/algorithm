package com.codeleaked.algorithm.flippingimage;

public class Solution {

    int[][] flipAndInvertImage(int[][] A) {
        int num = A[0].length;
        for (int[] row: A) {
            for (int i = 0; i < (num + 1) / 2; ++i) {
                int tmp = 1 - row[i];
                row[i ] = 1 - row[num - i - 1];
                row[num - i - 1] = tmp;
            }
        }

        return A;
    }
}
