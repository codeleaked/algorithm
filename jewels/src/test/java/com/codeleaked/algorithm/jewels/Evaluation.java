package com.codeleaked.algorithm.jewels;

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

    private String jewels;

    private String stones;

    private int expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters(name = "{0}, {1} -> {2}")
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {"aA", "aAAbbbb", 3},
                {"z", "ZZ", 0},
                {"ebd", "bbb", 3},
                {"bcd", "cba", 2},
                {"bce", "eea", 2},
                {"pjq", "ybi", 0},
                {"ejh", "fzi", 0},
                {"ngm", "kxg", 1},
                {"UGz", "YSb", 0},
                {"Iut", "HTF", 0},
                {"QcP", "SeW", 0},
                {"ace", "dadc", 2},
                {"bec", "deea", 2},
                {"acd", "eacc", 3},
                {"dbca", "beb", 2},
                {"ceba", "dcc", 2},
                {"badc", "ccc", 3},
                {"ucf", "vokz", 0},
                {"ony", "hukp", 0},
                {"wbn", "komd", 0},
                {"zpmd", "oog", 0},
                {"sckl", "vht", 0},
                {"gmet", "hui", 0},
                {"nEB", "jHMo", 0},
                {"aNE", "xGID", 0},
                {"kGn", "TSly", 0},
                {"jhkE", "OqG", 0},
                {"ZdyS", "haa", 0},
                {"mGwV", "rRV", 1},
                {"ebd", "eccea", 2},
                {"dce", "deede", 5},
                {"bedca", "cca", 3},
                {"ebcad", "bdd", 3},
                {"edbca", "cec", 3},
                {"ian", "hirsv", 1},
                {"dul", "hsfse", 0},
                {"aqz", "ktupy", 0},
                {"wmghx", "yia", 0},
                {"ogkjx", "fam", 0},
                {"rlgtp", "nsl", 1},
                {"oZU", "sggpX", 0},
                {"OEA", "xPYvv", 0},
                {"WKD", "kmHbS", 0},
                {"jzxPJ", "EbW", 0},
                {"uifLT", "cHk", 0}
        });
    }

    public Evaluation(String jewels, String stones, int expected) {
        this.jewels = jewels;
        this.stones = stones;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(solution.numJewelsInStones(jewels, stones)).isEqualTo(expected);
    }

}
