package com.codeleaked.algorithm.jewelsstones;

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

    private String jewels;

    private String stones;

    private int expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters(name = "{0}, {1} -> {2}")
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] {
                { "aA", "aAAbbbb", 3 },
                { "z", "ZZ", 0 }
        });
    }

    public Evaluation(String jewels, String stones, int expected) {
        this.jewels = jewels;
        this.stones = stones;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.numJewelsInStones(jewels, stones)).isEqualTo(expected);
    }

}
