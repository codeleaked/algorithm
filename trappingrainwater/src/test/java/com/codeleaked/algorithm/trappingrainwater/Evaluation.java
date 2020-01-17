package com.codeleaked.algorithm.trappingrainwater;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertThat(solution.trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1})).isEqualTo(6);
    }

    @Test
    public void test2() {
        assertThat(solution.trap(new int[] {2, 0, 2})).isEqualTo(2);
    }

}
