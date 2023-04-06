package com.leksy.leetcode.easy.concatenation_of_array_1929;

class Solution {

  public static void main(String[] args) {
    getConcatenation(new int[]{1, 2, 1});
  }

  public static int[] getConcatenation(int[] nums) {
    int[] result = new int[nums.length * 2];
    System.arraycopy(nums, 0, result, 0, nums.length);
    System.arraycopy(nums, 0, result, nums.length, nums.length);
    return result;
  }
}