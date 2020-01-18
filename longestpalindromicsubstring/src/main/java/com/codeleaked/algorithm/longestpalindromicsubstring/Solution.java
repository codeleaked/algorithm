package com.codeleaked.algorithm.longestpalindromicsubstring;

public class Solution {

    public String longestPalindrome(String s) {
        char[] str = s.toCharArray();
        String longest = "";
        boolean[][] palindrome = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            palindrome[i][i] = true;
            longest = s.substring(i, i + 1);
        }

        for (int i = 0; i < s.length() - 1; ++i) {
            palindrome[i][i + 1] = str[i] == str[i + 1];
            if (palindrome[i][i + 1]) {
                longest = s.substring(i, i + 2);
            }
        }

        for (int l = 2; l < s.length(); ++l) {
            for (int i = 0; i < s.length() - l; ++i) {
                palindrome[i][i + l] = palindrome[i + 1][i + l - 1] && (str[i] == str[i + l]);
                if (palindrome[i][i + l]) {
                    longest = s.substring(i, i + l + 1);
                }
            }
        }

        return longest;
    }

}
