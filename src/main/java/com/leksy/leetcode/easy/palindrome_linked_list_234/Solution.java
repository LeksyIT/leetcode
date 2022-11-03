package com.leksy.leetcode.easy.palindrome_linked_list_234;

class Solution {

  public static void main(String[] args) {
    isPalindrome(
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3,
            new ListNode(2, new ListNode(1, null)))))));
  }

  public static boolean isPalindrome(ListNode head) {

    ListNode right = findRight(head);
    right = reverseList(right);

    while (right != null){
      if (right.val != head.val){
        return false;
      }
      right = right.next;
      head = head.next;
    }
    return true;
  }

  public static ListNode findRight(ListNode head) {
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
