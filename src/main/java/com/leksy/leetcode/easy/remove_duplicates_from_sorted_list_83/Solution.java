package com.leksy.leetcode.easy.remove_duplicates_from_sorted_list_83;

public class Solution {

  public static void main(String[] args) {
    deleteDuplicates(
        new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))));
  }

  public static ListNode deleteDuplicates(ListNode head) {
    ListNode current = new ListNode();
    ListNode prev = current;

    while (head != null) {
      while (head.next != null && head.val == head.next.val) {
        head = head.next;
      }
      prev.next = new ListNode(head.val);
      prev = prev.next;
      head = head.next;
    }
    return current.next;
  }
}
