package com.leksy.leetcode.easy.merge_two_sorted_lists_21;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {

  public static void main(String[] args) {
    ListNode a = mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
        new ListNode(1, new ListNode(3, new ListNode(4))));
    System.out.println(a);
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }
    if (list1.val < list2.val) {
      return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
    } else {
      return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
    }
  }
}
