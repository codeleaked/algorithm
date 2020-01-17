package com.codeleaked.algorithm.lrucache;

import java.util.*;

public class LRUCache {

    static class DoubleLinkedNode {
        Integer key;
        Integer value;
        DoubleLinkedNode prev;
        DoubleLinkedNode next;
    }

    private static final int NOT_FOUND = -1;

    private int count;

    private final int capacity;

    Map<Integer, DoubleLinkedNode> cache = new HashMap<>();

    private DoubleLinkedNode head;
    private DoubleLinkedNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new DoubleLinkedNode();
        tail = new DoubleLinkedNode();
        head.next = tail;
        tail.prev = head;
        count = 0;
    }

    private void addNode(DoubleLinkedNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DoubleLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(DoubleLinkedNode node) {
        removeNode(node);
        addNode(node);
    }

    private DoubleLinkedNode popTail() {
        DoubleLinkedNode node = tail.prev;
        removeNode(node);
        return node;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            DoubleLinkedNode node = cache.get(key);
            moveToHead(node);
            return node.value;
        } else {
            return NOT_FOUND;
        }
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            DoubleLinkedNode node = cache.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            DoubleLinkedNode node = new DoubleLinkedNode();
            node.key = key;
            node.value = value;
            cache.put(key, node);
            addNode(node);
            ++count;
            if (count > capacity) {
                DoubleLinkedNode nodeToRemove = popTail();
                cache.remove(nodeToRemove.key);
                --count;
            }
        }
    }

}
