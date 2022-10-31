package com.leksy.leetcode.easy.squares_of_a_sorted_array_977;

public class Solution {

  public static void main(String[] args) {
    sortedSquares(new int[]{-7,-3,2,3,11});
  }

  public static int[] sortedSquares(int[] nums) {
    int n = nums.length - 1;
    int[] newArr = new int[nums.length];
    int i = 0;
    int j = n;
    for (int k = n; k >= 0; k--) {
      if (Math.abs(nums[i]) < Math.abs(nums[j])) {
        newArr[k] = nums[j] * nums[j];
        j--;
      } else {
        newArr[k] = nums[i] * nums[i];
        i++;
      }
    }
    return newArr;
  }
}
