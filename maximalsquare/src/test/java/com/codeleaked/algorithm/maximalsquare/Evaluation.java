package com.codeleaked.algorithm.maximalsquare;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        int output = solution.maximalSquare(matrix);
        assertThat(output).isEqualTo(4);
    }

    @Test
    public void test2() {
        char[][] matrix = new char[][]{
                {'1'}
        };

        int output = solution.maximalSquare(matrix);
        assertThat(output).isEqualTo(1);
    }

    @Test
    public void test3() {
        char[][] matrix = new char[][]{
                {'0', '1'}
        };

        int output = solution.maximalSquare(matrix);
        assertThat(output).isEqualTo(1);
    }

    @Test
    public void test4() {
        char[][] matrix = new char[][]{
                {'0', '1'},
                {'1', '0'}
        };

        int output = solution.maximalSquare(matrix);
        assertThat(output).isEqualTo(1);
    }

    @Test
    public void test5() {
        char[][] matrix = new char[][]{
                {'1', '1'},
                {'1', '1'}
        };

        int output = solution.maximalSquare(matrix);
        assertThat(output).isEqualTo(4);
    }

    @Test
    public void test6() {
        char[][] matrix = new char[][]{
                {'1', '1', '1', '1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1', '0', '0', '0'},
                {'0', '1', '1', '1', '1', '0', '0', '0'}
        };

        int output = solution.maximalSquare(matrix);
        assertThat(output).isEqualTo(16);

    }

}