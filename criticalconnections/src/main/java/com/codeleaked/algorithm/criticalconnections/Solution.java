package com.codeleaked.algorithm.criticalconnections;

import java.util.*;

public class Solution {

    int[] depth;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> output = new ArrayList<>();

        List<Integer>[] graph = buildGraph(n, connections);
        depth = new int[n];
        minDepth(0, -1, 1, graph);

        for (List<Integer> connection: connections) {
            if (depth[connection.get(0)] != depth[connection.get(1)]) {
                output.add(connection);
            }
        }

        return output;
    }

    private int minDepth(int node, int parent, int currentDepth, List<Integer>[] graph) {
        int minDepth = currentDepth;
        depth[node] = currentDepth;
        for (int successor: graph[node]) {
            if (successor != parent) {
                if (depth[successor] == 0) {
                    depth[successor] = minDepth(successor, node, currentDepth + 1, graph);
                }
                minDepth = Math.min(minDepth, depth[successor]);
            }
        }
        return minDepth;
    }

    private List<Integer>[] buildGraph(int n, List<List<Integer>> connections) {
        List<Integer>[] graph = new ArrayList[n];

        for (List<Integer> connection: connections) {
            int u = connection.get(0);
            int v = connection.get(1);

            if (graph[u] == null) {
                graph[u] = new ArrayList<>();
            }
            graph[u].add(v);

            if (graph[v] == null) {
                graph[v] = new ArrayList<>();
            }
            graph[v].add(u);
        }

        return graph;
    }

}
