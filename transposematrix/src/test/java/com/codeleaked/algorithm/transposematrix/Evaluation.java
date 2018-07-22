package com.codeleaked.algorithm.transposematrix;

import org.junit.Test;
import org.junit.Before;
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
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        },
                        new int[][]{
                                {1, 4, 7},
                                {2, 5, 8},
                                {3, 6, 9}
                        }
                }
        });
    }

    @Test
    public void test() {
        assertThat(solution.transpose(matrix)).isEqualTo(expected);
    }


}