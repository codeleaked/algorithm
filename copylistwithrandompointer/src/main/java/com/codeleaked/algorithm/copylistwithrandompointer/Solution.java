package com.codeleaked.algorithm.copylistwithrandompointer;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Node copyRandomList(Node head) {
        Map<Node, Node> nodeMap = new HashMap<>();

        Node newHead = new Node(0);
        Node newTail = newHead;
        Node current = head;
        while (current != null) {
            Node node = new Node(current.val);
            nodeMap.put(current, node);
            newTail.next = node;
            newTail = node;
            current = current.next;
        }

        current = head;
        while (current != null) {
            if (current.random != null) {
                nodeMap.get(current).random = nodeMap.get(current.random);
            }
            current = current.next;
        }

        return newHead.next;
    }

}
