package com.codeleaked.algorithm.networkdelay;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        int[][] times = new int[][] {
                {2, 1, 1},
                {2, 3, 1},
                {3, 4, 1}
        };

        int maxDelay = solution.networkDelayTime(times, 4, 2);
        assertThat(maxDelay).isEqualTo(2);
    }


}