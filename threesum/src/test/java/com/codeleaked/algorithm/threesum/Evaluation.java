package com.codeleaked.algorithm.threesum;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

@RunWith(Parameterized.class)
public class Evaluation {

    private Solution solution;

    private int[] nums;

    private List<List<Integer>> expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {
                        new int[]{-1, 0, 1, 2, -1, -4}
                        ,
                        Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1))
                }
        });
    }

    public Evaluation(int[] nums, List<List<Integer>> expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.threeSum(nums)).isEqualTo(expected);
    }

}
