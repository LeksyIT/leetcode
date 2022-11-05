package com.leksy.leetcode.medium.add_two_numbers_2;

public class Solution {

  public static void main(String[] args) {
    addTwoNumbers(new ListNode(1),new ListNode(9,new ListNode(9,new ListNode(9,
        new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,
            new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null)))))))))))));
  }


  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int counter = 0;
    ListNode sumNode = new ListNode();
    ListNode node = sumNode;
    while (l1 != null || l2 != null) {
      if (l1 != null) {
        counter += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        counter += l2.val;
        l2 = l2.next;
      }
      node.next = new ListNode(counter % 10);
      counter /= 10;
      node = node.next;
    }
    if (counter != 0) {
      node.next = new ListNode(1, null);
    }
    return sumNode.next;
  }
}
