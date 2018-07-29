package com.codeleaked.algorithm.slidingwindow;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] output = solution.maxSlidingWindow(nums, 3);
        assertThat(output).isEqualTo(new int[] {3,3,5,5,6,7});
    }

    @Test
    public void test2() {
        int[] nums = new int[]{};
        int[] output = solution.maxSlidingWindow(nums, 0);
        assertThat(output).isEmpty();
    }

}