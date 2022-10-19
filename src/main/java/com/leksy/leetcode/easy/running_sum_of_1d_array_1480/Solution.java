package com.leksy.leetcode.easy.running_sum_of_1d_array_1480;

public class Solution {
  public int[] runningSum(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i]+=nums[i-1];
    }
    return nums;
  }
}
