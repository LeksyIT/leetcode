package com.leksy.leetcode.easy.left_and_right_sum_differences_easy_2574;

import java.util.Arrays;

public class Solution {
  public int[] leftRigthDifference(int[] nums) {
    int left = 0;
    int right = 0;
    int[] answer = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      right+=nums[i];
    }
    for (int i = 0; i < answer.length; i++) {
      answer[i] = Math.abs(left - right);
      left+=nums[i];
      right-=nums[i];
    }
    return answer;
  }
}
