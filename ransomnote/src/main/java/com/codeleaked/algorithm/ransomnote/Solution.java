package com.codeleaked.algorithm.ransomnote;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> counter = new HashMap<>();

        for (char ch: magazine.toCharArray()) {
            if (counter.containsKey(ch)) {
                counter.put(ch, counter.get(ch) + 1);
            } else {
                counter.put(ch, 1);
            }
        }

        for (char ch: ransomNote.toCharArray()) {
            if (counter.containsKey(ch) && counter.get(ch) > 0) {
                counter.put(ch, counter.get(ch) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

}
