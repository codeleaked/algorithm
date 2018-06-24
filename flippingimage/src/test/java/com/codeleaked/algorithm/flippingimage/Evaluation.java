package com.codeleaked.algorithm.flippingimage;

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

    private int[][] nums;

    private int[][] expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    public Evaluation(int[][] nums, int[][] expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {
                        new int[][]{
                                {1, 1, 0},
                                {1, 0, 1},
                                {0, 0, 0}
                        },
                        new int[][]{
                                {1, 0, 0},
                                {0, 1, 0},
                                {1, 1, 1}
                        }
                },
                {
                        new int[][]{
                                {1, 1, 0, 0},
                                {1, 0, 0, 1},
                                {0, 1, 1, 1},
                                {1, 0, 1, 0}
                        },
                        new int[][]{
                                {1, 1, 0, 0},
                                {0, 1, 1, 0},
                                {0, 0, 0, 1},
                                {1, 0, 1, 0}
                        }
                }
        });
    }

    @Test
    public void test() {
        assertThat(solution.flipAndInvertImage(nums)).isEqualTo(expected);
    }


}
