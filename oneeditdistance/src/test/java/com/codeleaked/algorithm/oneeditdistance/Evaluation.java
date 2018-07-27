package com.codeleaked.algorithm.oneeditdistance;

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

    private String s1;

    private String s2;

    private boolean expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters(name = "{0}, {1} -> {2}")
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {"pale", "pal", true},
                {"pales", "pale", true},
                {"pale", "bale", true},
                {"pale", "bake", false},
                {"world", "could", false},
                {"bas", "s", false}
        });
    }

    public Evaluation(String s1, String s2, boolean expected) {
        this.s1 = s1;
        this.s2 = s2;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.isOneEditDistance(s1, s2)).isEqualTo(expected);
    }

}
