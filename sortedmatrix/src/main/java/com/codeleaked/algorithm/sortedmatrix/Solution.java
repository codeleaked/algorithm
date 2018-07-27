package com.codeleaked.algorithm.sortedmatrix;

public class Solution {

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length - 1;
        int start = matrix[0][0];
        int end = matrix[n][n];

        while (start <= end) {
            int mid = (start + end) / 2;
            int count = smallerOrEqualCount(matrix, mid);
            if (count < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    private int smallerOrEqualCount(int[][] matrix, int mid) {
        int i = matrix.length - 1;
        int j = 0;
        int count = 0;

        while (i >= 0 && j <= matrix[0].length - 1) {
            if (matrix[i][j] <= mid) {
                count += i + 1;
                ++j;
            } else {
                --i;
            }
        }

        return count;
    }

}
