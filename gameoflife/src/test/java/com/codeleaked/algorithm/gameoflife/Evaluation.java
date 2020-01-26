package com.codeleaked.algorithm.gameoflife;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        int[][] board = new int[][] {
                { 0, 1, 0},
                { 0, 0, 1},
                { 1, 1, 1},
                { 0, 0, 0}
        };

        solution.gameOfLife(board);

        assertThat(board[0][0]).isEqualTo(0);
        assertThat(board[0][1]).isEqualTo(0);
        assertThat(board[0][2]).isEqualTo(0);
        assertThat(board[1][0]).isEqualTo(1);
        assertThat(board[1][1]).isEqualTo(0);
        assertThat(board[1][2]).isEqualTo(1);
        assertThat(board[2][0]).isEqualTo(0);
        assertThat(board[2][1]).isEqualTo(1);
        assertThat(board[2][2]).isEqualTo(1);
        assertThat(board[3][0]).isEqualTo(0);
        assertThat(board[3][1]).isEqualTo(1);
        assertThat(board[3][2]).isEqualTo(0);
    }

}
