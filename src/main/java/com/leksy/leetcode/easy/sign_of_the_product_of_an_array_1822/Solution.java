package com.leksy.leetcode.easy.sign_of_the_product_of_an_array_1822;

class Solution {

  public int arraySign(int[] nums) {
    int counterMinus = 0;
    for (int i : nums) {
      if (i == 0) {
        return 0;
      }
      if (i < 0) {
        counterMinus++;
      }
    }
    return counterMinus % 2 == 1 ? -1 : 1;
  }
}
