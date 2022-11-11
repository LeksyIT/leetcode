package com.leksy.leetcode.easy.two_sum_II_input_array_is_sorted_167;

public class Solution {

  public static void main(String[] args) {
    System.out.println(twoSum(new int[]{2, 7, 11, 15},9));
  }

  public static int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    while (left<right) {
      if ((numbers[left] + numbers[right]) > target) {
        right--;
      } else {
        left++;
      }
    }
    return new int[]{left + 1, right + 1};
  }
}
