package com.codeleaked.algorithm.topfrequentelements;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencies = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if (frequencies.containsKey(num)) {
                frequencies.put(num, frequencies.get(num) + 1);
            } else {
                frequencies.put(num, 1);
            }
        }

        PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node node, Node other) {
                return Integer.compare(node.frequency, other.frequency);
            }
        });

        for (Map.Entry<Integer, Integer> entry: frequencies.entrySet()) {
            int value = entry.getKey();
            int frequency = entry.getValue();
            if (queue.size() < k) {
                queue.add(new Node(value, frequency));
            } else if (!queue.isEmpty() && queue.peek().frequency < frequency) {
                queue.poll();
                queue.add(new Node(value, frequency));
            }
        }

        List<Integer> output = new ArrayList<>();
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            output.add(node.value);
        }

        return output;
    }

    class Node {
        int value;
        int frequency;

        public Node(int value, int frequency) {
            this.value = value;
            this.frequency = frequency;
        }
    }

}
