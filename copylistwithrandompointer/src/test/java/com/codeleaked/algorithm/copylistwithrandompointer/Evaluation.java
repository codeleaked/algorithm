package com.codeleaked.algorithm.copylistwithrandompointer;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Node head = solution.copyRandomList(n1);
        assertThat(head.val).isEqualTo(7);
        assertThat(head.random).isNull();
        assertThat(head.next.val).isEqualTo(13);
        assertThat(head.next.random.val).isEqualTo(7);
        assertThat(head.next.next.val).isEqualTo(11);
        assertThat(head.next.next.random.val).isEqualTo(1);
        assertThat(head.next.next.next.val).isEqualTo(10);
        assertThat(head.next.next.next.random.val).isEqualTo(11);
        assertThat(head.next.next.next.next.val).isEqualTo(1);
        assertThat(head.next.next.next.next.random.val).isEqualTo(7);
        assertThat(head.next.next.next.next.next).isNull();
    }

    @Test
    public void test2() {
        Node n1 = new Node(3);
        Node n2 = new Node(3);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        n1.random = null;
        n2.random = n1;
        n3.random = null;

        Node head = solution.copyRandomList(n1);
        assertThat(head.val).isEqualTo(3);
        assertThat(head.random).isNull();
        assertThat(head.next.val).isEqualTo(3);
        assertThat(head.next.random.val).isEqualTo(3);
        assertThat(head.next.next.val).isEqualTo(3);
        assertThat(head.next.next.random).isNull();
        assertThat(head.next.next.next).isNull();
    }
}
