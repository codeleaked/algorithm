package com.codeleaked.algorithm.integertoenglishwords;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        assertThat(solution.numberToWords(123)).isEqualTo("One Hundred Twenty Three");
    }

    @Test
    public void test2() {
        assertThat(solution.numberToWords(12345)).isEqualTo("Twelve Thousand Three Hundred Forty Five");
    }

    @Test
    public void test3() {
        assertThat(solution.numberToWords(1234567)).isEqualTo(
                "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven");
    }

    @Test
    public void test4() {
        assertThat(solution.numberToWords(1234567891)).isEqualTo(
                "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One");
    }

    @Test
    public void test5() {
        assertThat(solution.numberToWords(0)).isEqualTo("Zero");
    }

    @Test
    public void test6() {
        assertThat(solution.numberToWords(100)).isEqualTo("One Hundred");
    }

    @Test
    public void test7() {
        assertThat(solution.numberToWords(50868)).isEqualTo("Fifty Thousand Eight Hundred Sixty Eight");
    }

    @Test
    public void test8() {
        assertThat(solution.numberToWords(100000)).isEqualTo("One Hundred Thousand");
    }
}
