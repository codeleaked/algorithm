package com.codeleaked.algorithm.allpaths;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int[][] matrix = buildMatrix(graph);

        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);

        visit(0, matrix, path, paths);

        return paths;
    }

    private int[][] buildMatrix(int[][] graph) {
        int n = graph.length;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < graph[i].length; ++j) {
                matrix[i][graph[i][j]] = 1;
            }
        }

        return matrix;
    }

    private void visit(int curNode, int[][] matrix, List<Integer> path, List<List<Integer>> paths) {
        if (curNode == matrix.length - 1) {
            paths.add(path);
        }
        for (int node = 0; node < matrix.length; ++node) {
            if (matrix[curNode][node] == 1) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(node);
                visit(node, matrix, newPath, paths);
            }
        }
    }

}
