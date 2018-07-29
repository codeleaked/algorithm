package com.codeleaked.algorithm.wordladder;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Lists.newArrayList("hot","dot","dog","lot","log","cog");

        List<List<String>> output = solution.findLadders(beginWord, endWord, wordList);
        assertThat(output).hasSize(2);
    }

}