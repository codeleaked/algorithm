package com.codeleaked.algorithm.skyline;

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

    private int[][] grid;

    private int expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {
                        new int[][]{
                                {3, 0, 8, 4},
                                {2, 4, 5, 7},
                                {9, 2, 6, 3},
                                {0, 3, 1, 0}
                        },
                        35
                }
        });
    }

    public Evaluation(int[][] building, int expected) {
        this.grid = building;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.maxIncreaseKeepingSkyline(grid)).isEqualTo(expected);
    }

}
