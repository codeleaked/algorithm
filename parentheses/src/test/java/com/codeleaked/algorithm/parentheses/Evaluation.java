package com.codeleaked.algorithm.parentheses;

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

    private String expr;

    private boolean expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {"", true},
                {"()", true},
                {"{}", true},
                {"()[]{}", true},
                {"{([])}", true},
                {"[()(){}{}][]", true},
                {"((([(){}()])))", true},
                { bigValidParentheses(), true },

                {null, false},
                {")(", false},
                {"][", false},
                {"}{", false},
                {"(]", false},
                {"{(})", false},
                {"((()])", false},
                {"()[()()(])", false},
                {"{}[()({])[]]", false}
        });
    }

    public Evaluation(String expr, boolean expected) {
        this.expr = expr;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.isValid(expr)).isEqualTo(expected);
    }

    private static String bigValidParentheses() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < 10000000; ++i) {
            buffer.append("()[]");
        }
        return buffer.toString();
    }

}
