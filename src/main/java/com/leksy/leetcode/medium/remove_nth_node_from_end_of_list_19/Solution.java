package com.leksy.leetcode.medium.remove_nth_node_from_end_of_list_19;

class Solution {

  public static void main(String[] args) {
    ListNode a = removeNthFromEnd(
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
            new ListNode(5, null))))), 4);
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode start = new ListNode(0);
    start.next = head;
    ListNode slow = start;
    ListNode fast = start;

    for (int i = 1; i <= n + 1; i++) {
      fast = fast.next;
    }

    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }

    slow.next = slow.next.next;
    return start.next;
  }
}
