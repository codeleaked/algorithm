package com.codeleaked.algorithm.jewels;

import java.util.Set;
import java.util.stream.Collectors;

class Solution {

    int numJewelsInStones(String J, String S) {
        Set<Character> jewels = J.chars().mapToObj(j -> (char)j).collect(Collectors.toSet());
        return (int)S.chars().mapToLong(s -> (jewels.contains((char)s) ? 1 : 0)).sum();
    }

}
