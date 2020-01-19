package com.codeleaked.algorithm.reorderdatainlogfiles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {

    static class Line {
        String original;
        String word;
        int index;
        boolean isLetterLog;

        Line(String original, int index) {
            this.original = original;
            this.index = index;
            word = original.substring(original.indexOf(' ') + 1);
            isLetterLog = word.charAt(0) >= 'a' && word.charAt(0) <= 'z';
        }
    }

    public String[] reorderLogFiles(String[] logs) {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < logs.length; ++i) {
            Line line = new Line(logs[i], i);
            lines.add(line);
        }
        lines.sort((line, other) -> {
            if (line.isLetterLog) {
                if (other.isLetterLog) {
                    if (line.word.equals(other.word)) {
                        return line.original.compareTo(other.original);
                    } else {
                        return line.word.compareTo(other.word);
                    }
                } else {
                    return -1;
                }
            } else {
                if (other.isLetterLog) {
                    return 1;
                } else {
                    return Integer.compare(line.index, other.index);
                }
            }
        });

        String[] output = new String[logs.length];
        for (int i = 0; i < lines.size(); ++i) {
            output[i] = lines.get(i).original;
        }
        return output;
    }

}
