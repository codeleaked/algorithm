package com.codeleaked.algorithm.reorderdatainlogfiles;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        String[] logs = new String[] {
            "dig1 8 1 5 1",
            "let1 art can",
            "dig2 3 6",
            "let2 own kit dig",
            "let3 art zero"
        };

        String[] output = solution.reorderLogFiles(logs);
        assertThat(output.length).isEqualTo(5);
        assertThat(output[0]).isEqualTo("let1 art can");
        assertThat(output[1]).isEqualTo("let3 art zero");
        assertThat(output[2]).isEqualTo("let2 own kit dig");
        assertThat(output[3]).isEqualTo("dig1 8 1 5 1");
        assertThat(output[4]).isEqualTo("dig2 3 6");
    }

    @Test
    public void test2() {
        String[] logs = new String[] {
                "a1 9 2 3 1",
                "g1 act car",
                "zo4 4 7",
                "ab1 off key dog",
                "a8 act zoo",
                "a2 act car"
        };

        String[] output = solution.reorderLogFiles(logs);
        assertThat(output.length).isEqualTo(6);
        assertThat(output[0]).isEqualTo("a2 act car");
        assertThat(output[1]).isEqualTo("g1 act car");
        assertThat(output[2]).isEqualTo("a8 act zoo");
        assertThat(output[3]).isEqualTo("ab1 off key dog");
        assertThat(output[4]).isEqualTo("a1 9 2 3 1");
        assertThat(output[5]).isEqualTo("zo4 4 7");
    }

}
