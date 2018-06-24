package com.codeleaked.algorithm.routecircle;

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

    private String moves;

    private boolean expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters(name = "{0} -> {1}")
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] {
                { "UD", true },
                { "LL", false },
                { "LDRRLRUULR", false },
                { "DURDLDRRLL", false }
        });
    }

    public Evaluation(String moves, boolean expected) {
        this.moves = moves;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.judgeCircle(moves)).isEqualTo(expected);
    }

}
