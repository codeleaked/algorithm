package com.codeleaked.algorithm.addtwonumbers;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int memory = 0;
        while (l1 != null || l2 != null) {
            int value1 = 0;
            int value2 = 0;
            if (l1 != null) {
                value1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                value2 = l2.val;
                l2 = l2.next;
            }
            int sum = value1 + value2 + memory;
            memory = sum / 10;
            ListNode node = new ListNode(sum % 10);
            if (tail == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }

        if (memory > 0) {
            ListNode node = new ListNode(memory);
            tail.next = node;
        }

        return head;
    }
}
