package com.codeleaked.algorithm.mountainpeak;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.google.common.truth.Truth.assertThat;

@RunWith(Parameterized.class)
public class Evaluation {

    private Solution solution;

    private int[] nums;

    private int expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    public Evaluation(int[] nums, int expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {
                        new int[]{0, 1, 0},
                        1
                },
                {
                        new int[]{0, 2, 1, 0},
                        1
                }
        });
    }

    @Test
    public void test() {
        assertThat(solution.peakIndexInMountainArray(nums)).isEqualTo(expected);
    }

}
