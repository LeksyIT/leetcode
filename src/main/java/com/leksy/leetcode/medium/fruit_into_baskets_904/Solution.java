package com.leksy.leetcode.medium.fruit_into_baskets_904;

class Solution {

  public static void main(String[] args) {
    totalFruit(new int[]{1, 2, 1});
  }

  public static int totalFruit(int[] fruits) {
    int[] left = new int[2];
    int[] right = {fruits[0], 0};
    int sum = 0;
    int result = 0;
    for (int i = 0; i < fruits.length; i++) {
      int el = fruits[i];
      if (el == right[0]) {
        right[1]++;
      } else {
        if (left[1] == 0 || el == left[0]) {
          sum += left[1];
        } else {
          result = Math.max(sum + left[1] + right[1], result);
          sum = 0;
        }
        left[0] = right[0];
        left[1] = right[1];
        right[0] = el;
        right[1] = 1;
      }
    }
    return Math.max(sum + left[1] + right[1], result);
  }
}
