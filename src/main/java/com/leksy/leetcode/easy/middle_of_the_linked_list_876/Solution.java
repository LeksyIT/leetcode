package com.leksy.leetcode.easy.middle_of_the_linked_list_876;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {

  public static void main(String[] args) {
    middleNode(
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
            new ListNode(5, new ListNode(6, null)))))));
  }

  public static ListNode middleNode(ListNode head) {
    if (head.next == null) {
      return head;
    }
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}
