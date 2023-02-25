package com.leksy.leetcode.easy.search_insert_position_35;

class Solution {

  public static void main(String[] args) {
    searchInsert(new int[]{1, 3, 5, 6}, 6);
  }

  public static int searchInsert(int[] nums, int target) {
    int right = nums.length - 1;
    int left = 0;
    while (right >= left) {
      int mid = right + (left - right) / 2;
      if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return left;
  }
}
