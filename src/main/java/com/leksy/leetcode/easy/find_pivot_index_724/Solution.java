package com.leksy.leetcode.easy.find_pivot_index_724;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
  }

  public static int pivotIndex(int[] nums) {
    int left = 0;
    int right = Arrays.stream(nums).sum();
    for (int i = 0; i < nums.length; i++) {
      right -= nums[i];
      if (left == right) {
        return i;
      }
      left += nums[i];
    }
    return -1;
  }
}
