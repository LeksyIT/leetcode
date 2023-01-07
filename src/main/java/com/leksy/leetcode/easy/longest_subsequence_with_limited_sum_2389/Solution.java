package com.leksy.leetcode.easy.longest_subsequence_with_limited_sum_2389;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    answerQueries(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21});
  }

  public static int[] answerQueries(int[] nums, int[] queries) {
    Arrays.sort(nums);
    for (int i = 0; i < queries.length; i++) {
      int counter = 0;
      for (int j = 0; j < nums.length; j++) {
        if (counter + nums[j] <= queries[i]) {
          counter += nums[j];
        } else {
          break;
        }
        if (j == nums.length - 1 && counter + nums[j] <= queries[i]) {

        }
      }
    }
    return queries;
  }
}
