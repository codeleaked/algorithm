package com.codeleaked.algorithm.longestpalindromicsubstring;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        assertThat(solution.longestPalindrome("babad")).isAnyOf("bab", "aba");
    }

    @Test
    public void test2() {
        assertThat(solution.longestPalindrome("cbbd")).isEqualTo("bb");
    }

    @Test
    public void test3() {
        assertThat(solution.longestPalindrome("")).isEqualTo("");
    }

    @Test
    public void test4() {
        assertThat(solution.longestPalindrome("a")).isEqualTo("a");
    }

}
