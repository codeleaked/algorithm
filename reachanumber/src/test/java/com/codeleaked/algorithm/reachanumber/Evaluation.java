package com.codeleaked.algorithm.reachanumber;


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

    private int target;

    private int expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {3, 2},
                {2, 3},
                {-2, 3},
                {1, 1},
                {9, 5},
                {-1000000000, 44723}
        });
    }

    public Evaluation(int target, int expected) {
        this.target = target;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.reachNumber(target)).isEqualTo(expected);
    }

}
