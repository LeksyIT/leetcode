package com.leksy.leetcode.easy.reverse_linked_list_206;

class Solution {

  //  public static void main(String[] args) {
//    reverseList(
//        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))))));
//  }
  public static void main(String[] args) {
    reverseList(
        new ListNode(1, new ListNode(2, null)));
  }

  public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;

    while (current != null) {
      ListNode next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }
}
