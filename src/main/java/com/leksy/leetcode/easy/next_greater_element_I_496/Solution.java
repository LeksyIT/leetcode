package com.leksy.leetcode.easy.next_greater_element_I_496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

  public static void main(String[] args) {
    nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});
  }


  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    Stack<Integer> queue = new Stack<>();
    for (int i : nums2) {
      while (!queue.isEmpty() && queue.peek() < i) {
        map.put(queue.pop(), i);
      }
      queue.push(i);
    }
    for (int i = 0; i < nums1.length; i++) {
      nums1[i] = map.getOrDefault(nums1[i], -1);
    }
    return nums1;
  }
}
