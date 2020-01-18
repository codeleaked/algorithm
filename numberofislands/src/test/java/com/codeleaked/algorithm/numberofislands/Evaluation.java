package com.codeleaked.algorithm.numberofislands;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        assertThat(solution.numIslands(grid)).isEqualTo(1);
    }

    @Test
    public void test2() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        assertThat(solution.numIslands(grid)).isEqualTo(3);
    }

    @Test
    public void test3() {
        char[][] grid = {
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'}
        };

        assertThat(solution.numIslands(grid)).isEqualTo(1);
    }

    @Test
    public void test4() {
        char[][] grid = { {} };

        assertThat(solution.numIslands(grid)).isEqualTo(0);
    }

}
