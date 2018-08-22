package com.codeleaked.algorithm.stringsubsequence;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                ++i;
                ++j;
            } else {
                ++j;
            }
        }

        if (i == s.length() && j == t.length()) {
            return true;
        } else {
            return (i == s.length());
        }
    }

}
