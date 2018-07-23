package com.codeleaked.algorithm.twokeys;

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

    private int num;

    private int expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {3, 3},
                {3, 3}
        });
    }

    public Evaluation(int num, int expected) {
        this.num = num;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.minSteps(num)).isEqualTo(expected);
    }

}
