package com.codeleaked.algorithm.longestsubstringwithoutrepeating;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Boolean> seen = new HashMap<>();
        int start = 0, end = 0;
        int max = 0;
        while (end < s.length()) {
            while (seen.containsKey(s.charAt(end))) {
                seen.remove(s.charAt(start));
                ++start;
            }
            seen.put(s.charAt(end), true);
            max = Math.max(max, end - start + 1);
            ++end;
        }

        return max;
    }

}
