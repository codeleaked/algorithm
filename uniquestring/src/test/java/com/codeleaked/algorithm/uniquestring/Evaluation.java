package com.codeleaked.algorithm.uniquestring;

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

    private String s;

    private boolean expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {
                        "abc",
                        true
                },
                {
                        "acdc",
                        false
                },
                {
                        "compass",
                        false
                },
                {
                        "unique",
                        false
                },
                {
                        "university",
                        false
                },
                {
                        "player",
                        true
                }
        });
    }

    public Evaluation(String s, boolean expected) {
        this.s = s;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.isUnique(s)).isEqualTo(expected);
    }

}
