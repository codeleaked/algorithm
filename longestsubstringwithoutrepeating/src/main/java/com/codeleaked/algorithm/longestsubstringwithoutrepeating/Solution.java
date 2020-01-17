package com.codeleaked.algorithm.longestsubstringwithoutrepeating;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int[] maxLength = new int[s.length()];
        int[] pos = new int[255];
        for (int i = 0; i < 255; ++i) {
            pos[i] = -1;
        }
        for (int i = 0; i < s.length(); ++i) {
            int lastPos = pos[s.charAt(i)];

            int max = i - lastPos;
            for (int j = i - 1; j > lastPos; --j) {
                if (max > maxLength[j] + i - j) {
                    max = maxLength[j] + i - j;
                }
            }
            maxLength[i] = max;
            pos[s.charAt(i)] = i;
        }

        int max = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (max < maxLength[i]) {
                max = maxLength[i];
            }
        }
        return max;
    }

}
