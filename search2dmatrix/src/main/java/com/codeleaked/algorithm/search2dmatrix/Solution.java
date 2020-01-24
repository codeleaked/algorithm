package com.codeleaked.algorithm.search2dmatrix;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) {
            return false;
        }
        int col = matrix[0].length;
        if (col == 0) {
            return false;
        }

        int r = 0;
        int c = col - 1;

        while (r < row && c >= 0 && matrix[r][c] != target) {
            if (matrix[r][c] > target) {
                --c;
            } else {
                ++r;
            }
        }

        return (r < row && c >= 0);
    }

}
