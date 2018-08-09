package com.codeleaked.algorithm.topfrequentelements;

import org.junit.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;

        List<Integer> output = solution.topKFrequent(nums, k);

        assertThat(output).hasSize(2);
        assertThat(output.get(0)).isEqualTo(1);
        assertThat(output.get(1)).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1};
        int k = 1;

        List<Integer> output = solution.topKFrequent(nums, k);

        assertThat(output).hasSize(1);
        assertThat(output.get(0)).isEqualTo(1);
    }


    @Test
    public void test3() {
        int[] nums = new int[]{4,1,-1,2,-1,2,3};
        int k = 2;

        List<Integer> output = solution.topKFrequent(nums, k);

        assertThat(output).hasSize(2);
        assertThat(output.get(0)).isEqualTo(-1);
        assertThat(output.get(1)).isEqualTo(2);
    }


}