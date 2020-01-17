package com.codeleaked.algorithm.longestsubstringwithoutrepeating;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i = 0;
        int j = 0;
        Set<Character> found = new HashSet<>();

        while (i < s.length() && j < s.length()) {
            if (!found.contains(s.charAt(j))) {
                maxLength = Math.max(maxLength, j - i + 1);
                found.add(s.charAt(j));
                ++j;
            } else {
                found.remove(s.charAt(i));
                ++i;
            }
        }

        return maxLength;
    }

}
