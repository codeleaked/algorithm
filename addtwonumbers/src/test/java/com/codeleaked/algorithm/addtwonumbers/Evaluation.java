package com.codeleaked.algorithm.addtwonumbers;

import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        ListNode list1 = buildListNode(2, 4, 3);
        ListNode list2 = buildListNode(5, 6, 4);

        ListNode sum = solution.addTwoNumbers(list1, list2);

        assertThat(sum.val).isEqualTo(7);
        assertThat(sum.next.val).isEqualTo(0);
        assertThat(sum.next.next.val).isEqualTo(8);
        assertThat(sum.next.next.next).isNull();
    }

    @Test
    public void test2() {
        ListNode list1 = buildListNode(5);
        ListNode list2 = buildListNode(5);

        ListNode sum = solution.addTwoNumbers(list1, list2);

        assertThat(sum.val).isEqualTo(0);
        assertThat(sum.next.val).isEqualTo(1);
        assertThat(sum.next.next).isNull();
    }

    @Test
    public void test3() {
        ListNode list1 = buildListNode(1, 8);
        ListNode list2 = buildListNode(0);

        ListNode sum = solution.addTwoNumbers(list1, list2);

        assertThat(sum.val).isEqualTo(1);
        assertThat(sum.next.val).isEqualTo(8);
        assertThat(sum.next.next).isNull();
    }

    private ListNode buildListNode(int... nums) {
        ListNode tail = null;
        ListNode head = null;

        for (int num: nums) {
            ListNode node = new ListNode(num);
            if (tail == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }

        return head;
    }
}
