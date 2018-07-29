package com.codeleaked.algorithm.wordladder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        int endWordId = wordList.indexOf(endWord);
        if (endWordId == -1) {
            return new ArrayList<>();
        }

        int n = wordList.size();
        boolean[][] transformable = new boolean[n][n];

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (isTransformable(wordList.get(i), wordList.get(j))) {
                    transformable[i][j] = true;
                    transformable[j][i] = true;
                }
            }
        }

        int[] distance = new int[n];
        int[] prev = new int[n];
        for (int i = 0; i < n; ++i) {
            distance[i] = n + 1;
        }
        distance[endWordId] = 0;
        prev[endWordId] = -1;

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(new Node(endWordId, 0));
        while (!queue.isEmpty()) {
            Node node = queue.pop();
            for (int i = 0; i < n; ++i) {
                if (transformable[node.id][i] && distance[i] > node.distance + 1) {
                    distance[i] = node.distance + 1;
                    prev[i] = node.id;
                    queue.add(new Node(i, node.distance + 1));
                }
            }
        }

        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            if (isTransformable(beginWord, wordList.get(i)) && minDistance > distance[i]) {
                minDistance = distance[i];
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            return new ArrayList<>();
        } else {
            List<List<String>> output = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                if (isTransformable(beginWord, wordList.get(i)) && minDistance == distance[i]) {
                    List<String> chain = new ArrayList<>();
                    chain.add(beginWord);
                    int id = i;
                    while (id != -1) {
                        chain.add(chain.size(), wordList.get(id));
                        id = prev[id];
                    }
                    output.add(chain);
                }
            }
            return output;
        }
    }

    class Node {
        int id;
        int distance;

        public Node(int id, int distance) {
            this.id = id;
            this.distance = distance;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }
    }

    private boolean isTransformable(String word1, String word2) {
        boolean different = false;
        for (int i = 0; i < word1.length(); ++i) {
            if (word1.charAt(i) != word2.charAt(i)) {
                if (different) {
                    return false;
                } else {
                    different = true;
                }
            }
        }

        return true;
    }

}
