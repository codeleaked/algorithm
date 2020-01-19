package com.codeleaked.algorithm.uniquepaths;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        int[][] grid = new int[][]{
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}
        };

        assertThat(solution.uniquePathsIII(grid)).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[][] grid = new int[][]{
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 2}
        };

        assertThat(solution.uniquePathsIII(grid)).isEqualTo(4);
    }

    @Test
    public void test3() {
        int[][] grid = new int[][]{
                {0, 1},
                {2, 0}
        };

        assertThat(solution.uniquePathsIII(grid)).isEqualTo(0);
    }

}
