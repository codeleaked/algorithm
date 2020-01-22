package com.codeleaked.algorithm.minimumdominorotations;

public class Solution {

    public int minDominoRotations(int[] A, int[] B) {
        int minRotations = Integer.MAX_VALUE;
        for (int value = 1; value <= 6; ++value) {
            int rotations = 0;
            boolean hasSolution = true;
            for (int i = 0; i < A.length; ++i) {
                if (A[i] != value) {
                    if (B[i] == value) {
                        ++rotations;
                    } else {
                        hasSolution = false;
                        break;
                    }
                }
            }
            if (hasSolution) {
                minRotations = Math.min(minRotations, rotations);
            }

            rotations = 0;
            hasSolution = true;
            for (int i = 0; i < A.length; ++i) {
                if (B[i] != value) {
                    if (A[i] == value) {
                        ++rotations;
                    } else {
                        hasSolution = false;
                        break;
                    }
                }
            }
            if (hasSolution) {
                minRotations = Math.min(minRotations, rotations);
            }
        }

        return minRotations == Integer.MAX_VALUE ? -1 : minRotations;
    }

}
