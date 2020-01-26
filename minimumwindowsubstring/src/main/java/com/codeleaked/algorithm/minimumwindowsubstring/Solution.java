package com.codeleaked.algorithm.minimumwindowsubstring;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public String minWindow(String s, String t) {
        Map<Character, Integer> occurrences = new HashMap<>();
        for (char c: t.toCharArray()) {
            haveSeen(occurrences, c);
        }

        int left = 0;
        int right = 0;
        int seenCount = 0;
        Map<Character, Integer> seen = new HashMap<>();
        while (right < s.length() && seenCount < occurrences.size()) {
            char c = s.charAt(right);
            if (occurrences.containsKey(c)) {
                haveSeen(seen, c);
                if (seen.get(c).equals(occurrences.get(c))) {
                    ++seenCount;
                }
            }
            ++right;
        }

        if (seenCount < occurrences.size()) {
            return "";
        }

        String window = s.substring(0, right);
        int min = right;
        while (left < right) {
            char c = s.charAt(left);
            boolean needToReplace = false;
            if (occurrences.containsKey(c)) {
                seen.put(c, seen.get(c) - 1);
                if (seen.get(c) < occurrences.get(c)) {
                    needToReplace = true;
                }
            }
            ++left;
            boolean replaced = false;
            if (needToReplace) {
                while (right < s.length() && s.charAt(right) != c) {
                    if (occurrences.containsKey(s.charAt(right))) {
                        haveSeen(seen, s.charAt(right));
                    }
                    ++right;
                }
                if (right < s.length() && s.charAt(right) == c) {
                    replaced = true;
                    seen.put(c, seen.get(c) + 1);
                    ++right;
                }
            }
            if (needToReplace && !replaced) {
                break;
            } else if (min > right - left) {
                min = right - left;
                window = s.substring(left, right);
            }
        }

        return window;
    }

    private void haveSeen(Map<Character, Integer> seen, char c) {
        if (seen.containsKey(c)) {
            seen.put(c, seen.get(c) + 1);
        } else {
            seen.put(c, 1);
        }
    }

}
