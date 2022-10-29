package com.leksy.leetcode.easy.binary_search_704;

class Solution {

  public static void main(String[] args) {
    System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 0));
  }

  public static int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length-1;
    while (low <= high) {
      int middle = (low + high) / 2;
      if (middle == target) {
        return middle;
      }
      if (middle < target) {
        low = middle + 1;
      } else {
        high = middle - 1;
      }
    }
    return -1;
  }
}
