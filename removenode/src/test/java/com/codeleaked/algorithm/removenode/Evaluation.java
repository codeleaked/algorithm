package com.codeleaked.algorithm.removenode;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head = solution.removeNthFromEnd(node1, 2);
        assertThat(head.val).isEqualTo(1);
        assertThat(head.next.val).isEqualTo(2);
        assertThat(head.next.next.val).isEqualTo(3);
        assertThat(head.next.next.next.val).isEqualTo(5);
        assertThat(head.next.next.next.next).isNull();
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);

        ListNode head = solution.removeNthFromEnd(node1, 1);
        assertThat(head).isNull();
    }

    @Test
    public void test3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        node1.next = node2;

        ListNode head = solution.removeNthFromEnd(node1, 1);
        assertThat(head.val).isEqualTo(1);
        assertThat(head.next).isNull();
    }
}