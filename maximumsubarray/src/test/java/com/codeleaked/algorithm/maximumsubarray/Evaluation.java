package com.codeleaked.algorithm.maximumsubarray;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertThat(solution.maxSubArray(nums)).isEqualTo(6);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1};
        assertThat(solution.maxSubArray(nums)).isEqualTo(1);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 2};
        assertThat(solution.maxSubArray(nums)).isEqualTo(3);
    }

    @Test
    public void test4() {
        int[] nums = new int[]{-1};
        assertThat(solution.maxSubArray(nums)).isEqualTo(-1);
    }


}
