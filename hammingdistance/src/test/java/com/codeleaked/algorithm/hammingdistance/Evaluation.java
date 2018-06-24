package com.codeleaked.algorithm.hammingdistance;

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

    private int x;

    private int y;

    private int expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters(name = "{0}, {1} -> {2}")
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] {
                { 1, 4, 2 },
                { 0, 0, 0 }
        });
    }

    public Evaluation(int x, int y, int expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.hammingDistance(x, y)).isEqualTo(expected);
    }

}
