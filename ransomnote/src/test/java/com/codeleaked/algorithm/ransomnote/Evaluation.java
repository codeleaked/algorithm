package com.codeleaked.algorithm.ransomnote;

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

    private String ransomNote;

    private String magazine;

    private boolean expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters(name = "{0}, {1} -> {2}")
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {"a", "b", false},
                {"aa", "ab", false},
                {"aa", "aab", true}
        });
    }

    public Evaluation(String ransomNote, String magazine, boolean expected) {
        this.ransomNote = ransomNote;
        this.magazine = magazine;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.canConstruct(ransomNote, magazine)).isEqualTo(expected);
    }

}
