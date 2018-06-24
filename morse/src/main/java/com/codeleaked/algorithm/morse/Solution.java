package com.codeleaked.algorithm.morse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    private static Map<Character, String> morses;
    static {
        morses = new HashMap<>();
        morses.put('a', ".-");
        morses.put('b', "-...");
        morses.put('c', "-.-.");
        morses.put('d', "-..");
        morses.put('e', ".");
        morses.put('f', "..-.");
        morses.put('g', "--.");
        morses.put('h', "....");
        morses.put('i', "..");
        morses.put('j', ".---");
        morses.put('k', "-.-");
        morses.put('l', ".-..");
        morses.put('m', "--");
        morses.put('n', "-.");
        morses.put('o', "---");
        morses.put('p', ".--.");
        morses.put('q', "--.-");
        morses.put('r', ".-.");
        morses.put('s', "...");
        morses.put('t', "-");
        morses.put('u', "..-");
        morses.put('v', "...-");
        morses.put('w', ".--");
        morses.put('x', "-..-");
        morses.put('y', "-.--");
        morses.put('z', "--..");
    }

    int uniqueMorseRepresentations(String[] words) {
        Set<String> allMorses = new HashSet<>();

        for (String word: words) {
            String morse = toMorseCode(word);
            allMorses.add(morse);
        }

        return allMorses.size();
    }

    private static String toMorseCode(String word) {
        StringBuilder builder = new StringBuilder();

        for (char c: word.toCharArray()) {
            builder.append(morses.get(c));
        }

        return builder.toString();
    }

}
