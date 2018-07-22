package com.codeleaked.algorithm.permutation;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    boolean isPermutation(String s1, String s2) {
        Map<Character, Integer> counter = new HashMap<>();

        for (Character c: s1.toCharArray()) {
            if (!counter.containsKey(c)) {
                counter.put(c, 0);
            }
            counter.put(c, counter.get(c) + 1);
        }

        for (Character c: s2.toCharArray()) {
            if (!counter.containsKey(c) || counter.get(c) == 0) {
                return false;
            }
            counter.put(c, counter.get(c) - 1);
        }

        for (int value: counter.values()) {
            if (value > 0) {
                return false;
            }
        }

        return true;
    }

}
