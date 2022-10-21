package com.leksy.leetcode.easy.middle_of_the_linked_list_876;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

  public static void main(String[] args) {
    middleNode(
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
            new ListNode(5, new ListNode(6, null)))))));
  }

  public static ListNode middleNode(ListNode head) {
    int count = 1;
    ListNode next = head.next;
    while (next != null){
      next = next.next;
      count+=1;
    }
    count = count/2;
    for (int i = 0; i < count; i++) {
      head = head.next;
    }
    return head;
  }
}
