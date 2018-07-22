package com.codeleaked.algorithm.uniquestring;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isUnique(String s) {
        Map<Character, Boolean> exists = new HashMap<>();

        for (char c: s.toCharArray()) {
            if (exists.containsKey(c)) {
                return false;
            }
            exists.put(c, true);
        }

        return true;
    }

}
