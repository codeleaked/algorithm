package com.codeleaked.algorithm.selfdividing;

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

    private int left;

    private int right;

    private List<Integer> expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    public Evaluation(int left, int right, List<Integer> expected) {
        this.left = left;
        this.right = right;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {
                        1,
                        22,
                        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22)
                }
        });
    }

    @Test
    public void test() {
        assertThat(solution.selfDividingNumbers(left, right)).isEqualTo(expected);
    }


}
