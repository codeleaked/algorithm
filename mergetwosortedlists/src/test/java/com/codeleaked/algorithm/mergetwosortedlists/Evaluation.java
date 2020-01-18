package com.codeleaked.algorithm.mergetwosortedlists;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;

        ListNode sum = solution.mergeTwoLists(l11, l21);
        assertThat(sum.val).isEqualTo(1);
        assertThat(sum.next.val).isEqualTo(1);
        assertThat(sum.next.next.val).isEqualTo(2);
        assertThat(sum.next.next.next.val).isEqualTo(3);
        assertThat(sum.next.next.next.next.val).isEqualTo(4);
        assertThat(sum.next.next.next.next.next.val).isEqualTo(4);
        assertThat(sum.next.next.next.next.next.next).isNull();
    }

}
