package com.codeleaked.algorithm.friendcircles;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        int[][] M = new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}

        };

        int groups = solution.findCircleNum(M);
        assertThat(groups).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[][] M = new int[][]{
                {1, 1, 0},
                {1, 1, 1},
                {0, 1, 1}

        };

        int groups = solution.findCircleNum(M);
        assertThat(groups).isEqualTo(1);
    }

}