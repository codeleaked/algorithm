package com.codeleaked.algorithm.validparentheses;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Evaluation {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void shouldReturnValid() {
        List<String> testCases = Arrays.asList(
                "",
                "()",
                "[]",
                "{}",
                "()[]{}",
                "{([])}",
                "[()(){}{}][]",
                "((([(){}()])))"
        );

        for (String testCase: testCases) {
            Assert.assertTrue(solution.isValid(testCase));
        }
    }

    @Test
    public void shouldReturnInvalid() {
        List<String> testCases = Arrays.asList(
                null,
                ")(",
                "][",
                "}{",
                "(]",
                "{(})",
                "((()])",
                "()[()()(])",
                "{}[()({])[]]"
        );

        for (String testCase: testCases) {
            Assert.assertFalse(solution.isValid(testCase));
        }
    }

    @Test
    public void shouldWorkWithBigTests() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10000000; ++i) {
            buffer.append("()[]");
        }
        Assert.assertTrue(solution.isValid(buffer.toString()));
    }

}
