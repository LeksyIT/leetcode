package com.leksy.leetcode.easy.number_of_good_pairs_1512;

class Solution {

  public static void main(String[] args) {
    numIdenticalPairs(new int[]{1,2,3,1,1,3});
  }

  public static int numIdenticalPairs(int[] nums) {
    int[] arr = new int[101];
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      result+=arr[nums[i]]++;
    }
    return result;
  }
}
