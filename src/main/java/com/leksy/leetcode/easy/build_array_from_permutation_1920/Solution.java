package com.leksy.leetcode.easy.build_array_from_permutation_1920;

class Solution {

  public static void main(String[] args) {
    buildArray(new int[]{0, 1, 2, 4, 5, 3});
  }

  public static int[] buildArray(int[] nums) {
    aPermutaсtion(nums, 0);
    return nums;
  }
  static void aPermutaсtion(int[] nums, int number){
    if (number< nums.length){
      int index = nums[number];
      int result = nums[index];
      aPermutaсtion(nums,number+1);
      nums[number] = result;
    }
  }
}
