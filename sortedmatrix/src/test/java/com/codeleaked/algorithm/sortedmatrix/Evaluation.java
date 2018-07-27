package com.codeleaked.algorithm.sortedmatrix;

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

    private int[][] matrix;

    private int expected;


    @Before
    public void setUp() {
        solution = new Solution();
    }

    public Evaluation(int[][] matrix, int expected) {
        this.matrix = matrix;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {
                        new int[][]{
                                {1, 5, 9},
                                {10, 11, 13},
                                {12, 13, 15}
                        },
                        13
                }
        });
    }

    @Test
    public void test() {
        assertThat(solution.kthSmallest(matrix, 8)).isEqualTo(expected);
    }


}