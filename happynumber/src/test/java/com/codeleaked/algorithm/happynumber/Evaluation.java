package com.codeleaked.algorithm.happynumber;

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

    private boolean expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters(name = "{0} -> {1}")
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {19, true}
        });
    }

    public Evaluation(int num, boolean expected) {
        this.num = num;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.isHappy(num)).isEqualTo(expected);
    }

}
