package com.codeleaked.algorithm.onethreetwo;

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

    private boolean expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4}, false},
                {new int[]{3, 1, 4, 2}, true},
                {new int[]{-1, 3, 2, 0}, true}
        });
    }

    public Evaluation(int[] nums, boolean expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.find132pattern(nums)).isEqualTo(expected);
    }

}
