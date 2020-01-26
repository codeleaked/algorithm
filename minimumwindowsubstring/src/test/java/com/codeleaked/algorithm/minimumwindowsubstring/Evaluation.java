package com.codeleaked.algorithm.minimumwindowsubstring;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        assertThat(solution.minWindow("ADOBECODEBANC", "ABC")).isEqualTo("BANC");
    }

    @Test
    public void test2() {
        assertThat(solution.minWindow("ab", "b")).isEqualTo("b");
    }

    @Test
    public void test3() {
        assertThat(solution.minWindow("aa", "aa")).isEqualTo("aa");
    }

    @Test
    public void test4() {
        assertThat(solution.minWindow("bbaac", "aba")).isEqualTo("baa");
    }

}
