package com.leksy.leetcode.easy.binary_search_704;

class Solution {

  public static void main(String[] args) {
    System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
  }

  public static int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length;
    while (left != right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[mid] > target) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
}
