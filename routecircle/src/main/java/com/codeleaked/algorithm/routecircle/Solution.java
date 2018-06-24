package com.codeleaked.algorithm.routecircle;

public class Solution {

    boolean judgeCircle(String moves) {
        int curX = 0;
        int curY = 0;

        for (char move: moves.toCharArray()) {
            switch (move) {
                case 'U':
                    ++curY;
                    break;
                case 'D':
                    --curY;
                    break;
                case 'L':
                    --curX;
                    break;
                case 'R':
                    ++curX;
                    break;
            }
        }

        return (curX == 0 && curY == 0);
    }

}
