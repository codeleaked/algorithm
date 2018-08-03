package com.codeleaked.algorithm.longestsubstringwithoutrepeating;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int maxLength = 1;
        for (int i = 0; i < s.length(); ++i) {
            boolean repeating = false;
            for (int j = i + maxLength; j < s.length(); ++j) {
                boolean duplicated = false;
                Set<Character> characters = new HashSet<>();
                for (int k = i; k <= j; ++k) {
                    if (characters.contains(s.charAt(k))) {
                        duplicated = true;
                        break;
                    } else {
                        characters.add(s.charAt(k));
                    }
                }
                if (!duplicated && maxLength < j - i + 1) {
                    maxLength = j - i + 1;
                }
            }
        }
        return maxLength;
    }


}
