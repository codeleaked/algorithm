package com.codeleaked.algorithm.longestsubstringwithoutrepeating;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertThat(solution.lengthOfLongestSubstring("abc")).isEqualTo(3);
    }

    @Test
    public void test2() {
        assertThat(solution.lengthOfLongestSubstring("b")).isEqualTo(1);
    }

    @Test
    public void test3() {
        assertThat(solution.lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
    }

    @Test
    public void test4() {
        assertThat(solution.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
    }

}
