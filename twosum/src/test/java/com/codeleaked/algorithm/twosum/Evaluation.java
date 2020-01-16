package com.codeleaked.algorithm.twosum;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] output = solution.twoSum(nums, 9);
        assertThat(output).isEqualTo(new int[]{0, 1});
    }

    @Test
    public void test2() {
        int[] nums = new int[]{3, 2, 4};
        int[] output = solution.twoSum(nums, 6);
        assertThat(output).isEqualTo(new int[]{1, 2});
    }

    @Test
    public void test3() {
        int[] nums = new int[]{3, 3};
        int[] output = solution.twoSum(nums, 6);
        assertThat(output).isEqualTo(new int[]{0, 1});
    }

    @Test
    public void test4() {
        int[] nums = new int[]{2, 5, 5, 11};
        int[] output = solution.twoSum(nums, 10);
        assertThat(output).isEqualTo(new int[]{1, 2});
    }

}