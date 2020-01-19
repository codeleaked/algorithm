package com.codeleaked.algorithm.mergeksortedlists;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    static class Node {
        ListNode node;
        int index;

        public Node(ListNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;

        if (n == 0) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode tail = head;
        PriorityQueue<Node> queue = new PriorityQueue<>(n, Comparator.comparingInt(node -> node.node.val));

        for (int i = 0; i < n; ++i) {
            if (lists[i] != null) {
                queue.add(new Node(lists[i], i));
                lists[i] = lists[i].next;
            }
        }

        while (!queue.isEmpty()) {
            Node smallest = queue.poll();
            tail.next = smallest.node;
            tail = tail.next;
            if (lists[smallest.index] != null) {
                queue.add(new Node(lists[smallest.index], smallest.index));
                lists[smallest.index] = lists[smallest.index].next;
            }
        }

        return head.next;
    }

}
