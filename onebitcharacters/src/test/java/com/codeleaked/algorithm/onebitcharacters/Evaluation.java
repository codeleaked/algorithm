package com.codeleaked.algorithm.onebitcharacters;

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

    private int[] bits;

    private boolean expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters(name = "{0} -> {1}")
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] {
                { new int[] {1, 0, 0}, true },
                { new int[] {1, 1, 1, 0}, false }
        });
    }

    public Evaluation(int[] bits, boolean expected) {
        this.bits = bits;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.isOneBitCharacter(bits)).isEqualTo(expected);
    }

}
