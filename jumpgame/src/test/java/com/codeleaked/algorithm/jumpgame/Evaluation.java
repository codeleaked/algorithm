package com.codeleaked.algorithm.jumpgame;

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

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                { new int[] {2, 3, 1, 1, 4}, 2 },
                { new int[] {1}, 0 },
                { new int[] {2, 1}, 1 },
                { new int[] {3, 2, 1}, 1 },
                { new int[] {2, 3, 1}, 1 },
                { new int[] {1, 1, 1, 1}, 3 },
                { new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0}, 2 }
        });
    }

    public Evaluation(int[] nums, int expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.jump(nums)).isEqualTo(expected);
    }

}
