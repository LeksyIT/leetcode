package com.leksy.leetcode.easy.can_make_arithmetic_progression_from_sequence_1502;

import java.util.Arrays;

class Solution {

  public static void main(String[] args) {
    canMakeArithmeticProgression(new int[]{3, 5, 1});
  }

  public static boolean canMakeArithmeticProgression(int[] arr) {
    Arrays.sort(arr);
    int step = arr[1] - arr[0];
    for (int i = 2; i < arr.length; i++) {
      if (arr[i] - arr[i - 1] != step) {
        return false;
      }
    }
    return true;
  }
}
