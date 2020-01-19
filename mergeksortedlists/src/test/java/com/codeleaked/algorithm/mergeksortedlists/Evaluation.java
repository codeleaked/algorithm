package com.codeleaked.algorithm.mergeksortedlists;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(5);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;

        ListNode l31 = new ListNode(2);
        ListNode l32 = new ListNode(6);
        l31.next = l32;

        ListNode[] lists = new ListNode[] {
                l11, l21, l31
        };

        ListNode output = solution.mergeKLists(lists);

        assertThat(output.val).isEqualTo(1);
        assertThat(output.next.val).isEqualTo(1);
        assertThat(output.next.next.val).isEqualTo(2);
        assertThat(output.next.next.next.val).isEqualTo(3);
        assertThat(output.next.next.next.next.val).isEqualTo(4);
        assertThat(output.next.next.next.next.next.val).isEqualTo(4);
        assertThat(output.next.next.next.next.next.next.val).isEqualTo(5);
        assertThat(output.next.next.next.next.next.next.next.val).isEqualTo(6);
        assertThat(output.next.next.next.next.next.next.next.next).isNull();
    }

    @Test
    public void test2() {
        ListNode[] lists = new ListNode[0];
        assertThat(solution.mergeKLists(lists)).isNull();
    }

    @Test
    public void test3() {
        ListNode l1 = new ListNode(1);
        ListNode[] lists = new ListNode[] {
                l1,
                null
        };

        ListNode output = solution.mergeKLists(lists);
        assertThat(output.val).isEqualTo(1);
        assertThat(output.next).isNull();
    }

}
