package com.codeleaked.algorithm.stringsubsequence;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

@RunWith(Parameterized.class)
public class Evaluation {

    private Solution solution;

    private String s;

    private String t;

    private boolean expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    public Evaluation(String s, String t, boolean expected) {
        this.s = s;
        this.t = t;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {"abc", "ahbgdc", true},
                {"axc", "ahbgdc", false}
        });
    }

    @Test
    public void test() {
        assertThat(solution.isSubsequence(s, t)).isEqualTo(expected);
    }


}
