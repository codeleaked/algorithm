package com.codeleaked.algorithm.search2dmatrix;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        int[][] matrix = new int[][] {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;

        assertThat(solution.searchMatrix(matrix, target)).isTrue();
    }

    @Test
    public void test2() {
        int[][] matrix = new int[][] {
                {-10}
        };
        int target = -5;

        assertThat(solution.searchMatrix(matrix, target)).isFalse();
    }

}
