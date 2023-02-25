package com.leksy.leetcode.hard.merge_k_sorted_lists_23;

public class Solution {

  public static void main(String[] args) {
    mergeKLists(new ListNode[]{new ListNode(1, new ListNode(4, new ListNode(5, null))),
        new ListNode(1, new ListNode(3, new ListNode(4, null)))
        , new ListNode(2, new ListNode(6, null))});
  }

  public static ListNode mergeKLists(ListNode[] lists) {
    ListNode tail = new ListNode(0);
    ListNode dummy = new ListNode();
    dummy.next = tail;
    int min = getMin(lists);
    while (min != Integer.MAX_VALUE) {
      min = getMin(lists);
      tail.next = new ListNode(min, new ListNode());
      tail = tail.next;
    }

    return dummy.next;
  }

  private static int getMin(ListNode[] lists) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < lists.length; i++) {
      ListNode node = lists[i];
      if (node != null && node.val < min) {
        min = node.val;
        lists[i] = node.next;
      }
    }
    return min;
  }
}
