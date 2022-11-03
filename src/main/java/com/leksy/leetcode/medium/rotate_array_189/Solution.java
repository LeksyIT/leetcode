package com.leksy.leetcode.medium.rotate_array_189;

public class Solution {

  public static void main(String[] args) {
    rotate(new int[]{1,2,3},1);
  }

  public static void rotate(int[] nums, int k) {
    int a = nums.length;
    if (a != 1 && k != 0 && k != a) {
      int[] ans = new int[a];
      System.arraycopy(nums, a - k % a, ans, 0, k % a);
      System.arraycopy(nums, 0, ans, k % a, a - k % a);
      for (int i = 0; i < a; i++) {
        nums[i] = ans[i];
      }
    }
  }
}
