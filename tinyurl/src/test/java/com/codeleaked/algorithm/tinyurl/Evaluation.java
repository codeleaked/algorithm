package com.codeleaked.algorithm.tinyurl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test() {
        List<String> urls = Arrays.asList(
                "https://leetcode.com/problems/design-tinyurl",
                "http://google.com",
                "https://stackoverflow.com/questions/600733/using-java-to-find-substring-of-a-bigger-string-using-regular-expression",
                "http://google.com",
                "https://github.com/codeleaked/algorithm",
                "https://github.com/codeleaked/algorithm"
        );

        List<String> shortenUrls = new ArrayList<>();

        for (String url: urls) {
            String tinyUrl = solution.encode(url);
            shortenUrls.add(tinyUrl);
        }

        for (int i = 0; i < urls.size(); ++i) {
            String shortenUrl = shortenUrls.get(i);
            String url = urls.get(i);
            assertThat(solution.decode(shortenUrl)).isEqualTo(url);
        }
    }

}
